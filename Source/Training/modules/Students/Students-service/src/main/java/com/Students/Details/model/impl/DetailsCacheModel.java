/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.Details;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Details in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DetailsCacheModel implements CacheModel<Details>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DetailsCacheModel)) {
			return false;
		}

		DetailsCacheModel detailsCacheModel = (DetailsCacheModel)object;

		if (Student_Id == detailsCacheModel.Student_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Student_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Student_Id=");
		sb.append(Student_Id);
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
		sb.append(", Student_Name=");
		sb.append(Student_Name);
		sb.append(", Department_Id=");
		sb.append(Department_Id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Details toEntityModel() {
		DetailsImpl detailsImpl = new DetailsImpl();

		if (uuid == null) {
			detailsImpl.setUuid("");
		}
		else {
			detailsImpl.setUuid(uuid);
		}

		detailsImpl.setStudent_Id(Student_Id);
		detailsImpl.setGroupId(groupId);
		detailsImpl.setCompanyId(companyId);
		detailsImpl.setUserId(userId);

		if (userName == null) {
			detailsImpl.setUserName("");
		}
		else {
			detailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			detailsImpl.setCreateDate(null);
		}
		else {
			detailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			detailsImpl.setModifiedDate(null);
		}
		else {
			detailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (Student_Name == null) {
			detailsImpl.setStudent_Name("");
		}
		else {
			detailsImpl.setStudent_Name(Student_Name);
		}

		detailsImpl.setDepartment_Id(Department_Id);

		detailsImpl.resetOriginalValues();

		return detailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Student_Id = objectInput.readInt();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		Student_Name = objectInput.readUTF();

		Department_Id = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(Student_Id);

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

		if (Student_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Student_Name);
		}

		objectOutput.writeInt(Department_Id);
	}

	public String uuid;
	public int Student_Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String Student_Name;
	public int Department_Id;

}