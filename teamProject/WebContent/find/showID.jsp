<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic" prefix="logic" %>
<html:html>
<head>
 <title>���̵�ã��</title>
</head>
<body>
<logic:present scope="session" name="membername">
 <font color="red"><bean:write name="membername" property="name"/>���� ���̵��<bean:write name="memberid" property="id"/>�Դϴ�.</font>
</logic:present>
<p>
 <html:link forward="login">�α����ϱ�</html:link>   
</body>
</html:html> 