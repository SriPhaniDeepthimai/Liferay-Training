/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model.impl;

import Practical_ServiceBuilder.model.Entity4;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entity4 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Entity4CacheModel implements CacheModel<Entity4>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Entity4CacheModel)) {
			return false;
		}

		Entity4CacheModel entity4CacheModel = (Entity4CacheModel)object;

		if (Department_Id == entity4CacheModel.Department_Id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Department_Id=");
		sb.append(Department_Id);
		sb.append(", Department_Name=");
		sb.append(Department_Name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entity4 toEntityModel() {
		Entity4Impl entity4Impl = new Entity4Impl();

		if (uuid == null) {
			entity4Impl.setUuid("");
		}
		else {
			entity4Impl.setUuid(uuid);
		}

		entity4Impl.setDepartment_Id(Department_Id);

		if (Department_Name == null) {
			entity4Impl.setDepartment_Name("");
		}
		else {
			entity4Impl.setDepartment_Name(Department_Name);
		}

		entity4Impl.resetOriginalValues();

		return entity4Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Department_Id = objectInput.readInt();
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

		if (Department_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Department_Name);
		}
	}

	public String uuid;
	public int Department_Id;
	public String Department_Name;

}