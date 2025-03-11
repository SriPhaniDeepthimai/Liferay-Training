/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.test;

import Practical_ServiceBuilder.exception.NoSuchEntity1Exception;

import Practical_ServiceBuilder.model.Entity1;

import Practical_ServiceBuilder.service.Entity1LocalServiceUtil;
import Practical_ServiceBuilder.service.persistence.Entity1Persistence;
import Practical_ServiceBuilder.service.persistence.Entity1Util;

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
public class Entity1PersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "Practical_ServiceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = Entity1Util.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Entity1> iterator = _entity1s.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Entity1 entity1 = _persistence.create(pk);

		Assert.assertNotNull(entity1);

		Assert.assertEquals(entity1.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Entity1 newEntity1 = addEntity1();

		_persistence.remove(newEntity1);

		Entity1 existingEntity1 = _persistence.fetchByPrimaryKey(
			newEntity1.getPrimaryKey());

		Assert.assertNull(existingEntity1);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEntity1();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Entity1 newEntity1 = _persistence.create(pk);

		newEntity1.setUuid(RandomTestUtil.randomString());

		newEntity1.setStudent_Name(RandomTestUtil.randomString());

		newEntity1.setMaths_Marks(RandomTestUtil.nextInt());

		_entity1s.add(_persistence.update(newEntity1));

		Entity1 existingEntity1 = _persistence.findByPrimaryKey(
			newEntity1.getPrimaryKey());

		Assert.assertEquals(existingEntity1.getUuid(), newEntity1.getUuid());
		Assert.assertEquals(
			existingEntity1.getStudent_Id(), newEntity1.getStudent_Id());
		Assert.assertEquals(
			existingEntity1.getStudent_Name(), newEntity1.getStudent_Name());
		Assert.assertEquals(
			existingEntity1.getMaths_Marks(), newEntity1.getMaths_Marks());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByMarks() throws Exception {
		_persistence.countByMarks("");

		_persistence.countByMarks("null");

		_persistence.countByMarks((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Entity1 newEntity1 = addEntity1();

		Entity1 existingEntity1 = _persistence.findByPrimaryKey(
			newEntity1.getPrimaryKey());

		Assert.assertEquals(existingEntity1, newEntity1);
	}

	@Test(expected = NoSuchEntity1Exception.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Entity1> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Entity1_Entity1", "uuid", true, "Student_Id", true, "Student_Name",
			true, "Maths_Marks", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Entity1 newEntity1 = addEntity1();

		Entity1 existingEntity1 = _persistence.fetchByPrimaryKey(
			newEntity1.getPrimaryKey());

		Assert.assertEquals(existingEntity1, newEntity1);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Entity1 missingEntity1 = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEntity1);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Entity1 newEntity11 = addEntity1();
		Entity1 newEntity12 = addEntity1();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity11.getPrimaryKey());
		primaryKeys.add(newEntity12.getPrimaryKey());

		Map<Serializable, Entity1> entity1s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, entity1s.size());
		Assert.assertEquals(
			newEntity11, entity1s.get(newEntity11.getPrimaryKey()));
		Assert.assertEquals(
			newEntity12, entity1s.get(newEntity12.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Entity1> entity1s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity1s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Entity1 newEntity1 = addEntity1();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity1.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Entity1> entity1s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity1s.size());
		Assert.assertEquals(
			newEntity1, entity1s.get(newEntity1.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Entity1> entity1s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity1s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Entity1 newEntity1 = addEntity1();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity1.getPrimaryKey());

		Map<Serializable, Entity1> entity1s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity1s.size());
		Assert.assertEquals(
			newEntity1, entity1s.get(newEntity1.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			Entity1LocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Entity1>() {

				@Override
				public void performAction(Entity1 entity1) {
					Assert.assertNotNull(entity1);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Entity1 newEntity1 = addEntity1();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity1.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Student_Id", newEntity1.getStudent_Id()));

		List<Entity1> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Entity1 existingEntity1 = result.get(0);

		Assert.assertEquals(existingEntity1, newEntity1);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity1.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Student_Id", RandomTestUtil.nextLong()));

		List<Entity1> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Entity1 newEntity1 = addEntity1();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity1.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Student_Id"));

		Object newStudent_Id = newEntity1.getStudent_Id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Student_Id", new Object[] {newStudent_Id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingStudent_Id = result.get(0);

		Assert.assertEquals(existingStudent_Id, newStudent_Id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity1.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Student_Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Student_Id", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Entity1 addEntity1() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Entity1 entity1 = _persistence.create(pk);

		entity1.setUuid(RandomTestUtil.randomString());

		entity1.setStudent_Name(RandomTestUtil.randomString());

		entity1.setMaths_Marks(RandomTestUtil.nextInt());

		_entity1s.add(_persistence.update(entity1));

		return entity1;
	}

	private List<Entity1> _entity1s = new ArrayList<Entity1>();
	private Entity1Persistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}