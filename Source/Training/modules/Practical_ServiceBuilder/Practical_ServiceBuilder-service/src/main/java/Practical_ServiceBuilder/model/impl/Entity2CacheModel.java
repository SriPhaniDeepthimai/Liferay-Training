/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model.impl;

import Practical_ServiceBuilder.model.Entity2;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entity2 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Entity2CacheModel implements CacheModel<Entity2>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Entity2CacheModel)) {
			return false;
		}

		Entity2CacheModel entity2CacheModel = (Entity2CacheModel)object;

		if (StudentId == entity2CacheModel.StudentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, StudentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", StudentId=");
		sb.append(StudentId);
		sb.append(", Student_Name=");
		sb.append(Student_Name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entity2 toEntityModel() {
		Entity2Impl entity2Impl = new Entity2Impl();

		if (uuid == null) {
			entity2Impl.setUuid("");
		}
		else {
			entity2Impl.setUuid(uuid);
		}

		entity2Impl.setStudentId(StudentId);

		if (Student_Name == null) {
			entity2Impl.setStudent_Name("");
		}
		else {
			entity2Impl.setStudent_Name(Student_Name);
		}

		entity2Impl.resetOriginalValues();

		return entity2Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		StudentId = objectInput.readInt();
		Student_Name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(StudentId);

		if (Student_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Student_Name);
		}
	}

	public String uuid;
	public int StudentId;
	public String Student_Name;

}