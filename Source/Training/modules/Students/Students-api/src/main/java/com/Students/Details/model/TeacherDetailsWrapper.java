/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TeacherDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetails
 * @generated
 */
public class TeacherDetailsWrapper
	extends BaseModelWrapper<TeacherDetails>
	implements ModelWrapper<TeacherDetails>, TeacherDetails {

	public TeacherDetailsWrapper(TeacherDetails teacherDetails) {
		super(teacherDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Teacher_Id", getTeacher_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("Teacher_Name", getTeacher_Name());
		attributes.put("Department_Id", getDepartment_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer Teacher_Id = (Integer)attributes.get("Teacher_Id");

		if (Teacher_Id != null) {
			setTeacher_Id(Teacher_Id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String Teacher_Name = (String)attributes.get("Teacher_Name");

		if (Teacher_Name != null) {
			setTeacher_Name(Teacher_Name);
		}

		Integer Department_Id = (Integer)attributes.get("Department_Id");

		if (Department_Id != null) {
			setDepartment_Id(Department_Id);
		}
	}

	@Override
	public TeacherDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this teacher details.
	 *
	 * @return the company ID of this teacher details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this teacher details.
	 *
	 * @return the create date of this teacher details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department_ ID of this teacher details.
	 *
	 * @return the department_ ID of this teacher details
	 */
	@Override
	public int getDepartment_Id() {
		return model.getDepartment_Id();
	}

	/**
	 * Returns the group ID of this teacher details.
	 *
	 * @return the group ID of this teacher details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this teacher details.
	 *
	 * @return the modified date of this teacher details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this teacher details.
	 *
	 * @return the primary key of this teacher details
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the teacher_ ID of this teacher details.
	 *
	 * @return the teacher_ ID of this teacher details
	 */
	@Override
	public int getTeacher_Id() {
		return model.getTeacher_Id();
	}

	/**
	 * Returns the teacher_ name of this teacher details.
	 *
	 * @return the teacher_ name of this teacher details
	 */
	@Override
	public String getTeacher_Name() {
		return model.getTeacher_Name();
	}

	/**
	 * Returns the user ID of this teacher details.
	 *
	 * @return the user ID of this teacher details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this teacher details.
	 *
	 * @return the user name of this teacher details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this teacher details.
	 *
	 * @return the user uuid of this teacher details
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this teacher details.
	 *
	 * @return the uuid of this teacher details
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this teacher details.
	 *
	 * @param companyId the company ID of this teacher details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this teacher details.
	 *
	 * @param createDate the create date of this teacher details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department_ ID of this teacher details.
	 *
	 * @param Department_Id the department_ ID of this teacher details
	 */
	@Override
	public void setDepartment_Id(int Department_Id) {
		model.setDepartment_Id(Department_Id);
	}

	/**
	 * Sets the group ID of this teacher details.
	 *
	 * @param groupId the group ID of this teacher details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this teacher details.
	 *
	 * @param modifiedDate the modified date of this teacher details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this teacher details.
	 *
	 * @param primaryKey the primary key of this teacher details
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the teacher_ ID of this teacher details.
	 *
	 * @param Teacher_Id the teacher_ ID of this teacher details
	 */
	@Override
	public void setTeacher_Id(int Teacher_Id) {
		model.setTeacher_Id(Teacher_Id);
	}

	/**
	 * Sets the teacher_ name of this teacher details.
	 *
	 * @param Teacher_Name the teacher_ name of this teacher details
	 */
	@Override
	public void setTeacher_Name(String Teacher_Name) {
		model.setTeacher_Name(Teacher_Name);
	}

	/**
	 * Sets the user ID of this teacher details.
	 *
	 * @param userId the user ID of this teacher details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this teacher details.
	 *
	 * @param userName the user name of this teacher details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this teacher details.
	 *
	 * @param userUuid the user uuid of this teacher details
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this teacher details.
	 *
	 * @param uuid the uuid of this teacher details
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TeacherDetailsWrapper wrap(TeacherDetails teacherDetails) {
		return new TeacherDetailsWrapper(teacherDetails);
	}

}