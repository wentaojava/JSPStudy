<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="/lhh-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<!--2.JSTL标签  -->
<!--2.1 if标签  -->
<p>性别：
<c:if test="${stu.sex=='m' }">男</c:if>
<c:if test="${stu.sex=='f' }">女</c:if>
</p>
<!--2.2 choose标签  -->
<p>性别：
<c:choose>
	<c:when test="${stu.sex=='m' }">男</c:when>
	<c:otherwise>女</c:otherwise>
</c:choose>
</p>
<!--2.3 forEach标签  -->
<p>兴趣：
<c:forEach var="I" items="${stu.interes }">
${I }
</c:forEach>
</p>

<!--1.EL表达式  -->
<!--1.1访问Bean的属性  -->
<p>姓名：${stu.name }</p>
<p>年龄：${stu["age"] }</p>
<p>课程：${stu.course.ID }</p>
<p>性别：${requestScope.stu.sex }</p>
<!--1.2支持运算  -->
<p>年龄加3：${stu.age+3}</p>
<p>判断年龄是不是在20到30之间：${stu.age>20 && stu.age<30 }</p>
<p>是否为空：${empty stu.interes }</p>
<!--1.3获取请求参数，运行时在地址栏键入参数  -->
<p>获取的请求参数：${param.user }</p>

<!--自定义标签  -->
<p>
 <s:sysdate format="yyyy-MM-hh"/>
</p>
</body>
</html>