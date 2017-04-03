<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/4/3
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--1.为什么使用form 标签
 可以更快速的开发出表单页面，而且可以更方便的进行表单值的回显
 2.可以通过modelAttribute属性指定绑定的模型属性
 若没有指定该属性，则默认从request域对象中读取command的表单bean,如果该属性值也不存在，则会发生错误-->
<form:form action="emp" method="POST" modelAttribute="employee"><!-- 这个employee跟EmployeeHandler.java里
                                                             map.put("employee",new Employee());的employee属性值相同-->
    <!--path 属性对应html表单标签的name属性值-->
    LastName:<form:input path="lastName"/>
    <br>
    Email:<form:input path="email"/>
    <br>

    <%
        Map<String,String> genders = new HashMap();
        genders.put("1","Male");
        genders.put("0","Female");

        request.setAttribute("genders",genders);
    %>
    Gender:<form:radiobuttons path="gender" items="${genders}"/>
    <br>
    Department:<form:select path="department.id"
                            items="${departments}" itemLabel="departmentName" itemValue="id">
</form:select>
    <br>

    <input type="submit" value="Submit">
</form:form>


</body>
</html>
