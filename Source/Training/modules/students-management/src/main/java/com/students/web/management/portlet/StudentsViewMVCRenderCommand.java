package com.students.web.management.portlet;
import com.students.web.management.constants.StudentsManagementPortletKeys;
import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

@Component(
    immediate = true,
    property = {
    		"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,"javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,
    	"mvc.command.name="+StudentsManagementPortletKeys.VIEW_URL,
    	"mvc.command.name="+StudentsManagementPortletKeys.SEARCH_URL,
    	"mvc.command.name="+StudentsManagementPortletKeys.RESOURCE_SEARCH_URL,
        
    },
    service = MVCRenderCommand.class
)
public class StudentsViewMVCRenderCommand implements MVCRenderCommand {
	
	 private static final Log _log = LogFactoryUtil.getLog(StudentsViewMVCRenderCommand.class);
    @Reference
    private DetailsLocalService  _detailsLocalService;
    
    

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) {
    	
    	_log.info("Executing StudentsViewMVCRenderCommand............................................................................................");
    	try {
    	List<Details> students = _detailsLocalService.getDetailses(0, _detailsLocalService.getDetailsesCount());
        renderRequest.setAttribute("students", students);
        _log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Successfully fetched " + students.size() + " student records.>>>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (Exception e) {
            _log.error("Error fetching student details: ", e);
        }
        return "/StudentsView.jsp";
    }
}
