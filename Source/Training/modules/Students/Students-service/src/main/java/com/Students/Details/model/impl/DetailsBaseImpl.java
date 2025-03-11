/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalServiceUtil;

/**
 * The extended model base implementation for the Details service. Represents a row in the &quot;Student_Details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailsImpl
 * @see Details
 * @generated
 */
public abstract class DetailsBaseImpl
	extends DetailsModelImpl implements Details {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a details model instance should use the <code>Details</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			DetailsLocalServiceUtil.addDetails(this);
		}
		else {
			DetailsLocalServiceUtil.updateDetails(this);
		}
	}

}