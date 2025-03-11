/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Entity3}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity3
 * @generated
 */
public class Entity3Wrapper
	extends BaseModelWrapper<Entity3>
	implements Entity3, ModelWrapper<Entity3> {

	public Entity3Wrapper(Entity3 entity3) {
		super(entity3);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Teacher_Id", getTeacher_Id());
		attributes.put("Teacher_Name", getTeacher_Name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer Teacher_Id = (Integer)attributes.get("Teacher_Id");

		if (Teacher_Id != null) {
			setTeacher_Id(Teacher_Id);
		}

		String Teacher_Name = (String)attributes.get("Teacher_Name");

		if (Teacher_Name != null) {
			setTeacher_Name(Teacher_Name);
		}
	}

	@Override
	public Entity3 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this entity3.
	 *
	 * @return the primary key of this entity3
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the teacher_ ID of this entity3.
	 *
	 * @return the teacher_ ID of this entity3
	 */
	@Override
	public int getTeacher_Id() {
		return model.getTeacher_Id();
	}

	/**
	 * Returns the teacher_ name of this entity3.
	 *
	 * @return the teacher_ name of this entity3
	 */
	@Override
	public String getTeacher_Name() {
		return model.getTeacher_Name();
	}

	/**
	 * Returns the uuid of this entity3.
	 *
	 * @return the uuid of this entity3
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
	 * Sets the primary key of this entity3.
	 *
	 * @param primaryKey the primary key of this entity3
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the teacher_ ID of this entity3.
	 *
	 * @param Teacher_Id the teacher_ ID of this entity3
	 */
	@Override
	public void setTeacher_Id(int Teacher_Id) {
		model.setTeacher_Id(Teacher_Id);
	}

	/**
	 * Sets the teacher_ name of this entity3.
	 *
	 * @param Teacher_Name the teacher_ name of this entity3
	 */
	@Override
	public void setTeacher_Name(String Teacher_Name) {
		model.setTeacher_Name(Teacher_Name);
	}

	/**
	 * Sets the uuid of this entity3.
	 *
	 * @param uuid the uuid of this entity3
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
	protected Entity3Wrapper wrap(Entity3 entity3) {
		return new Entity3Wrapper(entity3);
	}

}