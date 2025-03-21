<%@ include file="/init.jsp" %>

<portlet:renderURL var="listStudentsURL">
    <portlet:param name="mvcRenderCommandName" value="<%= StudentsManagementPortletKeys.VIEW_URL%>"/>
</portlet:renderURL>

<portlet:renderURL var="addStudentsURL">
    <portlet:param name="mvcRenderCommandName" value="<%= StudentsManagementPortletKeys.ADDING_URL %>"/>
</portlet:renderURL>

<div class="container mt-4 text-center">
    <h2 class="mb-4">Student Management</h2>

    <aui:form>
        <div class="d-grid justify-content-center  gap-3 mb-10">
            <aui:a href="${listStudentsURL}" cssClass="btn btn-primary btn-lg mb-3">
                <i class="fas fa-list"></i> View Students
            </aui:a>

            <aui:a href="${addStudentsURL}" cssClass="btn btn-success btn-lg">
                <i class="fas fa-user-plus"></i> Add Students
            </aui:a>
        </div>
    </aui:form>
</div>

<!-- FontAwesome Icons (If not included in Liferay Theme) -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
