/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.test;

import Practical_ServiceBuilder.exception.NoSuchEntity4Exception;

import Practical_ServiceBuilder.model.Entity4;

import Practical_ServiceBuilder.service.Entity4LocalServiceUtil;
import Practical_ServiceBuilder.service.persistence.Entity4Persistence;
import Practical_ServiceBuilder.service.persistence.Entity4Util;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class Entity4PersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "Practical_ServiceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = Entity4Util.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Entity4> iterator = _entity4s.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity4 entity4 = _persistence.create(pk);

		Assert.assertNotNull(entity4);

		Assert.assertEquals(entity4.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Entity4 newEntity4 = addEntity4();

		_persistence.remove(newEntity4);

		Entity4 existingEntity4 = _persistence.fetchByPrimaryKey(
			newEntity4.getPrimaryKey());

		Assert.assertNull(existingEntity4);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEntity4();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity4 newEntity4 = _persistence.create(pk);

		newEntity4.setUuid(RandomTestUtil.randomString());

		newEntity4.setDepartment_Name(RandomTestUtil.randomString());

		_entity4s.add(_persistence.update(newEntity4));

		Entity4 existingEntity4 = _persistence.findByPrimaryKey(
			newEntity4.getPrimaryKey());

		Assert.assertEquals(existingEntity4.getUuid(), newEntity4.getUuid());
		Assert.assertEquals(
			existingEntity4.getDepartment_Id(), newEntity4.getDepartment_Id());
		Assert.assertEquals(
			existingEntity4.getDepartment_Name(),
			newEntity4.getDepartment_Name());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByDepartments() throws Exception {
		_persistence.countByDepartments(RandomTestUtil.nextInt());

		_persistence.countByDepartments(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Entity4 newEntity4 = addEntity4();

		Entity4 existingEntity4 = _persistence.findByPrimaryKey(
			newEntity4.getPrimaryKey());

		Assert.assertEquals(existingEntity4, newEntity4);
	}

	@Test(expected = NoSuchEntity4Exception.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Entity4> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Entity1_Entity4", "uuid", true, "Department_Id", true,
			"Department_Name", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Entity4 newEntity4 = addEntity4();

		Entity4 existingEntity4 = _persistence.fetchByPrimaryKey(
			newEntity4.getPrimaryKey());

		Assert.assertEquals(existingEntity4, newEntity4);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity4 missingEntity4 = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEntity4);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Entity4 newEntity41 = addEntity4();
		Entity4 newEntity42 = addEntity4();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity41.getPrimaryKey());
		primaryKeys.add(newEntity42.getPrimaryKey());

		Map<Serializable, Entity4> entity4s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, entity4s.size());
		Assert.assertEquals(
			newEntity41, entity4s.get(newEntity41.getPrimaryKey()));
		Assert.assertEquals(
			newEntity42, entity4s.get(newEntity42.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Entity4> entity4s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity4s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Entity4 newEntity4 = addEntity4();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity4.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Entity4> entity4s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity4s.size());
		Assert.assertEquals(
			newEntity4, entity4s.get(newEntity4.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Entity4> entity4s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity4s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Entity4 newEntity4 = addEntity4();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity4.getPrimaryKey());

		Map<Serializable, Entity4> entity4s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity4s.size());
		Assert.assertEquals(
			newEntity4, entity4s.get(newEntity4.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			Entity4LocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Entity4>() {

				@Override
				public void performAction(Entity4 entity4) {
					Assert.assertNotNull(entity4);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Entity4 newEntity4 = addEntity4();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity4.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Department_Id", newEntity4.getDepartment_Id()));

		List<Entity4> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Entity4 existingEntity4 = result.get(0);

		Assert.assertEquals(existingEntity4, newEntity4);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity4.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Department_Id", RandomTestUtil.nextInt()));

		List<Entity4> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Entity4 newEntity4 = addEntity4();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity4.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Department_Id"));

		Object newDepartment_Id = newEntity4.getDepartment_Id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Department_Id", new Object[] {newDepartment_Id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDepartment_Id = result.get(0);

		Assert.assertEquals(existingDepartment_Id, newDepartment_Id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity4.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Department_Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Department_Id", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Entity4 addEntity4() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity4 entity4 = _persistence.create(pk);

		entity4.setUuid(RandomTestUtil.randomString());

		entity4.setDepartment_Name(RandomTestUtil.randomString());

		_entity4s.add(_persistence.update(entity4));

		return entity4;
	}

	private List<Entity4> _entity4s = new ArrayList<Entity4>();
	private Entity4Persistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}