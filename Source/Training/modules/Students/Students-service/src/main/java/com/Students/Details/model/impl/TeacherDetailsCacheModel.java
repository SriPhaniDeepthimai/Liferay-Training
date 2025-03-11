/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.TeacherDetails;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TeacherDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TeacherDetailsCacheModel
	implements CacheModel<TeacherDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TeacherDetailsCacheModel)) {
			return false;
		}

		TeacherDetailsCacheModel teacherDetailsCacheModel =
			(TeacherDetailsCacheModel)object;

		if (Teacher_Id == teacherDetailsCacheModel.Teacher_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Teacher_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Teacher_Id=");
		sb.append(Teacher_Id);
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
		sb.append(", Teacher_Name=");
		sb.append(Teacher_Name);
		sb.append(", Department_Id=");
		sb.append(Department_Id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TeacherDetails toEntityModel() {
		TeacherDetailsImpl teacherDetailsImpl = new TeacherDetailsImpl();

		if (uuid == null) {
			teacherDetailsImpl.setUuid("");
		}
		else {
			teacherDetailsImpl.setUuid(uuid);
		}

		teacherDetailsImpl.setTeacher_Id(Teacher_Id);
		teacherDetailsImpl.setGroupId(groupId);
		teacherDetailsImpl.setCompanyId(companyId);
		teacherDetailsImpl.setUserId(userId);

		if (userName == null) {
			teacherDetailsImpl.setUserName("");
		}
		else {
			teacherDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			teacherDetailsImpl.setCreateDate(null);
		}
		else {
			teacherDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			teacherDetailsImpl.setModifiedDate(null);
		}
		else {
			teacherDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (Teacher_Name == null) {
			teacherDetailsImpl.setTeacher_Name("");
		}
		else {
			teacherDetailsImpl.setTeacher_Name(Teacher_Name);
		}

		teacherDetailsImpl.setDepartment_Id(Department_Id);

		teacherDetailsImpl.resetOriginalValues();

		return teacherDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Teacher_Id = objectInput.readInt();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		Teacher_Name = objectInput.readUTF();

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

		objectOutput.writeInt(Teacher_Id);

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

		if (Teacher_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Teacher_Name);
		}

		objectOutput.writeInt(Department_Id);
	}

	public String uuid;
	public int Teacher_Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String Teacher_Name;
	public int Department_Id;

}