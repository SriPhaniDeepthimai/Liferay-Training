/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Entity1_Entity3&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Entity3
 * @generated
 */
public class Entity3Table extends BaseTable<Entity3Table> {

	public static final Entity3Table INSTANCE = new Entity3Table();

	public final Column<Entity3Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Entity3Table, Integer> Teacher_Id = createColumn(
		"Teacher_Id", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<Entity3Table, String> Teacher_Name = createColumn(
		"Teacher_Name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private Entity3Table() {
		super("Entity1_Entity3", Entity3Table::new);
	}

}