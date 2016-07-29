/**
 * Created by Break.D on 7/21/16.
 */

function stateChange(obj) {

    var stat = obj.value;

    if (stat == "working") {
        $(".spe_working").css("display", "table-row");
        $(".spe_educate").css("display", "none");
    } else if (stat == "educated") {
        $(".spe_educate").css("display", "table-row");
        $(".spe_working").css("display", "none");
    } else {
        $(".spe_educate").css("display", "none");
        $(".spe_working").css("display", "none");
    }
}

function addphoto() {
    window.location.href = "../album/gotoAddPhoto";
    
}

function checkpwd() {

    var pwd1 = document.getElementById("pwd1");
    var pwd2 = document.getElementById("pwd2");


    if(!(pwd1.value == pwd2.value)) {
        document.getElementById("error").innerHTML = "<span class='error'>密码前后不一致,请重新输入</span>";
      return false;
    }
}