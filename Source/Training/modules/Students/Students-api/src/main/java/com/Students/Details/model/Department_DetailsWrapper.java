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
 * This class is a wrapper for {@link Department_Details}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department_Details
 * @generated
 */
public class Department_DetailsWrapper
	extends BaseModelWrapper<Department_Details>
	implements Department_Details, ModelWrapper<Department_Details> {

	public Department_DetailsWrapper(Department_Details department_Details) {
		super(department_Details);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Department_Id", getDepartment_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("Department_Name", getDepartment_Name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer Department_Id = (Integer)attributes.get("Department_Id");

		if (Department_Id != null) {
			setDepartment_Id(Department_Id);
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

		String Department_Name = (String)attributes.get("Department_Name");

		if (Department_Name != null) {
			setDepartment_Name(Department_Name);
		}
	}

	@Override
	public Department_Details cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this department_ details.
	 *
	 * @return the company ID of this department_ details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this department_ details.
	 *
	 * @return the create date of this department_ details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department_ ID of this department_ details.
	 *
	 * @return the department_ ID of this department_ details
	 */
	@Override
	public int getDepartment_Id() {
		return model.getDepartment_Id();
	}

	/**
	 * Returns the department_ name of this department_ details.
	 *
	 * @return the department_ name of this department_ details
	 */
	@Override
	public String getDepartment_Name() {
		return model.getDepartment_Name();
	}

	/**
	 * Returns the group ID of this department_ details.
	 *
	 * @return the group ID of this department_ details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this department_ details.
	 *
	 * @return the modified date of this department_ details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this department_ details.
	 *
	 * @return the primary key of this department_ details
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this department_ details.
	 *
	 * @return the user ID of this department_ details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this department_ details.
	 *
	 * @return the user name of this department_ details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this department_ details.
	 *
	 * @return the user uuid of this department_ details
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this department_ details.
	 *
	 * @return the uuid of this department_ details
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
	 * Sets the company ID of this department_ details.
	 *
	 * @param companyId the company ID of this department_ details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this department_ details.
	 *
	 * @param createDate the create date of this department_ details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department_ ID of this department_ details.
	 *
	 * @param Department_Id the department_ ID of this department_ details
	 */
	@Override
	public void setDepartment_Id(int Department_Id) {
		model.setDepartment_Id(Department_Id);
	}

	/**
	 * Sets the department_ name of this department_ details.
	 *
	 * @param Department_Name the department_ name of this department_ details
	 */
	@Override
	public void setDepartment_Name(String Department_Name) {
		model.setDepartment_Name(Department_Name);
	}

	/**
	 * Sets the group ID of this department_ details.
	 *
	 * @param groupId the group ID of this department_ details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this department_ details.
	 *
	 * @param modifiedDate the modified date of this department_ details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this department_ details.
	 *
	 * @param primaryKey the primary key of this department_ details
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this department_ details.
	 *
	 * @param userId the user ID of this department_ details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this department_ details.
	 *
	 * @param userName the user name of this department_ details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this department_ details.
	 *
	 * @param userUuid the user uuid of this department_ details
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this department_ details.
	 *
	 * @param uuid the uuid of this department_ details
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
	protected Department_DetailsWrapper wrap(
		Department_Details department_Details) {

		return new Department_DetailsWrapper(department_Details);
	}

}