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
 * This class is a wrapper for {@link Entity2}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity2
 * @generated
 */
public class Entity2Wrapper
	extends BaseModelWrapper<Entity2>
	implements Entity2, ModelWrapper<Entity2> {

	public Entity2Wrapper(Entity2 entity2) {
		super(entity2);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("StudentId", getStudentId());
		attributes.put("Student_Name", getStudent_Name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer StudentId = (Integer)attributes.get("StudentId");

		if (StudentId != null) {
			setStudentId(StudentId);
		}

		String Student_Name = (String)attributes.get("Student_Name");

		if (Student_Name != null) {
			setStudent_Name(Student_Name);
		}
	}

	@Override
	public Entity2 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this entity2.
	 *
	 * @return the primary key of this entity2
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student_ name of this entity2.
	 *
	 * @return the student_ name of this entity2
	 */
	@Override
	public String getStudent_Name() {
		return model.getStudent_Name();
	}

	/**
	 * Returns the student ID of this entity2.
	 *
	 * @return the student ID of this entity2
	 */
	@Override
	public int getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the uuid of this entity2.
	 *
	 * @return the uuid of this entity2
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
	 * Sets the primary key of this entity2.
	 *
	 * @param primaryKey the primary key of this entity2
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student_ name of this entity2.
	 *
	 * @param Student_Name the student_ name of this entity2
	 */
	@Override
	public void setStudent_Name(String Student_Name) {
		model.setStudent_Name(Student_Name);
	}

	/**
	 * Sets the student ID of this entity2.
	 *
	 * @param StudentId the student ID of this entity2
	 */
	@Override
	public void setStudentId(int StudentId) {
		model.setStudentId(StudentId);
	}

	/**
	 * Sets the uuid of this entity2.
	 *
	 * @param uuid the uuid of this entity2
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
	protected Entity2Wrapper wrap(Entity2 entity2) {
		return new Entity2Wrapper(entity2);
	}

}