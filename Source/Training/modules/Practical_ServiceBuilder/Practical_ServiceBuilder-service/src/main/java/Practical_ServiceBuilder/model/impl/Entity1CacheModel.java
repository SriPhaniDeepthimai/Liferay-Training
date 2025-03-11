/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model.impl;

import Practical_ServiceBuilder.model.Entity1;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entity1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Entity1CacheModel implements CacheModel<Entity1>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Entity1CacheModel)) {
			return false;
		}

		Entity1CacheModel entity1CacheModel = (Entity1CacheModel)object;

		if (Student_Id == entity1CacheModel.Student_Id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Student_Id=");
		sb.append(Student_Id);
		sb.append(", Student_Name=");
		sb.append(Student_Name);
		sb.append(", Maths_Marks=");
		sb.append(Maths_Marks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entity1 toEntityModel() {
		Entity1Impl entity1Impl = new Entity1Impl();

		if (uuid == null) {
			entity1Impl.setUuid("");
		}
		else {
			entity1Impl.setUuid(uuid);
		}

		entity1Impl.setStudent_Id(Student_Id);

		if (Student_Name == null) {
			entity1Impl.setStudent_Name("");
		}
		else {
			entity1Impl.setStudent_Name(Student_Name);
		}

		entity1Impl.setMaths_Marks(Maths_Marks);

		entity1Impl.resetOriginalValues();

		return entity1Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Student_Id = objectInput.readLong();
		Student_Name = objectInput.readUTF();

		Maths_Marks = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(Student_Id);

		if (Student_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Student_Name);
		}

		objectOutput.writeInt(Maths_Marks);
	}

	public String uuid;
	public long Student_Id;
	public String Student_Name;
	public int Maths_Marks;

}