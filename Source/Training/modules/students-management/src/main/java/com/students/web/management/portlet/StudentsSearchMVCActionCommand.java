package com.students.web.management.portlet;

import com.students.web.management.constants.StudentsManagementPortletKeys;



import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalService;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import java.util.List;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {
    		"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,
        "mvc.command.name=/search_students"
    },
    service = MVCActionCommand.class
)
public class StudentsSearchMVCActionCommand implements MVCActionCommand {
	
	@Reference
    private DetailsLocalService _detailsLocalService;

   
    private static final Log _log = LogFactoryUtil.getLog(StudentsSearchMVCActionCommand.class);
    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        
    	 
    	 _log.info("MVC Search Action Command Executing");
        int departmentId = ParamUtil.getInteger(actionRequest, "departmentId", -1);
        _log.info(departmentId);
        if (departmentId != -1) {
        	
        	_log.info(departmentId);
//            List<Details> students = _detailsLocalService.getStudentsByDepartment(departmentId);
        	 List<Details> students = _detailsLocalService.getStudentsByDynamicQuery(departmentId);
            _log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Successfully fetched  " +students.size()+"  student records.>>>>>>>>>>>>>>>>>>>>>>>>>");
            actionRequest.setAttribute("students", students);
            actionResponse.setRenderParameter("mvcPath", "/StudentsView.jsp");
//            PortletSession session = actionRequest.getPortletSession();
//            session.setAttribute("searchstudents", students, PortletSession.PORTLET_SCOPE);
            return true;
        }
        else {
        return false; 
        }// To continue normal processing
    }
}
