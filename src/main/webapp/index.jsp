<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <p><jsp:include page="chooseLanguage.jsp" /></p>

        <fmt:bundle basename="Message">
 
        <p>
            <fmt:message key="navn1"/>
        <p>
            <fmt:message key="beskrivelse1"/>
        </p>
        
         <p>
            <fmt:message key="navn2"/>
        <p>
            <fmt:message key="beskrivelse2"/>
        </p>
     
    </fmt:bundle>
 
     

</body>
</html>