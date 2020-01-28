<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic" prefix="logic" %>
<html:html>
<head>
 <title>패스워드찾음</title>
</head>
<body>
<logic:present scope="session" name="memberid">
 <font color="red"><bean:write name="memberid" property="id"/>님의 패스워드는<bean:write name="memberpassword" property="password"/>입니다.</font>
</logic:present>
<p>
 <html:link forward="login">로그인하기</html:link>   
</body>
</html:html> 