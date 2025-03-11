/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Students_Marks&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Students_Marks
 * @generated
 */
public class Students_MarksTable extends BaseTable<Students_MarksTable> {

	public static final Students_MarksTable INSTANCE =
		new Students_MarksTable();

	public final Column<Students_MarksTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, Integer> Student_Id = createColumn(
		"Student_Id", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<Students_MarksTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<Students_MarksTable, String> Student_Marks =
		createColumn(
			"Student_Marks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private Students_MarksTable() {
		super("Students_Marks", Students_MarksTable::new);
	}

}