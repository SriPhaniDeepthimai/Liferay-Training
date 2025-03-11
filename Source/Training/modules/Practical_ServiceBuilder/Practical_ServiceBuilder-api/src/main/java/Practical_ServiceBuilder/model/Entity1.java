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
 * The extended model interface for the Entity1 service. Represents a row in the &quot;Entity1_Entity1&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Entity1Model
 * @generated
 */
@ImplementationClassName("Practical_ServiceBuilder.model.impl.Entity1Impl")
@ProviderType
public interface Entity1 extends Entity1Model, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>Practical_ServiceBuilder.model.impl.Entity1Impl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Entity1, Long> STUDENT__ID_ACCESSOR =
		new Accessor<Entity1, Long>() {

			@Override
			public Long get(Entity1 entity1) {
				return entity1.getStudent_Id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Entity1> getTypeClass() {
				return Entity1.class;
			}

		};

}