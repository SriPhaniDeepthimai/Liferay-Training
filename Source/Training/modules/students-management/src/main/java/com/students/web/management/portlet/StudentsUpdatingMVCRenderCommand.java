
package com.students.web.management.portlet;
import com.students.web.management.constants.StudentsManagementPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;


import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;


@Component(
    immediate = true,
    property = {
    		"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,
        "mvc.command.name="+StudentsManagementPortletKeys.UPDATE_URL,
    },
    service = MVCRenderCommand.class
)
public class StudentsUpdatingMVCRenderCommand implements MVCRenderCommand {
	
	 private static final Log _log = LogFactoryUtil.getLog(StudentsUpdatingMVCRenderCommand.class);
    
	 
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) {
    	
    	_log.info("Executing   Updating StudentsViewMVCRenderCommand.............................");
    	
    	return "/updateStudent.jsp";
    }
}
