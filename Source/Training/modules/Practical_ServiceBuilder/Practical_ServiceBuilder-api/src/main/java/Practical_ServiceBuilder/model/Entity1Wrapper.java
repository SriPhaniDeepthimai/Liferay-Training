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
 * This class is a wrapper for {@link Entity1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity1
 * @generated
 */
public class Entity1Wrapper
	extends BaseModelWrapper<Entity1>
	implements Entity1, ModelWrapper<Entity1> {

	public Entity1Wrapper(Entity1 entity1) {
		super(entity1);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Student_Id", getStudent_Id());
		attributes.put("Student_Name", getStudent_Name());
		attributes.put("Maths_Marks", getMaths_Marks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Student_Id = (Long)attributes.get("Student_Id");

		if (Student_Id != null) {
			setStudent_Id(Student_Id);
		}

		String Student_Name = (String)attributes.get("Student_Name");

		if (Student_Name != null) {
			setStudent_Name(Student_Name);
		}

		Integer Maths_Marks = (Integer)attributes.get("Maths_Marks");

		if (Maths_Marks != null) {
			setMaths_Marks(Maths_Marks);
		}
	}

	@Override
	public Entity1 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the maths_ marks of this entity1.
	 *
	 * @return the maths_ marks of this entity1
	 */
	@Override
	public int getMaths_Marks() {
		return model.getMaths_Marks();
	}

	/**
	 * Returns the primary key of this entity1.
	 *
	 * @return the primary key of this entity1
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student_ ID of this entity1.
	 *
	 * @return the student_ ID of this entity1
	 */
	@Override
	public long getStudent_Id() {
		return model.getStudent_Id();
	}

	/**
	 * Returns the student_ name of this entity1.
	 *
	 * @return the student_ name of this entity1
	 */
	@Override
	public String getStudent_Name() {
		return model.getStudent_Name();
	}

	/**
	 * Returns the uuid of this entity1.
	 *
	 * @return the uuid of this entity1
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
	 * Sets the maths_ marks of this entity1.
	 *
	 * @param Maths_Marks the maths_ marks of this entity1
	 */
	@Override
	public void setMaths_Marks(int Maths_Marks) {
		model.setMaths_Marks(Maths_Marks);
	}

	/**
	 * Sets the primary key of this entity1.
	 *
	 * @param primaryKey the primary key of this entity1
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student_ ID of this entity1.
	 *
	 * @param Student_Id the student_ ID of this entity1
	 */
	@Override
	public void setStudent_Id(long Student_Id) {
		model.setStudent_Id(Student_Id);
	}

	/**
	 * Sets the student_ name of this entity1.
	 *
	 * @param Student_Name the student_ name of this entity1
	 */
	@Override
	public void setStudent_Name(String Student_Name) {
		model.setStudent_Name(Student_Name);
	}

	/**
	 * Sets the uuid of this entity1.
	 *
	 * @param uuid the uuid of this entity1
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
	protected Entity1Wrapper wrap(Entity1 entity1) {
		return new Entity1Wrapper(entity1);
	}

}