/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package Practical_ServiceBuilder.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchEntity4Exception extends NoSuchModelException {

	public NoSuchEntity4Exception() {
	}

	public NoSuchEntity4Exception(String msg) {
		super(msg);
	}

	public NoSuchEntity4Exception(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchEntity4Exception(Throwable throwable) {
		super(throwable);
	}

}