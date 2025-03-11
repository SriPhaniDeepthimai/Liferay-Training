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
 * The extended model interface for the TeacherDetails service. Represents a row in the &quot;Teacher_Details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetailsModel
 * @generated
 */
@ImplementationClassName("com.Students.Details.model.impl.TeacherDetailsImpl")
@ProviderType
public interface TeacherDetails extends PersistedModel, TeacherDetailsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.Students.Details.model.impl.TeacherDetailsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TeacherDetails, Integer> TEACHER__ID_ACCESSOR =
		new Accessor<TeacherDetails, Integer>() {

			@Override
			public Integer get(TeacherDetails teacherDetails) {
				return teacherDetails.getTeacher_Id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<TeacherDetails> getTypeClass() {
				return TeacherDetails.class;
			}

		};

}