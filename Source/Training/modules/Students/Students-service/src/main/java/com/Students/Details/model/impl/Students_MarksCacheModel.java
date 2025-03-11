/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.Students_Marks;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Students_Marks in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Students_MarksCacheModel
	implements CacheModel<Students_Marks>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Students_MarksCacheModel)) {
			return false;
		}

		Students_MarksCacheModel students_MarksCacheModel =
			(Students_MarksCacheModel)object;

		if (Student_Id == students_MarksCacheModel.Student_Id) {
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
		StringBundler sb = new StringBundler(19);

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
		sb.append(", Student_Marks=");
		sb.append(Student_Marks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Students_Marks toEntityModel() {
		Students_MarksImpl students_MarksImpl = new Students_MarksImpl();

		if (uuid == null) {
			students_MarksImpl.setUuid("");
		}
		else {
			students_MarksImpl.setUuid(uuid);
		}

		students_MarksImpl.setStudent_Id(Student_Id);
		students_MarksImpl.setGroupId(groupId);
		students_MarksImpl.setCompanyId(companyId);
		students_MarksImpl.setUserId(userId);

		if (userName == null) {
			students_MarksImpl.setUserName("");
		}
		else {
			students_MarksImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			students_MarksImpl.setCreateDate(null);
		}
		else {
			students_MarksImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			students_MarksImpl.setModifiedDate(null);
		}
		else {
			students_MarksImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (Student_Marks == null) {
			students_MarksImpl.setStudent_Marks("");
		}
		else {
			students_MarksImpl.setStudent_Marks(Student_Marks);
		}

		students_MarksImpl.resetOriginalValues();

		return students_MarksImpl;
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
		Student_Marks = objectInput.readUTF();
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

		if (Student_Marks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Student_Marks);
		}
	}

	public String uuid;
	public int Student_Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String Student_Marks;

}