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
 * This class is a wrapper for {@link Details}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Details
 * @generated
 */
public class DetailsWrapper
	extends BaseModelWrapper<Details>
	implements Details, ModelWrapper<Details> {

	public DetailsWrapper(Details details) {
		super(details);
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
		attributes.put("Student_Name", getStudent_Name());
		attributes.put("Department_Id", getDepartment_Id());

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

		String Student_Name = (String)attributes.get("Student_Name");

		if (Student_Name != null) {
			setStudent_Name(Student_Name);
		}

		Integer Department_Id = (Integer)attributes.get("Department_Id");

		if (Department_Id != null) {
			setDepartment_Id(Department_Id);
		}
	}

	@Override
	public Details cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this details.
	 *
	 * @return the company ID of this details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this details.
	 *
	 * @return the create date of this details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department_ ID of this details.
	 *
	 * @return the department_ ID of this details
	 */
	@Override
	public int getDepartment_Id() {
		return model.getDepartment_Id();
	}

	/**
	 * Returns the group ID of this details.
	 *
	 * @return the group ID of this details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this details.
	 *
	 * @return the modified date of this details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this details.
	 *
	 * @return the primary key of this details
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student_ ID of this details.
	 *
	 * @return the student_ ID of this details
	 */
	@Override
	public int getStudent_Id() {
		return model.getStudent_Id();
	}

	/**
	 * Returns the student_ name of this details.
	 *
	 * @return the student_ name of this details
	 */
	@Override
	public String getStudent_Name() {
		return model.getStudent_Name();
	}

	/**
	 * Returns the user ID of this details.
	 *
	 * @return the user ID of this details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this details.
	 *
	 * @return the user name of this details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this details.
	 *
	 * @return the user uuid of this details
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this details.
	 *
	 * @return the uuid of this details
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
	 * Sets the company ID of this details.
	 *
	 * @param companyId the company ID of this details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this details.
	 *
	 * @param createDate the create date of this details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department_ ID of this details.
	 *
	 * @param Department_Id the department_ ID of this details
	 */
	@Override
	public void setDepartment_Id(int Department_Id) {
		model.setDepartment_Id(Department_Id);
	}

	/**
	 * Sets the group ID of this details.
	 *
	 * @param groupId the group ID of this details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this details.
	 *
	 * @param modifiedDate the modified date of this details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this details.
	 *
	 * @param primaryKey the primary key of this details
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student_ ID of this details.
	 *
	 * @param Student_Id the student_ ID of this details
	 */
	@Override
	public void setStudent_Id(int Student_Id) {
		model.setStudent_Id(Student_Id);
	}

	/**
	 * Sets the student_ name of this details.
	 *
	 * @param Student_Name the student_ name of this details
	 */
	@Override
	public void setStudent_Name(String Student_Name) {
		model.setStudent_Name(Student_Name);
	}

	/**
	 * Sets the user ID of this details.
	 *
	 * @param userId the user ID of this details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this details.
	 *
	 * @param userName the user name of this details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this details.
	 *
	 * @param userUuid the user uuid of this details
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this details.
	 *
	 * @param uuid the uuid of this details
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
	protected DetailsWrapper wrap(Details details) {
		return new DetailsWrapper(details);
	}

}