<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean" prefix="bean" %>
<html>
<head>
<title>���̵�ã��</title>
</head>

<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<p> <font size="3" face="����ü" color="blue"><b>���̵�ã�� </b></font></p>

<html:errors/>
<html:form action="/action/findID"> 
<bean:write name="findIDBean" property="warning" filter="false"/> <p>
<table border="1" width="300" cellspacing="0" bordercolor="#CCCCFF" style=" height : 119px;">
    <tr>
        <td width="110"><p align="center">ȸ���̸�</td>
        <td width="190" height="40">&nbsp;&nbsp;
       <html:text property="memberName" size="15" maxlength="15"/>&nbsp;&nbsp;&nbsp;
   
     </td>
    </tr>
    <tr>
        <td width="110">&nbsp;&nbsp;ȸ�����Խ�<br> ����� �̸���</td>
        <td width="190" height="40">&nbsp;&nbsp;
       <html:text property="memberEmail" size="30" maxlength="30"/>
     </td>
     </tr>
    <tr>
         <td width="300" colspan="2" height="40">  <p align="center"> 
      <html:submit value="ã��"/> &nbsp;&nbsp;
      <html:reset  value="�� ��"/>
            </td>
    </tr>
</table>
</html:form>
</body>
</html>

