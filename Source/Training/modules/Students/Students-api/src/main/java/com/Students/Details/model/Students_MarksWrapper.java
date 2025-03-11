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
 * This class is a wrapper for {@link Students_Marks}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Students_Marks
 * @generated
 */
public class Students_MarksWrapper
	extends BaseModelWrapper<Students_Marks>
	implements ModelWrapper<Students_Marks>, Students_Marks {

	public Students_MarksWrapper(Students_Marks students_Marks) {
		super(students_Marks);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Student_Id", getStudent_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("Student_Marks", getStudent_Marks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer Student_Id = (Integer)attributes.get("Student_Id");

		if (Student_Id != null) {
			setStudent_Id(Student_Id);
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

		String Student_Marks = (String)attributes.get("Student_Marks");

		if (Student_Marks != null) {
			setStudent_Marks(Student_Marks);
		}
	}

	@Override
	public Students_Marks cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this students_ marks.
	 *
	 * @return the company ID of this students_ marks
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this students_ marks.
	 *
	 * @return the create date of this students_ marks
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this students_ marks.
	 *
	 * @return the group ID of this students_ marks
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this students_ marks.
	 *
	 * @return the modified date of this students_ marks
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this students_ marks.
	 *
	 * @return the primary key of this students_ marks
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student_ ID of this students_ marks.
	 *
	 * @return the student_ ID of this students_ marks
	 */
	@Override
	public int getStudent_Id() {
		return model.getStudent_Id();
	}

	/**
	 * Returns the student_ marks of this students_ marks.
	 *
	 * @return the student_ marks of this students_ marks
	 */
	@Override
	public String getStudent_Marks() {
		return model.getStudent_Marks();
	}

	/**
	 * Returns the user ID of this students_ marks.
	 *
	 * @return the user ID of this students_ marks
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this students_ marks.
	 *
	 * @return the user name of this students_ marks
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this students_ marks.
	 *
	 * @return the user uuid of this students_ marks
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this students_ marks.
	 *
	 * @return the uuid of this students_ marks
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
	 * Sets the company ID of this students_ marks.
	 *
	 * @param companyId the company ID of this students_ marks
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this students_ marks.
	 *
	 * @param createDate the create date of this students_ marks
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this students_ marks.
	 *
	 * @param groupId the group ID of this students_ marks
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this students_ marks.
	 *
	 * @param modifiedDate the modified date of this students_ marks
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this students_ marks.
	 *
	 * @param primaryKey the primary key of this students_ marks
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student_ ID of this students_ marks.
	 *
	 * @param Student_Id the student_ ID of this students_ marks
	 */
	@Override
	public void setStudent_Id(int Student_Id) {
		model.setStudent_Id(Student_Id);
	}

	/**
	 * Sets the student_ marks of this students_ marks.
	 *
	 * @param Student_Marks the student_ marks of this students_ marks
	 */
	@Override
	public void setStudent_Marks(String Student_Marks) {
		model.setStudent_Marks(Student_Marks);
	}

	/**
	 * Sets the user ID of this students_ marks.
	 *
	 * @param userId the user ID of this students_ marks
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this students_ marks.
	 *
	 * @param userName the user name of this students_ marks
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this students_ marks.
	 *
	 * @param userUuid the user uuid of this students_ marks
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this students_ marks.
	 *
	 * @param uuid the uuid of this students_ marks
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
	protected Students_MarksWrapper wrap(Students_Marks students_Marks) {
		return new Students_MarksWrapper(students_Marks);
	}

}