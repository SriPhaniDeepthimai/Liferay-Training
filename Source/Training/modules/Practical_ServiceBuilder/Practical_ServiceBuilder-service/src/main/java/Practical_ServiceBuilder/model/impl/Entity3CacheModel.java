/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model.impl;

import Practical_ServiceBuilder.model.Entity3;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entity3 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Entity3CacheModel implements CacheModel<Entity3>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Entity3CacheModel)) {
			return false;
		}

		Entity3CacheModel entity3CacheModel = (Entity3CacheModel)object;

		if (Teacher_Id == entity3CacheModel.Teacher_Id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Teacher_Id=");
		sb.append(Teacher_Id);
		sb.append(", Teacher_Name=");
		sb.append(Teacher_Name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entity3 toEntityModel() {
		Entity3Impl entity3Impl = new Entity3Impl();

		if (uuid == null) {
			entity3Impl.setUuid("");
		}
		else {
			entity3Impl.setUuid(uuid);
		}

		entity3Impl.setTeacher_Id(Teacher_Id);

		if (Teacher_Name == null) {
			entity3Impl.setTeacher_Name("");
		}
		else {
			entity3Impl.setTeacher_Name(Teacher_Name);
		}

		entity3Impl.resetOriginalValues();

		return entity3Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Teacher_Id = objectInput.readInt();
		Teacher_Name = objectInput.readUTF();
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

		if (Teacher_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Teacher_Name);
		}
	}

	public String uuid;
	public int Teacher_Id;
	public String Teacher_Name;

}