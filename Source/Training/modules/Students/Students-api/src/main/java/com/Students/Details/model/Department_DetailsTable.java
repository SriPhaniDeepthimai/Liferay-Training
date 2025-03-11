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
 * The table class for the &quot;Department_Details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Department_Details
 * @generated
 */
public class Department_DetailsTable
	extends BaseTable<Department_DetailsTable> {

	public static final Department_DetailsTable INSTANCE =
		new Department_DetailsTable();

	public final Column<Department_DetailsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, Integer> Department_Id =
		createColumn(
			"Department_Id", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<Department_DetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<Department_DetailsTable, String> Department_Name =
		createColumn(
			"Department_Name", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private Department_DetailsTable() {
		super("Department_Details", Department_DetailsTable::new);
	}

}