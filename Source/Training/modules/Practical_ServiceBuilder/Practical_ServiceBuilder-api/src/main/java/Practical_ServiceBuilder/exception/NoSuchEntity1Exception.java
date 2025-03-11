/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package Practical_ServiceBuilder.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchEntity1Exception extends NoSuchModelException {

	public NoSuchEntity1Exception() {
	}

	public NoSuchEntity1Exception(String msg) {
		super(msg);
	}

	public NoSuchEntity1Exception(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchEntity1Exception(Throwable throwable) {
		super(throwable);
	}

}