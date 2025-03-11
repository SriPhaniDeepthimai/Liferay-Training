/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Entity4 service. Represents a row in the &quot;Entity1_Entity4&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Entity4Model
 * @generated
 */
@ImplementationClassName("Practical_ServiceBuilder.model.impl.Entity4Impl")
@ProviderType
public interface Entity4 extends Entity4Model, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>Practical_ServiceBuilder.model.impl.Entity4Impl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Entity4, Integer> DEPARTMENT__ID_ACCESSOR =
		new Accessor<Entity4, Integer>() {

			@Override
			public Integer get(Entity4 entity4) {
				return entity4.getDepartment_Id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Entity4> getTypeClass() {
				return Entity4.class;
			}

		};

}