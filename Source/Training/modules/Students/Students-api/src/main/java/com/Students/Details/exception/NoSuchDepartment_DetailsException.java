/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.Students.Details.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchDepartment_DetailsException extends NoSuchModelException {

	public NoSuchDepartment_DetailsException() {
	}

	public NoSuchDepartment_DetailsException(String msg) {
		super(msg);
	}

	public NoSuchDepartment_DetailsException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchDepartment_DetailsException(Throwable throwable) {
		super(throwable);
	}

}