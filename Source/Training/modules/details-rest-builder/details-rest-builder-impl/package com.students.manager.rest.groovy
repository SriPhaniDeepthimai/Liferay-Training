package com.students.manager.rest.builder.internal.resource.v1_0;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.service.builder.excercise.model.Students;
import com.service.builder.excercise.service.StudentsLocalService;
import com.students.manager.rest.builder.dto.v1_0.StudentsObject;
import com.students.manager.rest.builder.resource.v1_0.StudentsResource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author kommineni.chandu
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/students.properties",
	scope = ServiceScope.PROTOTYPE, service = StudentsResource.class
)
public class StudentsResourceImpl extends BaseStudentsResourceImpl {
	private Log _logger=LogFactoryUtil.getLog(StudentsResourceImpl.class);
	
	@Override
	public StudentsObject getStudentById(Long studentId)throws Exception
	{
        Students student=studentLocalService.getStudentByID(studentId);
        StudentsObject studentObjects=getCopiedStudentsObject(student);
      
		return studentObjects;
	}
	
	@Override
	public Page<StudentsObject> getAllStudents(Pagination pagination) throws Exception {
	   List<Students> students =studentLocalService.getStudentses(pagination.getStartPosition(), pagination.getEndPosition());
	   List<StudentsObject> studentObjects=new ArrayList<>();
	   for(Students student:students) {
		   studentObjects.add(getCopiedStudentsObject(student));
	   }
		return Page.of(studentObjects,pagination,studentObjects.size());
	}
	
	@Override
	public StudentsObject updateStudent(StudentsObject studentsObject)
			throws Exception {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Students.class.getName(), contextHttpServletRequest);
		
		Long studentId=studentsObject.getStudentId();
		String studentName=studentsObject.getStudentName();
		String enrollmentNo=studentsObject.getEnrollmentNo();
		Double studentGPA=studentsObject.getStudentGPA();
		String  studentDepartment =studentsObject.getStudentDepartment();
		Long mentorId=studentsObject.getMentorId();
	
		try {
			Students student=studentLocalService.updateStudent(studentId,studentName,studentDepartment,studentGPA,enrollmentNo,mentorId, serviceContext);
			return getCopiedStudentsObject(student) ;
		}
		catch (Exception e) {
			_logger.error("Error Updating student: " + e.getMessage(), e);
            
		}
	    return null;
          
	}
	
	@Override
	public StudentsObject addStudent(StudentsObject studentsObject)
			throws Exception {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Students.class.getName(), contextHttpServletRequest);
		
		Long studentId=studentsObject.getStudentId();
		String studentName=studentsObject.getStudentName();
		String enrollmentNo=studentsObject.getEnrollmentNo();
		Double studentGPA=studentsObject.getStudentGPA();
		String  studentDepartment =studentsObject.getStudentDepartment();
		Long mentorId=studentsObject.getMentorId();
	
		try {
			Students student=studentLocalService.addStudent(studentName,studentDepartment,studentGPA,enrollmentNo,mentorId, serviceContext);
			return getCopiedStudentsObject(student) ;
		}
		catch (Exception e) {
			_logger.error("Error adding student: " + e.getMessage(), e);
            
		}
	    return null;
		
	}
	@Override
	public StudentsObject deleteStudentById(Long studentId)
		throws Exception {
        Students student=studentLocalService.deleteStudents(studentId);
        
		return  getCopiedStudentsObject(student);
	}
	
	public static StudentsObject getCopiedStudentsObject(Students student) {
		 StudentsObject studentObject=new  StudentsObject();
		 
		 studentObject.setStudentId(student.getStudentId());
		 studentObject.setStudentName(student.getStudentName());
		 studentObject.setEnrollmentNo(student.getEnrollmentNo());
		 studentObject.setMentorId(student.getMentorId());
		 studentObject.setStudentDepartment(student.getStudentDepartment());
		 studentObject.setStudentGPA(student.getStudentGPA());
		 
		return studentObject;
	}
	
	
	


	@Reference
	private StudentsLocalService studentLocalService;
  
	
}