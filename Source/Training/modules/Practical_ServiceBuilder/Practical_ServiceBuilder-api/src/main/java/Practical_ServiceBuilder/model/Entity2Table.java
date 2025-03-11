/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Entity1_Entity2&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Entity2
 * @generated
 */
public class Entity2Table extends BaseTable<Entity2Table> {

	public static final Entity2Table INSTANCE = new Entity2Table();

	public final Column<Entity2Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Entity2Table, Integer> StudentId = createColumn(
		"StudentId", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<Entity2Table, String> Student_Name = createColumn(
		"Student_Name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private Entity2Table() {
		super("Entity1_Entity2", Entity2Table::new);
	}

}