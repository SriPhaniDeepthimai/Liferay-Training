/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Entity4 service. Represents a row in the &quot;Entity1_Entity4&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>Practical_ServiceBuilder.model.impl.Entity4ModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>Practical_ServiceBuilder.model.impl.Entity4Impl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity4
 * @generated
 */
@ProviderType
public interface Entity4Model extends BaseModel<Entity4> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a entity4 model instance should use the {@link Entity4} interface instead.
	 */

	/**
	 * Returns the primary key of this entity4.
	 *
	 * @return the primary key of this entity4
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this entity4.
	 *
	 * @param primaryKey the primary key of this entity4
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the uuid of this entity4.
	 *
	 * @return the uuid of this entity4
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this entity4.
	 *
	 * @param uuid the uuid of this entity4
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the department_ ID of this entity4.
	 *
	 * @return the department_ ID of this entity4
	 */
	public int getDepartment_Id();

	/**
	 * Sets the department_ ID of this entity4.
	 *
	 * @param Department_Id the department_ ID of this entity4
	 */
	public void setDepartment_Id(int Department_Id);

	/**
	 * Returns the department_ name of this entity4.
	 *
	 * @return the department_ name of this entity4
	 */
	@AutoEscape
	public String getDepartment_Name();

	/**
	 * Sets the department_ name of this entity4.
	 *
	 * @param Department_Name the department_ name of this entity4
	 */
	public void setDepartment_Name(String Department_Name);

	@Override
	public Entity4 cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}