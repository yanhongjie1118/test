<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/3/19
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <a href="/springmvc/testSessionAttributes">Test SessionAttributes</a>
  <br><br>

  <a href="/springmvc/testMap">Test Map</a>
  <br><br>


  <a href="/springmvc/testModelAndView">Test ModelAndView</a><br><br>

  <form action="springmvc/testPojo"  method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    email:<input type="text" name="email"/><br>
    age:<input type="text" name="age"/><br>
    city:<input type="text" name="address.city"/><br>
    province:<input type="text" name="address.province"/><br>
    <input type="submit" value="submit"/>
  </form>

<a href="/springmvc/testServletAPI">Test ServletAPI</a>


<form action="/springmvc/testMethod" method="post">
  <input type="submit" value="submit"/>

  <a href="/springmvc/testMethod">Test Method</a></form>
  <br><br>

  <a href="/springmvc/testRequestMapping">Test RequestMapping</a>
  <br><br>

  <a href="helloworld">HelloWorld</a>
  $END$
  </body>
</html>
