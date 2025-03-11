/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Department_Details service. Represents a row in the &quot;Department_Details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Department_DetailsModel
 * @generated
 */
@ImplementationClassName(
	"com.Students.Details.model.impl.Department_DetailsImpl"
)
@ProviderType
public interface Department_Details
	extends Department_DetailsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.Students.Details.model.impl.Department_DetailsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Department_Details, Integer>
		DEPARTMENT__ID_ACCESSOR = new Accessor<Department_Details, Integer>() {

			@Override
			public Integer get(Department_Details department_Details) {
				return department_Details.getDepartment_Id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Department_Details> getTypeClass() {
				return Department_Details.class;
			}

		};

}