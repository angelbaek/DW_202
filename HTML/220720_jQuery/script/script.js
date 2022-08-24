$(document).ready(function(){

    $("#dish li").click(function(){
        $(this).hide();
    });
    $("#redish").click(function(){
        $("#dish li").show();
    });

    $("#box1").mouseenter(function(){
        $(this).text("마우스 치워라!!!");
        $(this).css("background-color","red");
        $(this).css("color","white");
        $(this).css("font-size","2em");
    });
    $("#box1").mouseleave(function(){
        $(this).text("다시 올려라.");
        $(this).css("background-color","yellow");
        $(this).css("color","black");
        $(this).css("font-size","1em");
    });

    $("#btn2").click(function(){
        // $("#box3").hide("fade");
        // $("#box3").fadeOut(500);
        $("#box3").slideUp(500);
    });
    $("#btn3").click(function(){
        // $("#box3").show();
        // $("#box3").fadeIn(500);
        $("#box3").slideDown(500);
    });

    $("#btn4").click(function(){
        $("#box3").text("람보르기니");
        $("#box3").css("background-color","red");
        $("#box3").css("color","white");
        $("#box3").css("font-size","2em");
    });
    $("#btn5").click(function(){
        $("#box3").text("아반떼");
        $("#box3").css("background-color","yellow");
        $("#box3").css("color","black");
        $("#box3").css("font-size","1em");
    });

    $(".main").mouseenter(function(){
        $(this).children(".sub").stop().slideDown();
    });
    $(".main").mouseleave(function(){
        $(this).children(".sub").stop().slideUp();
    });

    $("#btn6").click(function(){
        $("#box4").slideUp(3000, "swing", function(){
            alert("박스가 사라짐");
        }); /* <----콜백함수 */

        // setTimeout(function(){
        //     alert("박스가 사라짐");
        // },3000);
    });

    var aaa = $("#para1").text(); 
    /* .html 태그를 사용하면 html문법 사용가능 
    ex) <b></b> 따위 것들 */
    // alert(aaa);

    // var aaaa = $("#input1").val();
    $("input[name='car']").click(function(){
        var car = $(this).val();
        if(car == 1){
            $("#car_price").show();
        }
        else{
            $("#car_price").hide();
        }
    });

    $("#pw1").keyup(function(){
        var len = $(this).val().length;
        if(len == 0){
            $("#pw2").attr("disabled","disabled");
        }
        else{
            $("#pw2").removeAttr("disabled");
        }
    });
    $("#pw1, #pw2").keyup(function(){
        var pw1 = $("#pw1").val();
        var pw2 = $("#pw2").val();
        if(pw1 == pw2){
            $("#pwChk").text("비밀번호가 일치합니다.").css({
                color:"green",
                fontWeight:"normal"
            });/* attr("style","color:green");; */
            // $("#pwChk").css("color","green");
            // $("#pwChk").attr("style","color:green");
        }
        else{
            $("#pwChk").text("비밀번호가 틀립니다.").css({
                color:"red", 
                fontWeight:"bold"
            })
            // $("#pwChk").attr("style","color:red");
        }
    });
    var num = 0;
    $("#btn7").click(function(){
        num++;
        $("#list1").append("<input type='text' placeholder='참가자성명"+num+"'/>");
    });
    $("#btn8").click(function(){
        $("#list1 input:last-of-type").remove();
    });
    $("#btn9").click(function(){
        // $("#box5").attr("class","");
        $("#box5").removeClass("blue");
    });
    $("#btn10").click(function(){
        // $("#box5").attr("class","blue");
        $("#box5").addClass("blue");
    });


    $("#box6").click(function(){
        // var w = $(this).width();
        // var h = $(this).height();
        // alert(w+"px,"+h+"px");        
        $(this).width(500);
        $(this).height(500);
    });

    // $(window).resize(function(){
    //     var w = $(this).width();
    //     var h = $(this).height();
    //     $("#para2").text(w+","+h);
    // });

    // function chkWin(){
    //     var h = $(this).height();
    //     $("#box7").height(h);
    // }

    // chkWin();

    // $(window).resize(function(){chkWin();});

    $("#roha").parent().parent(); // 부모의 부모

    $("#sunjae").parent().sibings(); // 부모의 형제들

    $("#sunjae").next(); // 다음(동생)
    $("#sunjae").prev(); // 이전(형)

    $("#sunjae>div:nth-of-type(2)") // 2번째
    $("#sunjae").eq(1); // 0번째부터 시작함.
});