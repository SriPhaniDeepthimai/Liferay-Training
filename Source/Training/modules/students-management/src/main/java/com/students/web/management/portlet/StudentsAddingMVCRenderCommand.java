
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
    	"mvc.command.name="+StudentsManagementPortletKeys.ADDING_URL
    },
    service = MVCRenderCommand.class
)
public class StudentsAddingMVCRenderCommand implements MVCRenderCommand {
	
	 private static final Log _log = LogFactoryUtil.getLog(StudentsAddingMVCRenderCommand.class);
    
	 
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) {
    	
    	_log.info("Executing AddingStudentsViewMVCRenderCommand.............................");
    	
    	return "/addStudent.jsp";
    }
}
