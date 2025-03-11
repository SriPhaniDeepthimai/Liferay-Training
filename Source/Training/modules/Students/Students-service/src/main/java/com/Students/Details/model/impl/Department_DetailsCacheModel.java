/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.Department_Details;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Department_Details in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Department_DetailsCacheModel
	implements CacheModel<Department_Details>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Department_DetailsCacheModel)) {
			return false;
		}

		Department_DetailsCacheModel department_DetailsCacheModel =
			(Department_DetailsCacheModel)object;

		if (Department_Id == department_DetailsCacheModel.Department_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Department_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Department_Id=");
		sb.append(Department_Id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", Department_Name=");
		sb.append(Department_Name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Department_Details toEntityModel() {
		Department_DetailsImpl department_DetailsImpl =
			new Department_DetailsImpl();

		if (uuid == null) {
			department_DetailsImpl.setUuid("");
		}
		else {
			department_DetailsImpl.setUuid(uuid);
		}

		department_DetailsImpl.setDepartment_Id(Department_Id);
		department_DetailsImpl.setGroupId(groupId);
		department_DetailsImpl.setCompanyId(companyId);
		department_DetailsImpl.setUserId(userId);

		if (userName == null) {
			department_DetailsImpl.setUserName("");
		}
		else {
			department_DetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			department_DetailsImpl.setCreateDate(null);
		}
		else {
			department_DetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			department_DetailsImpl.setModifiedDate(null);
		}
		else {
			department_DetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (Department_Name == null) {
			department_DetailsImpl.setDepartment_Name("");
		}
		else {
			department_DetailsImpl.setDepartment_Name(Department_Name);
		}

		department_DetailsImpl.resetOriginalValues();

		return department_DetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Department_Id = objectInput.readInt();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		Department_Name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(Department_Id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (Department_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Department_Name);
		}
	}

	public String uuid;
	public int Department_Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String Department_Name;

}