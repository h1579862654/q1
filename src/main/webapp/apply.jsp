<%--
  Created by IntelliJ IDEA.
  User: Ztz
  Date: 2021/6/1
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery_3.5.1.js"></script>
    <script type="text/javascript" src="/js/haimin/buttonTime.js"></script>
    <script type="text/javascript">
        var data;

        function loadXMLDoc(dat)
        {
            // if ($("td").length!=0){
            //     console.info("终止函数");
            //     return false;
            // }
            disable(dat,60000);
            $.ajax({
                url: "/apply?d=ajax",
                context: document.body,
                success: function(result){
                    data = JSON.parse(result);// data = eval('(' + result + ')');
                    var html = "<th>序列</th><th>姓名</th><th>电话</th><th>类型</th>\n" + "  <th>申请备注</th><th>审批备注</th><th>申请时间</th><th>审批时间</th>\n" +" <th>0正常1注销2审核中3拒绝</th><th colspan=\"2\">状态</th>";
                         for(var i=0;i<data.length;i++){    //遍历data数组
                             console.info(data[i].iid+"接受到");
                             switch (data[i].type) {
                                 case 1:type="学校申请驻入";break;
                                 case 2:type="学生申请";break;
                                 case 3:type="员工申请";break;
                                 case 4:type="老师申请";break;
                             }
                             if (typeof(data[i].lasttime)=="undefined") {
                                 lasttime = ' ';
                             }else {
                                 lasttime = data[i].lasttime;
                             }
                             Button1="<button type=\"button\" disabled=\"false\" onclick=\"button2()\""+">通过</button>";
                             Button2="<button type=\"button\" disabled=\"false\" onclick=\"button2()\""+">拒绝</button>";
                             switch (data[i].state) {
                                 case 1:state="注销";break;
                                 case 2:state="审核中";tem1 = 'a'+data[i].id; tem2 = 'b'+data[i].id;
                                     Button1="<button id=\"a"+data[i].id+"\""+" type=\"button\" onclick=\"button2(\'"+tem1+"\',\'"+data[i].id+"\',\'"+data[i].type+"\',\'"+data[i].iid+"\',\'"+data[i].state+"\','button1')\""+">通过</button>";
                                     Button2="<button id=\"b"+data[i].id+"\""+" type=\"button\" onclick=\"button2(\'"+tem2+"\',\'"+data[i].id+"\',\'"+data[i].type+"\',\'"+data[i].iid+"\',\'"+data[i].state+"\','button2')\""+">拒绝</button>";
                                 break;
                                 case 3:state="拒绝";break;
                                 case 0:state="正常";break;
                             }
                                    html +="<tr>" +
                                        "<td>"+data[i].id+"</td><td class='date'>"+data[i].name+"</td>" +
                                        "<td>"+data[i].phone+"</td><td class='date'>"+type+"</td>" +
                                        "<td>"+data[i].note+"</td><td class='date'>"+data[i].snote+"</td>" +
                                        "<td>"+data[i].starttime+"</td><td class='date'>"+lasttime+"</td>" +
                                        "<td>"+state+"<td>"+Button1+"</td><td class='date'>"+Button2+"</td>" +
                                        "</tr>";
                                }
                            document.getElementById("apply").innerHTML = html;
                            // $("#apply").html(html); //在html页面id=apply的标签里显示html内容
                }});
        }
        function button2(temp1,temp2,temp3,temp4,temp5,temp6) {
            t1 = datetime();
            disable(temp1,3000);
            $.ajax({
                url: "/applyrefuse",
                data:{
                    key: temp2,
                    time:t1,
                    type:temp3,
                    iid:temp4,
                    state:temp5,
                    butto:temp6
                },
                context: document.body,
                success: function(result){
                    if (result==1){
                        $('#tt').html("成功");
                        setTimeout(function() {
                            $("#tt").html("");
                            loadXMLDoc();
                        }, 3000);
                    }
                }
            })
        }
    </script>
</head>
<body>
    <h3 id="tt"></h3>
    <div id="myDiv"><h3>Application Employee list School list Student list</h3></div>
    <button id="a" type="button" onclick="loadXMLDoc('a')">Show Contents</button>
    <table border="1" id="apply">
    </table>
</body>
</html>
