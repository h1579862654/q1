<%@ page import="com.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: sanjiu huang
  Date: 2021/5/28
  Time: 11:26 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>主页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <script src="/js/jquery_3.5.1.js"></script>
    <script src="/js/myJs.js"></script>
</head>
<body>
<c:set var="user" value="${sessionScope.user}"/>
<!-- cropper.js裁剪图片 -->
<div class="container">
    <div class="row">
        <div class="col-lg-6 col-md-12">
            <div class="index-form mb-30">
                <div class="xx">

                    <c:choose>
                        <c:when test="${user.head!=null}">
                            <img src="${user.head}" class="circleImg">
                        </c:when>
                        <c:otherwise>
                            <img src="/img/tx.jpeg" class="circleImg">
                        </c:otherwise>
                    </c:choose>

                        <c:choose>
                            <c:when test="${user.name!=null}">
                                <label class="h" ><c:out value="${user.name}"/></label>
                            </c:when>
                            <c:otherwise>
                                <label class="h" >用户<c:out value="${user.phone}"/></label>
                            </c:otherwise>
                        </c:choose>
                    <br>
                        <c:choose>
                            <c:when test="${user.signature!=null}">
                                <label class="m"><c:out value="${user.signature}"/> </label>
                            </c:when>
                          <c:otherwise>
                                   <label class="m"> 编辑个性签名 </label>
                                 </c:otherwise>
                        </c:choose>
                </div>
                <div class="gn">
                    <ul class="nav">
                        <c:forEach  items="${requestScope.funs}"  var="fun">

                        <li class="nav-item">
                            <a class="nav-link active" href="${fun.url}">
                                <h4>${fun.name}</h4>
                            </a>
                        </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>

        </div>
    </div>
</div>

</body>

</html>

