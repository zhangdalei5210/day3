<%--
  Created by IntelliJ IDEA.
  User: 雷神
  Date: 2020/2/4
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询系统</h1>
<div>
<form action="/students/queryAllStu" method="post" id="fom">
    <div>
        姓名：<input type="text" id="name" name="sname" value="${sname}">
    </div>


        <button type="submit" class="btn btn-success">
            搜索
        </button>

</form>
</div>

<div>
    <table border="1px">
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        </thead>
        <tbady>
            <c:forEach items="${list}" var="student" >
                <tr>
                    <td>${student.id}</td>
                    <td>${student.sname}</td>
                    <td>${student.age}</td>
                </tr>
            </c:forEach>

        </tbady>

    </table>
</div>
</body>
</html>
