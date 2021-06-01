function jingz(a) {
    $("#"+a).attr("disabled", true);
    $("#"+a).css({'background-color' : 'gray'});
    //恢复按钮
    setTimeout(function() {
        $("#"+a).attr("disabled", false);
        $("#"+a).css({'background-color' : ''});
    }, 2000);
}