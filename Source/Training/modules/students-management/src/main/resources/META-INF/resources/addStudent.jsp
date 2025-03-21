 
 <%@ include file="init.jsp" %>
 

<portlet:actionURL name="<%=StudentsManagementPortletKeys.ADDING_URL %>" var="addStudentURL" />

<h2>Add Student</h2>

<aui:form action="${addStudentURL}" method="post">
    <aui:fieldset>
         <%-- <aui:input name="studentId" type="hidden" value="${student.getStudent_Id()}" /> --%>
         <aui:input name="groupId" type="hidden" value="${themeDisplay.scopeGroupId}" />
         <aui:input name="companyId" type="hidden" value="${themeDisplay.companyId}" />
         <aui:input name="userId" type="hidden" value="${themeDisplay.userId}" />
         <aui:input name="userName" type="hidden" value="${themeDisplay.user.fullName}" />
         
        <aui:input type="text" name="studentId" label="Student ID" required="true" />

        <aui:input type="text" name="studentName" label="Student Name" required="true" />

        <aui:input type="text" name="departmentId" label="Department ID" required="true" />
        
        <aui:button type="submit" value="Add Student" cssClass="btn btn-success" />
        <aui:button type="button" value="Cancel" onClick="window.history.back();" cssClass="btn btn-secondary" />
    </aui:fieldset>
</aui:form>
 