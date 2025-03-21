/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Entity2 service. Represents a row in the &quot;Entity1_Entity2&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>Practical_ServiceBuilder.model.impl.Entity2ModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>Practical_ServiceBuilder.model.impl.Entity2Impl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity2
 * @generated
 */
@ProviderType
public interface Entity2Model extends BaseModel<Entity2> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a entity2 model instance should use the {@link Entity2} interface instead.
	 */

	/**
	 * Returns the primary key of this entity2.
	 *
	 * @return the primary key of this entity2
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this entity2.
	 *
	 * @param primaryKey the primary key of this entity2
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the uuid of this entity2.
	 *
	 * @return the uuid of this entity2
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this entity2.
	 *
	 * @param uuid the uuid of this entity2
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the student ID of this entity2.
	 *
	 * @return the student ID of this entity2
	 */
	public int getStudentId();

	/**
	 * Sets the student ID of this entity2.
	 *
	 * @param StudentId the student ID of this entity2
	 */
	public void setStudentId(int StudentId);

	/**
	 * Returns the student_ name of this entity2.
	 *
	 * @return the student_ name of this entity2
	 */
	@AutoEscape
	public String getStudent_Name();

	/**
	 * Sets the student_ name of this entity2.
	 *
	 * @param Student_Name the student_ name of this entity2
	 */
	public void setStudent_Name(String Student_Name);

	@Override
	public Entity2 cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}