/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.impl;

import com.Students.Details.model.TeacherDetailsTable;
import com.Students.Details.model.impl.TeacherDetailsImpl;
import com.Students.Details.model.impl.TeacherDetailsModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from TeacherDetails.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.Students.Details.model.impl.TeacherDetailsImpl",
		"table.name=Teacher_Details"
	},
	service = ArgumentsResolver.class
)
public class TeacherDetailsModelArgumentsResolver implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		TeacherDetailsModelImpl teacherDetailsModelImpl =
			(TeacherDetailsModelImpl)baseModel;

		long columnBitmask = teacherDetailsModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(teacherDetailsModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					teacherDetailsModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(teacherDetailsModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return TeacherDetailsImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return TeacherDetailsTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		TeacherDetailsModelImpl teacherDetailsModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = teacherDetailsModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = teacherDetailsModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}