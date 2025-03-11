/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.Practical_ServiceBuilder.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchEntity2Exception extends NoSuchModelException {

	public NoSuchEntity2Exception() {
	}

	public NoSuchEntity2Exception(String msg) {
		super(msg);
	}

	public NoSuchEntity2Exception(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchEntity2Exception(Throwable throwable) {
		super(throwable);
	}

}