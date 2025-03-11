/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Entity1_Entity4&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Entity4
 * @generated
 */
public class Entity4Table extends BaseTable<Entity4Table> {

	public static final Entity4Table INSTANCE = new Entity4Table();

	public final Column<Entity4Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Entity4Table, Integer> Department_Id = createColumn(
		"Department_Id", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<Entity4Table, String> Department_Name = createColumn(
		"Department_Name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private Entity4Table() {
		super("Entity1_Entity4", Entity4Table::new);
	}

}