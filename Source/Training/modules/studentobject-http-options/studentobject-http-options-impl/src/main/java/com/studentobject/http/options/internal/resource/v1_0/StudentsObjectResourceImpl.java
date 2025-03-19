package com.studentobject.http.options.internal.resource.v1_0;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.Http.Method;
import com.liferay.portal.vulcan.pagination.Page;
import com.studentobject.http.options.dto.v1_0.StudentsObject;
import com.studentobject.http.options.resource.v1_0.StudentsObjectResource;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author deepthimai.koppulu
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/students-object.properties",
	scope = ServiceScope.PROTOTYPE, service = StudentsObjectResource.class
)
public class StudentsObjectResourceImpl extends BaseStudentsObjectResourceImpl {
	
	
	private Log _log=LogFactoryUtil.getLog(StudentsObjectResourceImpl.class);
        
    private static final String API_URL = "http://localhost:8080/o/c/students/";
    
    String username = "deepthi@gmail.com";
    String password = "Deepthi@2596";
    String auth = username + ":" + password;
    String encodedAuth = "Basic " + Base64.encode(auth.getBytes());
    
    
   	
	public StudentsObject createStudentObject(StudentsObject studentsObject)
			throws Exception{
    	
    	try {
            JSONObject studentJson = JSONFactoryUtil.createJSONObject();
            studentJson.put("studentId", studentsObject.getStudentId());
            
            
            studentJson.put("studentName", studentsObject.getStudentName());
            studentJson.put("departmentId", studentsObject.getDepartmentId());

			_log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<ENTERED INSIDE>>>>>>>>>>>>>>>>");

            Http.Options options = new Http.Options();
            options.setLocation(API_URL);
            options.setMethod(Method.POST);
            options.addHeader("Authorization", encodedAuth);
            options.addHeader("Accept", "application/json");
            options.addHeader("Content-Type", "application/json");
            options.setBody(studentJson.toString(), "application/json", StandardCharsets.UTF_8.name());
            
            String response = HttpUtil.URLtoString(options);
            _log.info("Student created: " + response);

            return studentsObject;
        } catch (Exception e) {
            _log.error("Error creating student", e);
            throw e;
        }
		
	}
	
   public Page<StudentsObject> getStudentObjects() throws Exception{
			
			_log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<ENTERED INSIDE>>>>>>>>>>>>>>>>");
	        try {
	        	
	        	_log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<ENTERED INSIDE A METHOD>>>>>>>>>>>>>>>>");
	            Http.Options options = new Http.Options();
	            _log.info(API_URL);
	            options.setLocation(API_URL);
	            _log.info(API_URL);
	            options.setMethod(Http.Method.GET);
	            
	            options.addHeader("Authorization", encodedAuth);
	            options.addHeader("Accept", "application/json");
	            options.addHeader("Content-Type", "application/json");
	            _log.info(options);
	            String responseBody = HttpUtil.URLtoString(options);
	            _log.info(responseBody);
	            JSONObject jsonResponse =JSONFactoryUtil.createJSONObject(responseBody);
	            JSONArray studentsArray = jsonResponse.getJSONArray("items");

	            List<StudentsObject> studentsList = new ArrayList<>();
	            for (int i = 0; i < studentsArray.length(); i++) {
	                studentsList.add(getCopiedStudentsObject(studentsArray.getJSONObject(i)));
	            }
                return Page.of(studentsList);
		}catch (Exception e) {
            _log.error("Error fetching students", e);
            throw e;
        }
	}

   public StudentsObject updateStudent(StudentsObject studentsObject)
			throws Exception{
				return studentsObject;
			
		}

	public StudentsObject deleteStudentObject(Integer studentId)
			throws Exception{
				return null;
//		 _log.info("Deleting student with ID: " + studentId);
//	        try {
//	            Http.Options options = new Http.Options();
//	            options.setLocation(API_URL + "/" + studentId);
//	            options.setMethod(Http.Method.DELETE);
//	            options.addHeader("Authorization", encodedAuth);
//	            options.addHeader("Accept", "application/json");
//
//	            HttpUtil.URLtoString(options);
//	            _log.info("Student deleted successfully");
//	            return true;
//	        } catch (Exception e) {
//	            _log.error("Error deleting student", e);
//	            return false;
//	        }
			
		}
		
		public static StudentsObject getCopiedStudentsObject(JSONObject json) {
			StudentsObject studentObject=new  StudentsObject();
			 
			studentObject.setStudentId(json.getInt("studentId"));
			studentObject.setStudentName(json.getString("studentName"));
			studentObject.setDepartmentId(json.getInt("departmentId")); 
			 
			 
			return studentObject;
		}
		
		

	
}