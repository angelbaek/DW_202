getStatistics(); // 함수 호출
doSelectAll(1);

// 사원 통계정보 불러오기
function getStatistics(){
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/emp/Statistics',
        type : 'GET',            
        dataType : 'json',            
        success : function(response){              
            console.log(response);
            $("#studentsCnt").append(response.empCount); // 사원 수
            $("#boardCnt").append(response.empSalAvg); // 평균 급여
            $("#writerCnt").append(response.deptCount); // 부서 수
            $("#viewsCnt").append(response.empCommSum); // 보너스 합
        }
    });
}

// 사원 추가
function setEmp(){
    var empno  = $("#i_empno").val();
    var ename = $("#i_ename").val();
    var job = $("#i_job").val();
    var sal = $("#i_sal").val();
    var comm = $("#i_comm").val();        
    var deptno = $("#i_deptno").val(); 
    if(empno == ""){
        $("#i_empno").focus();
        return;
    }
    if(ename == ""){
        $("#i_ename").focus();
        return;
    }
    if(job == ""){
        $("#i_job").focus();
        return;
    }
    if(sal == ""){
        $("#i_sal").focus();
        return;
    }
    if(comm == ""){
        $("#i_comm").focus();
        return;
    }
    if(deptno == ""){
        $("#i_deptno").focus();
        return;
    }
    var jsonData = {
        "empno" : empno,
        "ename" : ename,
        "job" : job,
        "sal" : sal,
        "comm" : comm,
        "deptno" : deptno,
    };        
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/emp',
        type : 'POST',
        contentType : 'application/json',
        dataType : 'json',
        data : JSON.stringify(jsonData),
        success : function(response){                
            if(response > 0){
                alert("사원이 등록되었습니다."); 
                location.reload(); // 자바스크립트에서 제공해주는 새로고침
            } else {
                alert("이미 가입된 사원번호 입니다‼"); 
            }
        }
    });
}


// 전체사원 목록 보여주기
function doSelectAll(pageNum){        
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/emp?page='+pageNum,
        type : 'GET',            
        dataType : 'json',                    
        success : function(response){  
            $('#data').empty();
            $('.pagination').empty();                  
            console.log(response);
            var html = "";                                
            for(var i=0; i<response.list.length; i++){                 
                html += '<tr onclick = "getEmpByEmpno('+response.list[i].empno+')"><td>'+response.list[i].empno+'</td><td>'+response.list[i].ename+'</td><td>'+response.list[i].job+'</td><td>'+response.list[i].sal+'</td><td>'+response.list[i].hiredate+'</td><td>'+response.list[i].부서이름+'</td></tr>';                
                // 사원목록에 사원 데이터 바인딩 (== 사원목록 HTML에 데이터 보여주기)
                // dname이 SALES만 보여주기
                // if(response[i].dname = "SALES"){
                //     html += '<tr><td>'+response[i].empno+'</td><td>'+response[i].ename+'</td><td>'+response[i].job+'</td><td>'+response[i].sal+'</td><td>'+response[i].hiredate+'</td><td>'+response[i].dname+'</td></tr>';
                // }                    
                
            }
            $("#data").append(html); // 바인딩 작업

            var paginationHtml = "";
            if(response.hasPreviousPage){ // 이전 버튼 여부 확인
                paginationHtml += '<a onclick="doSelectAll('+(pageNum-1)+')">Previous</a>';
            }            
            for(var i=0; i<response.navigatepageNums.length; i++){ // 총 보여줄 페이지
                var page = response.navigatepageNums[i];
                paginationHtml += '<a onclick="doSelectAll('+page+')">'+page+'</a>'
            }
            if(response.hasNextPage){ // 다음 버튼 여부 확인                
                paginationHtml += '<a onclick="doSelectAll('+(pageNum+1)+')">Next</a>';               
            }            
            $('.pagination').append(paginationHtml);            
        }        
    });
}

// 특정 사원 조회 함수
function getEmpByEmpno(empno){    
    console.log(empno);
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/emp/empno/'+empno,
        type : 'GET',            
        dataType : 'json',            
        success : function(response){   
            $("#u_empno").val(empno);         
            $("#u_ename").val(response.ename);
			$("#u_job").val(response.job);
			$("#u_sal").val(response.sal);
			$("#u_comm").val(response.comm);
           $('.update-popup').css('display', 'block');
        }
    });
}

// 특정 사원 조회 후 수정
function updateEmp(){
    var empno = $('#u_empno').val();
    var ename = $('#u_ename').val();
    var job = $('#u_job').val();
    var sal = $('#u_sal').val();
    var comm = $('#u_comm').val();
    var jsonData = {
        'empno' : empno,
        'ename' : ename,
        'job' : job,
        'sal' : sal,
        'comm' : comm,
    }
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/emp',
        type : 'PATCH',
        contentType : 'application/json',
        dataType : 'json',
        data : JSON.stringify(jsonData),
        success : function(response){                
            if(response > 0){
                alert("사원정보가 수정되었습니다.");   
                location.reload();                 
            }
        }
    });
}

// 특정 사원 조회 후 삭제
// 데이터는 곧 자산
// 실제로 기업에서는 데이터를 삭제하지 않고, 삭제 여부 컬럼을 추가해서
// 탈퇴한 회원은 Y 현재 회원은 N으로 관리한다.
function updateIsUse(){
    var empno = $("#u_empno").val();    
    var ename = $("#u_ename").val();    
    if(confirm("정말로 삭제하시겠습니까?")){
        $.ajax({
            url : 'http://192.168.0.72:8080/api/v1/emp/isUse/'+empno,
            type : 'PATCH',            
            dataType : 'json',            
            success : function(response){                
                if(response > 0){
                    alert(ename+"님이 삭제되었습니다.");   
                    location.reload();                 
                }
            }
        });
    }
}


function downloadExcelFile(){
    console.log("excel download 버튼 클릭")
    location.href = "http://192.168.0.72:8080/excel/download";
}