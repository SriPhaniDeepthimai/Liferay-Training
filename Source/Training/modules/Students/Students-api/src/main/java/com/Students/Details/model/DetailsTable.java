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
 * The table class for the &quot;Student_Details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Details
 * @generated
 */
public class DetailsTable extends BaseTable<DetailsTable> {

	public static final DetailsTable INSTANCE = new DetailsTable();

	public final Column<DetailsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, Integer> Student_Id = createColumn(
		"Student_Id", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<DetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, String> Student_Name = createColumn(
		"Student_Name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailsTable, Integer> Department_Id = createColumn(
		"Department_Id", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private DetailsTable() {
		super("Student_Details", DetailsTable::new);
	}

}