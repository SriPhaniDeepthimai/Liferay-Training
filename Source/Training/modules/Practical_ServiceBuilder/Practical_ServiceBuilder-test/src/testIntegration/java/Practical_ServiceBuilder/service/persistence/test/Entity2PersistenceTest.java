/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.test;

import Practical_ServiceBuilder.exception.NoSuchEntity2Exception;

import Practical_ServiceBuilder.model.Entity2;

import Practical_ServiceBuilder.service.Entity2LocalServiceUtil;
import Practical_ServiceBuilder.service.persistence.Entity2Persistence;
import Practical_ServiceBuilder.service.persistence.Entity2Util;

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
public class Entity2PersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "Practical_ServiceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = Entity2Util.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Entity2> iterator = _entity2s.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity2 entity2 = _persistence.create(pk);

		Assert.assertNotNull(entity2);

		Assert.assertEquals(entity2.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Entity2 newEntity2 = addEntity2();

		_persistence.remove(newEntity2);

		Entity2 existingEntity2 = _persistence.fetchByPrimaryKey(
			newEntity2.getPrimaryKey());

		Assert.assertNull(existingEntity2);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEntity2();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity2 newEntity2 = _persistence.create(pk);

		newEntity2.setUuid(RandomTestUtil.randomString());

		newEntity2.setStudent_Name(RandomTestUtil.randomString());

		_entity2s.add(_persistence.update(newEntity2));

		Entity2 existingEntity2 = _persistence.findByPrimaryKey(
			newEntity2.getPrimaryKey());

		Assert.assertEquals(existingEntity2.getUuid(), newEntity2.getUuid());
		Assert.assertEquals(
			existingEntity2.getStudentId(), newEntity2.getStudentId());
		Assert.assertEquals(
			existingEntity2.getStudent_Name(), newEntity2.getStudent_Name());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByStudents() throws Exception {
		_persistence.countByStudents(RandomTestUtil.nextInt());

		_persistence.countByStudents(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Entity2 newEntity2 = addEntity2();

		Entity2 existingEntity2 = _persistence.findByPrimaryKey(
			newEntity2.getPrimaryKey());

		Assert.assertEquals(existingEntity2, newEntity2);
	}

	@Test(expected = NoSuchEntity2Exception.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Entity2> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Entity1_Entity2", "uuid", true, "StudentId", true, "Student_Name",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Entity2 newEntity2 = addEntity2();

		Entity2 existingEntity2 = _persistence.fetchByPrimaryKey(
			newEntity2.getPrimaryKey());

		Assert.assertEquals(existingEntity2, newEntity2);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity2 missingEntity2 = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEntity2);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Entity2 newEntity21 = addEntity2();
		Entity2 newEntity22 = addEntity2();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity21.getPrimaryKey());
		primaryKeys.add(newEntity22.getPrimaryKey());

		Map<Serializable, Entity2> entity2s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, entity2s.size());
		Assert.assertEquals(
			newEntity21, entity2s.get(newEntity21.getPrimaryKey()));
		Assert.assertEquals(
			newEntity22, entity2s.get(newEntity22.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Entity2> entity2s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity2s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Entity2 newEntity2 = addEntity2();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity2.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Entity2> entity2s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity2s.size());
		Assert.assertEquals(
			newEntity2, entity2s.get(newEntity2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Entity2> entity2s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(entity2s.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Entity2 newEntity2 = addEntity2();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEntity2.getPrimaryKey());

		Map<Serializable, Entity2> entity2s = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, entity2s.size());
		Assert.assertEquals(
			newEntity2, entity2s.get(newEntity2.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			Entity2LocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Entity2>() {

				@Override
				public void performAction(Entity2 entity2) {
					Assert.assertNotNull(entity2);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Entity2 newEntity2 = addEntity2();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity2.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("StudentId", newEntity2.getStudentId()));

		List<Entity2> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Entity2 existingEntity2 = result.get(0);

		Assert.assertEquals(existingEntity2, newEntity2);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity2.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("StudentId", RandomTestUtil.nextInt()));

		List<Entity2> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Entity2 newEntity2 = addEntity2();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity2.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("StudentId"));

		Object newStudentId = newEntity2.getStudentId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"StudentId", new Object[] {newStudentId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingStudentId = result.get(0);

		Assert.assertEquals(existingStudentId, newStudentId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Entity2.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("StudentId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"StudentId", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Entity2 addEntity2() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Entity2 entity2 = _persistence.create(pk);

		entity2.setUuid(RandomTestUtil.randomString());

		entity2.setStudent_Name(RandomTestUtil.randomString());

		_entity2s.add(_persistence.update(entity2));

		return entity2;
	}

	private List<Entity2> _entity2s = new ArrayList<Entity2>();
	private Entity2Persistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}