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
 * This class is a wrapper for {@link Entity4}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity4
 * @generated
 */
public class Entity4Wrapper
	extends BaseModelWrapper<Entity4>
	implements Entity4, ModelWrapper<Entity4> {

	public Entity4Wrapper(Entity4 entity4) {
		super(entity4);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Department_Id", getDepartment_Id());
		attributes.put("Department_Name", getDepartment_Name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer Department_Id = (Integer)attributes.get("Department_Id");

		if (Department_Id != null) {
			setDepartment_Id(Department_Id);
		}

		String Department_Name = (String)attributes.get("Department_Name");

		if (Department_Name != null) {
			setDepartment_Name(Department_Name);
		}
	}

	@Override
	public Entity4 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the department_ ID of this entity4.
	 *
	 * @return the department_ ID of this entity4
	 */
	@Override
	public int getDepartment_Id() {
		return model.getDepartment_Id();
	}

	/**
	 * Returns the department_ name of this entity4.
	 *
	 * @return the department_ name of this entity4
	 */
	@Override
	public String getDepartment_Name() {
		return model.getDepartment_Name();
	}

	/**
	 * Returns the primary key of this entity4.
	 *
	 * @return the primary key of this entity4
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this entity4.
	 *
	 * @return the uuid of this entity4
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
	 * Sets the department_ ID of this entity4.
	 *
	 * @param Department_Id the department_ ID of this entity4
	 */
	@Override
	public void setDepartment_Id(int Department_Id) {
		model.setDepartment_Id(Department_Id);
	}

	/**
	 * Sets the department_ name of this entity4.
	 *
	 * @param Department_Name the department_ name of this entity4
	 */
	@Override
	public void setDepartment_Name(String Department_Name) {
		model.setDepartment_Name(Department_Name);
	}

	/**
	 * Sets the primary key of this entity4.
	 *
	 * @param primaryKey the primary key of this entity4
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this entity4.
	 *
	 * @param uuid the uuid of this entity4
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
	protected Entity4Wrapper wrap(Entity4 entity4) {
		return new Entity4Wrapper(entity4);
	}

}