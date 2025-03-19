package demo.http.options.resource;
import com.liferay.portal.kernel.json.*;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.Http.Options;
import com.liferay.portal.kernel.util.Http.Method;

import java.nio.charset.StandardCharsets;
import java.util.Collections;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

@Component(
    service = Object.class,
    property = {
        "osgi.jaxrs.resource=true",
        "osgi.jaxrs.application.select=(osgi.jaxrs.name=StudentAPI.Rest)",
        "osgi.jaxrs.name=StudentAPI"
    },
    scope = ServiceScope.PROTOTYPE
)
@Path("/students")
public class StudentResource {

	
	private Log _log=LogFactoryUtil.getLog(StudentResource.class);
    @Reference
    private Http http;

    private static final String API_URL = "http://localhost:8080/o/c/students/";
   
    String username = "deepthi@gmail.com";
    String password = "Deepthi@2596";
    String auth = username + ":" + password;
    String encodedAuth = "Basic " + Base64.encode(auth.getBytes());
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createStudent(String studentJson) {
        try {
            Http.Options options = new Http.Options();
            options.setLocation(API_URL);
            
            options.setMethod(Method.POST);
            options.addHeader("Authorization", encodedAuth);
            options.addHeader("Accept", "application/json");
            options.addHeader("Content-Type", "application/json");
            options.setBody(studentJson, "application/json", StandardCharsets.UTF_8.name());

            String response = HttpUtil.URLtoString(options);
            return Response.ok(response).build();
        } catch (Exception e) {
            return handleError(e);
        }
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents() {
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

            return Response.ok(studentsArray.toString()).build();
        } catch (Exception e) {
            return handleError(e);
        }
    }

    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentById(@PathParam("id") int id) {
        try {
        	
        	_log.info("<<<<<<<<<<<<<<<<<<<<<<GET STUDENT BY ID>>>>>>>>>");
            Options options = new Options();
            options.setLocation(API_URL + "/" + id);
            options.setMethod(Method.GET);
            
            options.addHeader("Authorization", encodedAuth);
            options.addHeader("Accept", "application/json");
            options.addHeader("Content-Type", "application/json");

            String responseBody = HttpUtil.URLtoString(options);
            return Response.ok(responseBody).build();
        } catch (Exception e) {
            return handleError(e);
        }
    }

    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStudent(@PathParam("id") int id, String studentJson) {
        try {
            Options options = new Options();
            options.setLocation(API_URL + "/" + id);
            options.setMethod(Method.PUT);
            
            options.addHeader("Authorization", encodedAuth);
            options.addHeader("Accept", "application/json");
            options.addHeader("Content-Type", "application/json");
            options.setBody(studentJson, "application/json", StandardCharsets.UTF_8.name());

            String response = HttpUtil.URLtoString(options);
            return Response.ok(response).build();
        } catch (Exception e) {
            return handleError(e);
        }
    }

    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteStudent(@PathParam("id") int id) {
        try {
            Options options = new Options();
            options.setLocation(API_URL + "/" + id);
            options.setMethod(Method.DELETE);
            
            options.addHeader("Authorization", encodedAuth);
            options.addHeader("Accept", "application/json");

            String response = HttpUtil.URLtoString(options);
            return Response.ok(response).build();
        } catch (Exception e) {
            return handleError(e);
        }
    }

    // 🛠 Handle Errors
    private Response handleError(Exception e) {
        _log.info(e);
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(Collections.singletonMap("error", "Request failed")).build();
    }
}
