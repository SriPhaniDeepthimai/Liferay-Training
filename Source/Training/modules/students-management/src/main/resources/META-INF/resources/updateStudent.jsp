<%@ include file="/init.jsp" %>

<portlet:actionURL var="updateStudentURL" name="<%=StudentsManagementPortletKeys.UPDATE_URL %>">
    <portlet:param name="studentId" value="${student.getStudent_Id()}"/>
</portlet:actionURL>

<div class="container mt-4">
    <h2 class="text-center mb-4">Update Student</h2>

    <aui:form action="${updateStudentURL}" method="post" name="updateStudentForm">
        <aui:input  name="studentId" value="${student.getStudent_Id()}"/>

        <aui:fieldset>
            <aui:input name="studentName" label="Student Name" type="text" value="${student.getStudent_Name()}" required="true"/>

            <aui:input name="departmentId" label="Department ID" type="text" value="${student.getDepartment_Id()}" required="true"/>

            <div class="d-flex justify-content-between mt-4">
                <aui:button type="submit" value="Update Student" cssClass="btn btn-primary"/>
                <aui:button type="button" value="Cancel" cssClass="btn btn-secondary" onClick="window.history.back();"/>
            </div>
        </aui:fieldset>
    </aui:form>
</div>

<!-- Bootstrap Icons (if needed) -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
