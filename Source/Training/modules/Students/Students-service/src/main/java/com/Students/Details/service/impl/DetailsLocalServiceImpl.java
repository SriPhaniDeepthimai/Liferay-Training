/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.impl;

import com.Students.Details.exception.NoSuchDetailsException;

import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalService;
import com.Students.Details.service.DetailsLocalServiceUtil;
import com.Students.Details.service.persistence.DetailsFinder;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.Students.Details.service.base.DetailsLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com. Students.Details.model.Details",
	service = AopService.class
)
public class DetailsLocalServiceImpl extends DetailsLocalServiceBaseImpl {
	
	private static final Log _log = LogFactoryUtil.getLog(DetailsLocalServiceImpl.class);
	
	public Details studDetails(int stud_Id) throws PortalException {
		
		_log.info("Fetching student details for ID: " + stud_Id);
		Details d=detailsLocalService.getDetails(stud_Id);
		_log.debug("Student details retrieved: " + d);
		return d;
		
	}
	
	public void createStudents(
		    int studentId, String studentName, int departmentId, 
		    long groupId, long companyId, long userId, String userName, 
		    ServiceContext serviceContext) {

		    // Create a new student record
		    
		    Details details=detailsLocalService.createDetails(studentId);
		    details.setStudent_Name(studentName);
		    details.setDepartment_Id(departmentId);

		    // Set Liferay default fields
		    details.setGroupId(groupId);
		    details.setCompanyId(companyId);
		    details.setUserId(userId);
		    details.setUserName(userName);
		    details.setCreateDate(serviceContext.getCreateDate(new Date()));
		    details.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		    detailsLocalService.addDetails(details);
		    
		    _log.info("Students All records created successfully: " + details);
		}
	
	public void  createStudent(int stud_id,String name,int dep_Id) {
		
		_log.info("Creating student record: ID = " + stud_id + ", Name = " + name + ", Department ID = " + dep_Id);
		
		Details studdetails=detailsLocalService.createDetails(stud_id);
		studdetails.setStudent_Name(name);
		studdetails.setDepartment_Id(dep_Id);
		detailsLocalService.addDetails(studdetails);
		_log.info("Student record created successfully: " + studdetails);
		
	}
	
	public void updateStudent(int stud_Id,String name , int dep_Id) throws PortalException {
		
		_log.info("Updating student record for ID: " + stud_Id);
		
//		Details details = detailsLocalService.

    	Details details = detailsLocalService.getDetails(stud_Id);
    	_log.info("Before Setting " + stud_Id);
		details.setStudent_Id(stud_Id);
		_log.info("After Setting " + stud_Id);
		details.setStudent_Name(name);
		details.setDepartment_Id(dep_Id);
		
		_log.info("Student record updated successfully: " + details);
		detailsLocalService.updateDetails(details);
		
	}
	
	public void deleteStudent(int stud_Id) throws PortalException {
		_log.warn("Deleting student record for ID: " + stud_Id);
		detailsLocalService.deleteDetails(stud_Id);
		
		_log.info("Student record deleted successfully.");
	}
	
//	public Details finding(int id) throws NoSuchDetailsException {
//	   Details details=detailsPersistence.findByStudentId(id);
//	   return details;  
//	}
	
	public List<Details> getStudentsByDepartment(int Department_Id){
		_log.info(detailsFinder.findByDetails(Department_Id));
		return detailsFinder.findByDetails(Department_Id);
	}
	
	public List<Details> getStudentsByDynamicQuery(int Department_Id){
		  _log.info("Came Inside Dynamic Query");
          DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Details.class, DetailsLocalServiceUtil.class.getClassLoader());
          _log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<After DynamicQueryFactoryUtil>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
          dynamicQuery.add(PropertyFactoryUtil.forName("Department_Id").eq(Department_Id));
          _log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<After DynamicQueryUtil>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

          List<Details> studentList = DetailsLocalServiceUtil.dynamicQuery(dynamicQuery);
          _log.info(studentList);
		  return studentList;

	}

	@Override
	public Details finding(int id) throws NoSuchDetailsException {
		// TODO Auto-generated method stub
		return null;
	}
			 
}