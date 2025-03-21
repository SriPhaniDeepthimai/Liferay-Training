/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Details service. Represents a row in the &quot;Student_Details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.Students.Details.model.impl.DetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.Students.Details.model.impl.DetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Details
 * @generated
 */
@ProviderType
public interface DetailsModel
	extends BaseModel<Details>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a details model instance should use the {@link Details} interface instead.
	 */

	/**
	 * Returns the primary key of this details.
	 *
	 * @return the primary key of this details
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this details.
	 *
	 * @param primaryKey the primary key of this details
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the uuid of this details.
	 *
	 * @return the uuid of this details
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this details.
	 *
	 * @param uuid the uuid of this details
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the student_ ID of this details.
	 *
	 * @return the student_ ID of this details
	 */
	public int getStudent_Id();

	/**
	 * Sets the student_ ID of this details.
	 *
	 * @param Student_Id the student_ ID of this details
	 */
	public void setStudent_Id(int Student_Id);

	/**
	 * Returns the group ID of this details.
	 *
	 * @return the group ID of this details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this details.
	 *
	 * @param groupId the group ID of this details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this details.
	 *
	 * @return the company ID of this details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this details.
	 *
	 * @param companyId the company ID of this details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this details.
	 *
	 * @return the user ID of this details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this details.
	 *
	 * @param userId the user ID of this details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this details.
	 *
	 * @return the user uuid of this details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this details.
	 *
	 * @param userUuid the user uuid of this details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this details.
	 *
	 * @return the user name of this details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this details.
	 *
	 * @param userName the user name of this details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this details.
	 *
	 * @return the create date of this details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this details.
	 *
	 * @param createDate the create date of this details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this details.
	 *
	 * @return the modified date of this details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this details.
	 *
	 * @param modifiedDate the modified date of this details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the student_ name of this details.
	 *
	 * @return the student_ name of this details
	 */
	@AutoEscape
	public String getStudent_Name();

	/**
	 * Sets the student_ name of this details.
	 *
	 * @param Student_Name the student_ name of this details
	 */
	public void setStudent_Name(String Student_Name);

	/**
	 * Returns the department_ ID of this details.
	 *
	 * @return the department_ ID of this details
	 */
	public int getDepartment_Id();

	/**
	 * Sets the department_ ID of this details.
	 *
	 * @param Department_Id the department_ ID of this details
	 */
	public void setDepartment_Id(int Department_Id);

	@Override
	public Details cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}