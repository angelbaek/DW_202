dept(1);
setDept();
function updateDept(){
    $('.update-popup').css('display', 'block');
}

// 전체 부서목록 보여주기
function dept(pageNum){
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/dept?page='+pageNum,
        type : 'GET',            
        dataType : 'json',                    
        success : function(response){    
            $('#data').empty();
            $('.pagination').empty();                          
            console.log(response);
            var html = "";                                
            for(var i=0; i<response.list.length; i++){                           
                html += '<tr onclick = "getDeptByDeptno('+response.list[i].deptno+')"><td>'+response.list[i].deptno+'</td><td>'+response.list[i].dname+'</td><td>'+response.list[i].loc+'</td><td>'+response.list[i].people+'</td></tr>'
                // 사원목록에 사원 데이터 바인딩 (== 사원목록 HTML에 데이터 보여주기)
                // dname이 SALES만 보여주기
                // if(response[i].dname = "SALES"){
                //     html += '<tr><td>'+response[i].empno+'</td><td>'+response[i].ename+'</td><td>'+response[i].job+'</td><td>'+response[i].sal+'</td><td>'+response[i].hiredate+'</td><td>'+response[i].dname+'</td></tr>';
                // }                    
            }
            $("#deptData").append(html); // 바인딩 작업

            
            var paginationHtml = "";
            if(response.hasPreviousPage){ // 이전 버튼 여부 확인
                paginationHtml += '<a onclick="setDept('+(pageNum-1)+')">Previous</a>';
            }            
            for(var i=0; i<response.navigatepageNums.length; i++){ // 총 보여줄 페이지
                var page = response.navigatepageNums[i];
                paginationHtml += '<a onclick="setDept('+page+')">'+page+'</a>'
            }
            if(response.hasNextPage){ // 다음 버튼 여부 확인                
                paginationHtml += '<a onclick="setDept('+(pageNum+1)+')">Next</a>';               
            }            
            $('.pagination').append(paginationHtml); 
        }        
    });
}

// 사원 추가
function setDept(pageNum){
    var deptno = $("#i_deptno").val();
    var dname = $("#i_dname").val();
    var loc = $("#i_loc").val();    
    if(deptno == ""){
        $("#i_deptno").focus();
        return;
    }
    if(dname == ""){
        $("#i_dname").focus();
        return;
    }
    if(loc == ""){
        $("#i_loc").focus();
        return;
    }    
    var jsonData = {
        "deptno" : deptno,
        "dname" : dname,
        "loc" : loc,        
    };        
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/dept',
        type : 'POST',
        contentType : 'application/json',
        dataType : 'json',
        data : JSON.stringify(jsonData),
        success : function(response){                
            if(response > 0){
                alert("부서가 등록되었습니다."); 
                location.reload(); // 자바스크립트에서 제공해주는 새로고침
            } else {
                alert("이미 가입된 부서번호 입니다‼"); 
            }    
        }
    });
}

// 특정 부서 조회 함수
function getDeptByDeptno(deptno){    
    console.log(deptno);
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/dept/deptno/'+deptno,
        type : 'GET',            
        dataType : 'json',            
        success : function(response){   
            $("#u_deptno").val(deptno);         
            $("#u_dname").val(response.dname);
			$("#u_loc").val(response.loc);			
            $('.update-popup').css('display', 'block');
        }
    });
}

// 특정 부서 조회 후 수정
function updateEmp(){
    var deptno = $('#u_deptno').val();
    var dname = $('#u_dname').val();
    var loc = $('#u_loc').val();
    var jsonData = {
        'deptno' : deptno,
        'dname' : dname,
        'loc' : loc,
    }
    $.ajax({
        url : 'http://192.168.0.72:8080/api/v1/dept',
        type : 'PATCH',
        contentType : 'application/json',
        dataType : 'json',
        data : JSON.stringify(jsonData),
        success : function(response){                
            if(response > 0){
                alert("부서정보가 수정되었습니다.");   
                location.reload();                 
            }
        }
    });
}

// 특정 부서 삭제
function deleteDept(){
    var deptno = $("#u_deptno").val();          
    var dname = $("#u_dname").val();          
    if(confirm("정말로 삭제하시겠습니까?")){
        $.ajax({
            url : 'http://192.168.0.72:8080/api/v1/dept/'+deptno,
            type : 'DELETE',            
            dataType : 'json',            
            success : function(response){                
                if(response > 0){
                    alert(dname+"이(가) 삭제되었습니다.");   
                    location.reload();                 
                }
            }
        });
    }
}