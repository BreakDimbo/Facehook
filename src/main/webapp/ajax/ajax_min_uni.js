/**
 *
 * Created by Break.D on 7/23/16.
 */

var xmlRequest;
function createXMLHttpRequest() {
    if (window.ActiveXObject) {
        xmlRequest = new ActiveXObject("Microsoft.XMLHTTP");
    } else {
        xmlRequest = new XMLHttpRequest();
    }
}



function getCity() {

    //判断请求状态
    if (xmlRequest.readyState == 4 && xmlRequest.status == 200) {

        //获取数据
        var cities = xmlRequest.responseXML.getElementsByTagName("city");



        //拼字符串
        var res = "<form:select id=\"citySEL\" path=\"homeCity\">";

        for (var i = 0; i < cities.length; i++) {
            res += "<option value=\"" + cities[i].getElementsByTagName("id")[0].childNodes[0].nodeValue + "\">" +
                cities[i].getElementsByTagName("name")[0].childNodes[0].nodeValue + "</option>"
        }
        res += "</form:select>";


        //输出到前端

        document.getElementById("citySEL").innerHTML = res;
    }

}

function setCity(o) {
    //创建请求
    createXMLHttpRequest();

    if (xmlRequest) {
        //传递参数
        var req = "../changeInfo?pcid=" + o.value;

// window.alert(req);

        //打开连接
        xmlRequest.open("get", req, true);

        //回调
        xmlRequest.onreadystatechange = getCity;

        //发送请求
        xmlRequest.send();

    }


}


function setProUnis(o) {

    createXMLHttpRequest();

    if (xmlRequest) {
        //传递参数
        var req = "../changeInfo?pid=" + o.id + "&cid=" + o.name;

// window.alert(req);

        //打开连接
        xmlRequest.open("get", req, true);

        //回调
        xmlRequest.onreadystatechange = getUniPro;

        //发送请求
        xmlRequest.send();
    }
}


function getUniPro() {
    

    //判断状态码
    if (xmlRequest.readyState == 4 && xmlRequest.status == 200) {

        //获取 xml 数据
        var received = xmlRequest.responseXML.getElementsByTagName("unit");

        //拼字符串
        var send = "<table width='100%'><tr>";

        //注意获取元素值的方式
        for (var i = 0; i < received.length; i++) {
            send += "<td><li><a onclick='showMyUni(this)' href='javascript:void(0);' " +
                "class='xh' id=\"" + received[i].getElementsByTagName("id")[0].childNodes[0].nodeValue + "\">" + received[i].getElementsByTagName("name")[0].childNodes[0].nodeValue + "</a></li></td>";
            if (i % 3 == 0) {
                send += "</tr><tr>";
            }
        }

        send += "</tr></table>";

        //替换客户端内容
        document.getElementById("uniTbl").innerHTML = send;

    }

}

function setCoUnis(o) {

    createXMLHttpRequest();

    if (xmlRequest) {
        var req = "../changeInfo?cuid=" + o.id;

        xmlRequest.open("get", req, true);

        xmlRequest.onreadystatechange = getCoUnis;

        xmlRequest.send();
    }
}

function getCoUnis() {
    if (xmlRequest.readyState == 4 && xmlRequest.status == 200) {
        var info = xmlRequest.responseXML.getElementsByTagName("allInfo");
        var pro = info[0].getElementsByTagName("pro");
        var uni = info[0].getElementsByTagName("unit");

        /*      window.alert(pro[0].getElementsByTagName("id")[0].childNodes[0].nodeValue);
         window.alert(uni[0].getElementsByTagName("id")[0].childNodes[0].nodeValue);*/

        //拼省字符串
        var result = "<table width='100%'><tr><td>";


        for (var i = 0; i < pro.length; i++) {
            result += "<a onclick='setProUnis(this)' href='javascript:void(0);' class='xh' id=\"" + pro[i].getElementsByTagName("id")[0].childNodes[0].nodeValue + "\" name=\"" + pro[i].getElementsByTagName("countryId")[0].childNodes[0].nodeValue + "\">" + pro[i].getElementsByTagName("name")[0].childNodes[0].nodeValue + "</a>"
        }

        result += "</td></tr></table>";

        document.getElementById("proTbl").innerHTML = result;


        //拼大学字符串
        var send = "<table width='100%'><tr>";

        //注意获取元素值的方式
        for (var i = 0; i < uni.length; i++) {
            send += "<td><li><a onclick='showMyUni(this)' href='javascript:void(0);' " +
                "class='xh' id=\"" + uni[i].getElementsByTagName("id")[0].childNodes[0].nodeValue + "\">" + uni[i].getElementsByTagName("name")[0].childNodes[0].nodeValue + "</a></li></td>";
            if (i % 3 == 0) {
                send += "</tr><tr>";
            }
        }

        send += "</tr></table>";

        //替换客户端内容
        document.getElementById("uniTbl").innerHTML = send;

    }

}

function showTable() {
    $("#uniDiv").css("display", "block");
}

function closeUniTbl(o) {
    var element = document.getElementById("uniDiv");
    element.style.display = "none";
}

function showMyUni(o) {
    $("#university").val(o.innerHTML);
    $("#uniDiv").css("display", "none");
    $("#universityid").val(o.id);

}