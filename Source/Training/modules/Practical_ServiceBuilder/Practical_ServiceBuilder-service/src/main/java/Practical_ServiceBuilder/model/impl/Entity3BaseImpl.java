/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model.impl;

import Practical_ServiceBuilder.model.Entity3;

import Practical_ServiceBuilder.service.Entity3LocalServiceUtil;

/**
 * The extended model base implementation for the Entity3 service. Represents a row in the &quot;Entity1_Entity3&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Entity3Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity3Impl
 * @see Entity3
 * @generated
 */
public abstract class Entity3BaseImpl
	extends Entity3ModelImpl implements Entity3 {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a entity3 model instance should use the <code>Entity3</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			Entity3LocalServiceUtil.addEntity3(this);
		}
		else {
			Entity3LocalServiceUtil.updateEntity3(this);
		}
	}

}