package com.students.web.management.portlet;

import com.Students.Details.service.DetailsLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.students.web.management.constants.StudentsManagementPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {
        "javax.portlet.name=" +StudentsManagementPortletKeys.STUDENTSMANAGEMENT,
        "mvc.command.name="+StudentsManagementPortletKeys.ADDING_URL
    },
    service = MVCActionCommand.class
)
public class StudentsAddingMVCActionCommand implements MVCActionCommand {

    private static final Log _log = LogFactoryUtil.getLog(StudentsAddingMVCActionCommand.class);

    @Reference
    private DetailsLocalService _detailsLocalService;

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        try {
            // Retrieve form parameters
            int studentId = ParamUtil.getInteger(actionRequest, "studentId");
            String studentName = ParamUtil.getString(actionRequest, "studentName");
            int departmentId = ParamUtil.getInteger(actionRequest, "departmentId");
            
         // Inside processAction
            ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

            long groupId = themeDisplay.getScopeGroupId();
            long companyId = themeDisplay.getCompanyId();
            long userId = themeDisplay.getUserId();
            String userName = themeDisplay.getUser().getFullName();

            // Get the service context
            ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
            serviceContext.setScopeGroupId(groupId);
            serviceContext.setCompanyId(companyId);
            serviceContext.setUserId(userId);
            
            

           
            // Call service layer method to save data in DB
            
            
			
			 _detailsLocalService.createStudents( studentId, studentName, departmentId,
			 groupId, companyId, userId, userName, serviceContext );
			 


            // Log success
            _log.info("Student successfully created: " + studentName);

            // Success message
            SessionMessages.add(actionRequest, "student-added-success");
            
         // Redirect to the view page after adding a student
            _log.info("Redirection Please ************ " );
            actionResponse.setRenderParameter("mvcRenderCommandName", "/view_students");
            
            _log.info("@@@@@@@@Redirection Successfullyy@@@@@@@@@@@ ");
            return true;  // Indicate successful processing

        } catch (Exception e) {
            _log.error("Error adding student", e);
            SessionErrors.add(actionRequest, "error-adding-student");
            return false;  // Indicate failure
        }
    }
}

