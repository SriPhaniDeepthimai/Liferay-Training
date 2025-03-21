package com.details.rest.builder.internal.resource.v1_0;

import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalService;
import com.details.rest.builder.dto.v1_0.DetailsObject;
import com.details.rest.builder.resource.v1_0.DetailsObjectResource;
import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author deepthimai.koppulu
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/details-object.properties",
	scope = ServiceScope.PROTOTYPE, service = DetailsObjectResource.class
)
public class DetailsObjectResourceImpl extends BaseDetailsObjectResourceImpl {
	
	@Reference
	private DetailsLocalService _detailsLocalService;
	
	private static Log _log=LogFactoryUtil.getLog(DetailsObjectResourceImpl.class);
	
	public DetailsObject createStudent(DetailsObject detailsObject)
			throws Exception{
		_log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CAME INSIDE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ServiceContext serviceContext = ServiceContextFactory.getInstance(Details.class.getName(), contextHttpServletRequest);
		
		int studentId=detailsObject.getStudentId();
		String studentName=detailsObject.getStudentName();
		int  departmentId =detailsObject.getDepartmentId();
		
		try {
			Details newdetails=_detailsLocalService.createDetails(studentId);
			newdetails.setStudent_Name(studentName);
			newdetails.setDepartment_Id(departmentId);
			newdetails.setGroupId(serviceContext.getScopeGroupId());
			newdetails.setCompanyId(serviceContext.getCompanyId());
            newdetails.setUserId(serviceContext.getUserId());
            newdetails.setUuid(serviceContext.getUuid());
            newdetails.setUserName("TEST TEST");
			Details student=_detailsLocalService.addDetails(newdetails);
			return getCopiedStudentsObject(student) ;
		}
		catch (Exception e) {
			_log.error("Error adding student: " + e.getMessage(), e);
            
		}
	    return null;
		
	}
	
	public Page<DetailsObject> getStudentByDepartmentId(Integer departmentId)
			throws Exception{
		List<Details> students =_detailsLocalService.getStudentsByDepartment(departmentId);
		List<DetailsObject> studentObjects=new ArrayList<>();
		   for(Details student:students) {
			   studentObjects.add(getCopiedStudentsObject(student));
		   }
			return Page.of(studentObjects);
	}
	
	public Page<DetailsObject> getStudents(Pagination pagination)
			throws Exception{
		List<Details> students =_detailsLocalService.getDetailses(pagination.getStartPosition(), pagination.getEndPosition());
		List<DetailsObject> studentObjects=new ArrayList<>();
		   for(Details student:students) {
			   studentObjects.add(getCopiedStudentsObject(student));
		   }
			return Page.of(studentObjects,pagination,studentObjects.size());
		
	}
	
	public DetailsObject updateStudent(DetailsObject detailsObject)
			throws Exception{
		int studentId=detailsObject.getStudentId();
		String studentName=detailsObject.getStudentName();
		int  departmentId =detailsObject.getDepartmentId();
		
		try {
			Details newdetails=_detailsLocalService.createDetails(studentId);
			newdetails.setStudent_Name(studentName);
			newdetails.setDepartment_Id(departmentId);
			Details student=_detailsLocalService.updateDetails(newdetails);
			return getCopiedStudentsObject(student) ;
		}
		catch (Exception e) {
			_log.error("Error adding student: " + e.getMessage(), e);
            
		}
	    return null;
	}
	
	public DetailsObject deleteStudentByStudentId(Integer studentId)
			throws Exception{
		 Details student=_detailsLocalService.deleteDetails(studentId);
		 return getCopiedStudentsObject(student);
	}
	
	public static DetailsObject getCopiedStudentsObject(Details student) {
		DetailsObject studentObject=new  DetailsObject();
		 
		 studentObject.setStudentId(student.getStudent_Id());
		 studentObject.setStudentName(student.getStudent_Name());
		 studentObject.setDepartmentId(student.getDepartment_Id()); 
		 
		 
		return studentObject;
	}	
}