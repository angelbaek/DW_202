$(document).ready(function(){
    $("#ham").click(function(){
        $("body").css("overflow","hidden");
        $("#backDrop").fadeIn();
        $("#menu").css("right","0px");
    });
    $("#close, #backDrop").click(function(){
        $("#backDrop").fadeOut();
        $("body").css("overflow","auto");
        $("#menu").css("right","-300px");
        $(".sub").slideUp();
    });
    $(".main").click(function(){
        var visi = $(this).children(".sub").is(":visible");
        if(visi)
        {
            $(this).children(".sub").slideUp();
            $(this).children("a").children("i").removeClass("rev");
        }
        else
        {
            $(this).children(".sub").slideDown();
            $(this).children("a").children("i").addClass("rev");
        }
        // $(this).children(".sub").slideToggle();               
        $(this).siblings().children(".sub").slideUp(); 
        $(this).siblings().children("a").children("i").removeClass("rev");
    });
});