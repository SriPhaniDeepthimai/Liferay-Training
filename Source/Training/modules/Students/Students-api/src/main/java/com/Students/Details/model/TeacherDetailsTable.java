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
 * The table class for the &quot;Teacher_Details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetails
 * @generated
 */
public class TeacherDetailsTable extends BaseTable<TeacherDetailsTable> {

	public static final TeacherDetailsTable INSTANCE =
		new TeacherDetailsTable();

	public final Column<TeacherDetailsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, Integer> Teacher_Id = createColumn(
		"Teacher_Id", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<TeacherDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, String> Teacher_Name =
		createColumn(
			"Teacher_Name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TeacherDetailsTable, Integer> Department_Id =
		createColumn(
			"Department_Id", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private TeacherDetailsTable() {
		super("Teacher_Details", TeacherDetailsTable::new);
	}

}