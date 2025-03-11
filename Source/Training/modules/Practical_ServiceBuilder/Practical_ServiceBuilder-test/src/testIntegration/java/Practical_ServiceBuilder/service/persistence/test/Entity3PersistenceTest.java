/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.test;

import Practical_ServiceBuilder.exception.NoSuchEntity3Exception;

import Practical_ServiceBuilder.model.Entity3;

import Practical_ServiceBuilder.service.Entity3LocalServiceUtil;
import Practical_ServiceBuilder.service.persistence.Entity3Persistence;
import Practical_ServiceBuilder.service.persistence.Entity3Util;

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
public class Entity3PersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "Practical_ServiceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = Entity3Util.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Entity3> iterator = _entity3s.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity3 entity3 = _persistence.create(pk);

		Assert.assertNotNull(entity3);

		Assert.assertEquals(entity3.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Entity3 newEntity3 = addEntity3();

		_persistence.remove(newEntity3);

		Entity3 existingEntity3 = _persistence.fetchByPrimaryKey(
			newEntity3.getPrimaryKey());

		Assert.assertNull(existingEntity3);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEntity3();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity3 newEntity3 = _persistence.create(pk);

		newEntity3.setUuid(RandomTestUtil.randomString());

		newEntity3.setTeacher_Name(RandomTestUtil.randomString());

		_entity3s.add(_persistence.update(newEntity3));

		Entity3 existingEntity3 = _persistence.findByPrimaryKey(
			newEntity3.getPrimaryKey());

		Assert.assertEquals(existingEntity3.getUuid(), newEntity3.getUuid());
		Assert.assertEquals(
			existingEntity3.getTeacher_Id(), newEntity3.getTeacher_Id());
		Assert.assertEquals(
			existingEntity3.getTeacher_Name(), newEntity3.getTeacher_Name());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByTeachers() throws Exception {
		_persistence.countByTeachers(RandomTestUtil.nextInt());

		_persistence.countByTeachers(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Entity3 newEntity3 = addEntity3();

		Entity3 existingEntity3 = _persistence.findByPrimaryKey(
			newEntity3.getPrimaryKey());

		Assert.assertEquals(existingEntity3, newEntity3);
	}

	@Test(expected = NoSuchEntity3Exception.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Entity3> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Entity1_Entity3", "uuid", true, "Teacher_Id", true, "Teacher_Name",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Entity3 newEntity3 = addEntity3();

		Entity3 existingEntity3 = _persistence.fetchByPrimaryKey(
			newEntity3.getPrimaryKey());

		Assert.assertEquals(existingEntity3, newEntity3);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity3 missingEntity3 = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEntity3);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Entity3 newEntity31 = addEntity3();
		Entity3 newEntity32 = addEntity3();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity31.getPrimaryKey());
		primaryKeys.add(newEntity32.getPrimaryKey());

		Map<Serializable, Entity3> entity3s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, entity3s.size());
		Assert.assertEquals(
			newEntity31, entity3s.get(newEntity31.getPrimaryKey()));
		Assert.assertEquals(
			newEntity32, entity3s.get(newEntity32.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Entity3> entity3s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity3s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Entity3 newEntity3 = addEntity3();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity3.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Entity3> entity3s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity3s.size());
		Assert.assertEquals(
			newEntity3, entity3s.get(newEntity3.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Entity3> entity3s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity3s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Entity3 newEntity3 = addEntity3();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity3.getPrimaryKey());

		Map<Serializable, Entity3> entity3s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity3s.size());
		Assert.assertEquals(
			newEntity3, entity3s.get(newEntity3.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			Entity3LocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Entity3>() {

				@Override
				public void performAction(Entity3 entity3) {
					Assert.assertNotNull(entity3);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Entity3 newEntity3 = addEntity3();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity3.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Teacher_Id", newEntity3.getTeacher_Id()));

		List<Entity3> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Entity3 existingEntity3 = result.get(0);

		Assert.assertEquals(existingEntity3, newEntity3);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity3.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("Teacher_Id", RandomTestUtil.nextInt()));

		List<Entity3> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Entity3 newEntity3 = addEntity3();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity3.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Teacher_Id"));

		Object newTeacher_Id = newEntity3.getTeacher_Id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Teacher_Id", new Object[] {newTeacher_Id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingTeacher_Id = result.get(0);

		Assert.assertEquals(existingTeacher_Id, newTeacher_Id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity3.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Teacher_Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Teacher_Id", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Entity3 addEntity3() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity3 entity3 = _persistence.create(pk);

		entity3.setUuid(RandomTestUtil.randomString());

		entity3.setTeacher_Name(RandomTestUtil.randomString());

		_entity3s.add(_persistence.update(entity3));

		return entity3;
	}

	private List<Entity3> _entity3s = new ArrayList<Entity3>();
	private Entity3Persistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}