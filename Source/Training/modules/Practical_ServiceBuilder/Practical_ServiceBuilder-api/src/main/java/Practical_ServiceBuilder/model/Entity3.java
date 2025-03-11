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
 * The extended model interface for the Entity3 service. Represents a row in the &quot;Entity1_Entity3&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Entity3Model
 * @generated
 */
@ImplementationClassName("Practical_ServiceBuilder.model.impl.Entity3Impl")
@ProviderType
public interface Entity3 extends Entity3Model, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>Practical_ServiceBuilder.model.impl.Entity3Impl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Entity3, Integer> TEACHER__ID_ACCESSOR =
		new Accessor<Entity3, Integer>() {

			@Override
			public Integer get(Entity3 entity3) {
				return entity3.getTeacher_Id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Entity3> getTypeClass() {
				return Entity3.class;
			}

		};

}