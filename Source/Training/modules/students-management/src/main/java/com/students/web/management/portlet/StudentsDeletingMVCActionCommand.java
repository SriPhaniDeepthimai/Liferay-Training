package com.students.web.management.portlet;

import com.students.web.management.constants.StudentsManagementPortletKeys;




import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalService;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {
    		"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,
        "mvc.command.name="+StudentsManagementPortletKeys.DELETE_URL,
    },
    service = MVCActionCommand.class
)
public class StudentsDeletingMVCActionCommand implements  MVCActionCommand {
	
    private static final Log _log = LogFactoryUtil.getLog(StudentsDeletingMVCActionCommand.class);


    @Reference
    private DetailsLocalService _detailsLocalService;

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse){
        try {
            // Get parameters from the request
        	
        	_log.info("MVC Delete  Action Command Executing");
            int studentId = ParamUtil.getInteger(actionRequest, "studentId");
//            String studentName = ParamUtil.getString(actionRequest, "studentName");
//            int departmentId = ParamUtil.getInteger(actionRequest, "departmentId");

            // Get ServiceContext
            ServiceContext serviceContext = ServiceContextFactory.getInstance(Details.class.getName(), actionRequest);

            // Fetch existing student entry
           _detailsLocalService.deleteDetails(studentId);
            
           
           _log.info("Student successfully deleted: " + studentId);
            
//            // Redirect to the view page after successful update
//            actionResponse.sendRedirect(PortalUtil.getCurrentURL(actionRequest));
            return true;

        } catch (Exception e) {
        	_log.error("Error deleting student", e);
            SessionErrors.add(actionRequest, "error-deleting-student");
            return false;  // Indicate failure
        }
        
        
    }
}
