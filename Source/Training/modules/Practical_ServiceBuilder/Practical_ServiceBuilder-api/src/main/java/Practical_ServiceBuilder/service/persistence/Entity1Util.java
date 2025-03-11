/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.model.Entity1;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the entity1 service. This utility wraps <code>Practical_ServiceBuilder.service.persistence.impl.Entity1PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity1Persistence
 * @generated
 */
public class Entity1Util {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Entity1 entity1) {
		getPersistence().clearCache(entity1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Entity1> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entity1> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entity1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entity1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Entity1 update(Entity1 entity1) {
		return getPersistence().update(entity1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Entity1 update(
		Entity1 entity1, ServiceContext serviceContext) {

		return getPersistence().update(entity1, serviceContext);
	}

	/**
	 * Returns all the entity1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity1s
	 */
	public static List<Entity1> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the entity1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @return the range of matching entity1s
	 */
	public static List<Entity1> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the entity1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity1s
	 */
	public static List<Entity1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity1s
	 */
	public static List<Entity1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity1> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public static Entity1 findByUuid_First(
			String uuid, OrderByComparator<Entity1> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public static Entity1 fetchByUuid_First(
		String uuid, OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public static Entity1 findByUuid_Last(
			String uuid, OrderByComparator<Entity1> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public static Entity1 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the entity1s before and after the current entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param Student_Id the primary key of the current entity1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public static Entity1[] findByUuid_PrevAndNext(
			long Student_Id, String uuid,
			OrderByComparator<Entity1> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByUuid_PrevAndNext(
			Student_Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the entity1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of entity1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity1s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the entity1s where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @return the matching entity1s
	 */
	public static List<Entity1> findByMarks(String Student_Name) {
		return getPersistence().findByMarks(Student_Name);
	}

	/**
	 * Returns a range of all the entity1s where Student_Name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param Student_Name the student_ name
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @return the range of matching entity1s
	 */
	public static List<Entity1> findByMarks(
		String Student_Name, int start, int end) {

		return getPersistence().findByMarks(Student_Name, start, end);
	}

	/**
	 * Returns an ordered range of all the entity1s where Student_Name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param Student_Name the student_ name
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity1s
	 */
	public static List<Entity1> findByMarks(
		String Student_Name, int start, int end,
		OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().findByMarks(
			Student_Name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity1s where Student_Name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param Student_Name the student_ name
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity1s
	 */
	public static List<Entity1> findByMarks(
		String Student_Name, int start, int end,
		OrderByComparator<Entity1> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByMarks(
			Student_Name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public static Entity1 findByMarks_First(
			String Student_Name, OrderByComparator<Entity1> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByMarks_First(
			Student_Name, orderByComparator);
	}

	/**
	 * Returns the first entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public static Entity1 fetchByMarks_First(
		String Student_Name, OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().fetchByMarks_First(
			Student_Name, orderByComparator);
	}

	/**
	 * Returns the last entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public static Entity1 findByMarks_Last(
			String Student_Name, OrderByComparator<Entity1> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByMarks_Last(
			Student_Name, orderByComparator);
	}

	/**
	 * Returns the last entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public static Entity1 fetchByMarks_Last(
		String Student_Name, OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().fetchByMarks_Last(
			Student_Name, orderByComparator);
	}

	/**
	 * Returns the entity1s before and after the current entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Id the primary key of the current entity1
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public static Entity1[] findByMarks_PrevAndNext(
			long Student_Id, String Student_Name,
			OrderByComparator<Entity1> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByMarks_PrevAndNext(
			Student_Id, Student_Name, orderByComparator);
	}

	/**
	 * Removes all the entity1s where Student_Name = &#63; from the database.
	 *
	 * @param Student_Name the student_ name
	 */
	public static void removeByMarks(String Student_Name) {
		getPersistence().removeByMarks(Student_Name);
	}

	/**
	 * Returns the number of entity1s where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @return the number of matching entity1s
	 */
	public static int countByMarks(String Student_Name) {
		return getPersistence().countByMarks(Student_Name);
	}

	/**
	 * Caches the entity1 in the entity cache if it is enabled.
	 *
	 * @param entity1 the entity1
	 */
	public static void cacheResult(Entity1 entity1) {
		getPersistence().cacheResult(entity1);
	}

	/**
	 * Caches the entity1s in the entity cache if it is enabled.
	 *
	 * @param entity1s the entity1s
	 */
	public static void cacheResult(List<Entity1> entity1s) {
		getPersistence().cacheResult(entity1s);
	}

	/**
	 * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
	 *
	 * @param Student_Id the primary key for the new entity1
	 * @return the new entity1
	 */
	public static Entity1 create(long Student_Id) {
		return getPersistence().create(Student_Id);
	}

	/**
	 * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1 that was removed
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public static Entity1 remove(long Student_Id)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().remove(Student_Id);
	}

	public static Entity1 updateImpl(Entity1 entity1) {
		return getPersistence().updateImpl(entity1);
	}

	/**
	 * Returns the entity1 with the primary key or throws a <code>NoSuchEntity1Exception</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public static Entity1 findByPrimaryKey(long Student_Id)
		throws Practical_ServiceBuilder.exception.NoSuchEntity1Exception {

		return getPersistence().findByPrimaryKey(Student_Id);
	}

	/**
	 * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
	 */
	public static Entity1 fetchByPrimaryKey(long Student_Id) {
		return getPersistence().fetchByPrimaryKey(Student_Id);
	}

	/**
	 * Returns all the entity1s.
	 *
	 * @return the entity1s
	 */
	public static List<Entity1> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the entity1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @return the range of entity1s
	 */
	public static List<Entity1> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the entity1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity1s
	 */
	public static List<Entity1> findAll(
		int start, int end, OrderByComparator<Entity1> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity1s
	 */
	public static List<Entity1> findAll(
		int start, int end, OrderByComparator<Entity1> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the entity1s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of entity1s.
	 *
	 * @return the number of entity1s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Entity1Persistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(Entity1Persistence persistence) {
		_persistence = persistence;
	}

	private static volatile Entity1Persistence _persistence;

}