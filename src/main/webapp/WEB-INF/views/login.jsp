<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<spring:url value="/css/simple.css" var="style" />
<link rel="STYLESHEET" type="text/css" href="${style}" />
<form action="<c:url value="/login"/>" method="post">
	<table class="framed">
		<tr>
			<td><spring:message code="fieldLabel.username" /></td>
			<td colspan="3"><input type="text" name="username" size="40" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.password" /></td>
			<td colspan="3"><input type="password" name="password" size="40" /></td>
		</tr>
		<tr>
			<td colspan="4">&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
<%-- 			<td><form:button name="submit" type="submit" value="s">
					<img src="/image/button_login.gif" alt="" align="middle">
				</form:button></td>
			<td><form:button name="clear" type="reset" value="r">
					<img src="/image/button_clear.gif" alt="" align="middle">
				</form:button></td> --%>
		</tr>
		<tr><td colspan="2" align="center"> <button id="login">Login</button> </td></tr>
	</table>
</form>
</html>