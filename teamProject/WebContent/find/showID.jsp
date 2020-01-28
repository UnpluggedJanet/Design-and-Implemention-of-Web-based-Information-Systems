<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic" prefix="logic" %>
<html:html>
<head>
 <title>아이디찾음</title>
</head>
<body>
<logic:present scope="session" name="membername">
 <font color="red"><bean:write name="membername" property="name"/>님의 아이디는<bean:write name="memberid" property="id"/>입니다.</font>
</logic:present>
<p>
 <html:link forward="login">로그인하기</html:link>   
</body>
</html:html> 