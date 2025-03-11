package com.students.web.management.portlet.serveResource;

import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import com.students.web.management.constants.StudentsManagementPortletKeys;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    property = {
	        "javax.portlet.name=" + StudentsManagementPortletKeys.STUDENTSMANAGEMENT,
	        "mvc.command.name="+ StudentsManagementPortletKeys.RESOURCE_SEARCH_URL
	    },
	    service = MVCResourceCommand.class
	)
public class SearchStudentsMVCResourceCommand implements MVCResourceCommand {
	
	    @Reference
	    private DetailsLocalService _detailsLocalService;

	    private static final Log _log = LogFactoryUtil.getLog(SearchStudentsMVCResourceCommand.class);

	    @Override
	    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
	    	_log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<MVCResourceCommand Executing for Student Search>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	    	int departmentId = ParamUtil.getInteger(resourceRequest, "departmentId", -1);

	        List<Details> students=_detailsLocalService.getStudentsByDynamicQuery(departmentId); // Fetch filtered students;
	        // Convert Student List to JSON
	        JSONObject responseJson = JSONFactoryUtil.createJSONObject();
	        JSONArray studentArray = JSONFactoryUtil.createJSONArray();

	        for (Details student : students) {
	            JSONObject studentJSON = JSONFactoryUtil.createJSONObject();
	            studentJSON.put("id", student.getStudent_Id());
	            studentJSON.put("name", student.getStudent_Name());
	            studentJSON.put("department", student.getDepartment_Id());
	            studentArray.put(studentJSON);
	        }

	        responseJson.put("students", studentArray);

	        // Send Response
	        resourceResponse.setContentType("application/json");
	        PrintWriter writer;
			try {
				writer = resourceResponse.getWriter();
				writer.write(responseJson.toString());
		        writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        return true;
	    }
	            

}

