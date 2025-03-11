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
 * The extended model interface for the Students_Marks service. Represents a row in the &quot;Students_Marks&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Students_MarksModel
 * @generated
 */
@ImplementationClassName("com.Students.Details.model.impl.Students_MarksImpl")
@ProviderType
public interface Students_Marks extends PersistedModel, Students_MarksModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.Students.Details.model.impl.Students_MarksImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Students_Marks, Integer> STUDENT__ID_ACCESSOR =
		new Accessor<Students_Marks, Integer>() {

			@Override
			public Integer get(Students_Marks students_Marks) {
				return students_Marks.getStudent_Id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Students_Marks> getTypeClass() {
				return Students_Marks.class;
			}

		};

}