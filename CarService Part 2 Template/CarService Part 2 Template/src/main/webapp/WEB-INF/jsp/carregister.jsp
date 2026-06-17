<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<h1>${FailMessage}</h1>

<h1>This is the signup page</h1>
<form:form action="done" modelAttribute="car">
    Car Number:
    <form:input path="RegisterationNumber"  /><br/>
    Car Name:
    <form:select path="CarName">
        <form:option value="Seltos"></form:option>
        <form:option value="Kia 2"></form:option>
    </form:select><br/>
    Covered in Warranty:
    <form:select path="CarDetails">
        <form:option value="Yes"></form:option>
        <form:option value="No"></form:option>
    </form:select>
    Any Remarks:
    <form:input path="CarWork" /><br/>

    <input type="submit">

</form:form>
</html>
