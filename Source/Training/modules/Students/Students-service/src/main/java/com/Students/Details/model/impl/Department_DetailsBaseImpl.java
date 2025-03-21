/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.Department_Details;
import com.Students.Details.service.Department_DetailsLocalServiceUtil;

/**
 * The extended model base implementation for the Department_Details service. Represents a row in the &quot;Department_Details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Department_DetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department_DetailsImpl
 * @see Department_Details
 * @generated
 */
public abstract class Department_DetailsBaseImpl
	extends Department_DetailsModelImpl implements Department_Details {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a department_ details model instance should use the <code>Department_Details</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			Department_DetailsLocalServiceUtil.addDepartment_Details(this);
		}
		else {
			Department_DetailsLocalServiceUtil.updateDepartment_Details(this);
		}
	}

}