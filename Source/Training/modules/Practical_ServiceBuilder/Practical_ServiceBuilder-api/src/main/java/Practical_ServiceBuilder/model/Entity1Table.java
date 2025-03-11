/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Entity1_Entity1&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Entity1
 * @generated
 */
public class Entity1Table extends BaseTable<Entity1Table> {

	public static final Entity1Table INSTANCE = new Entity1Table();

	public final Column<Entity1Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Entity1Table, Long> Student_Id = createColumn(
		"Student_Id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<Entity1Table, String> Student_Name = createColumn(
		"Student_Name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Entity1Table, Integer> Maths_Marks = createColumn(
		"Maths_Marks", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private Entity1Table() {
		super("Entity1_Entity1", Entity1Table::new);
	}

}