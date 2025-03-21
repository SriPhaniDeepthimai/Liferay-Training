/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.model.Entity3;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the entity3 service. This utility wraps <code>Practical_ServiceBuilder.service.persistence.impl.Entity3PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity3Persistence
 * @generated
 */
public class Entity3Util {

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
	public static void clearCache(Entity3 entity3) {
		getPersistence().clearCache(entity3);
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
	public static Map<Serializable, Entity3> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entity3> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entity3> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entity3> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Entity3 update(Entity3 entity3) {
		return getPersistence().update(entity3);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Entity3 update(
		Entity3 entity3, ServiceContext serviceContext) {

		return getPersistence().update(entity3, serviceContext);
	}

	/**
	 * Returns all the entity3s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity3s
	 */
	public static List<Entity3> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the entity3s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @return the range of matching entity3s
	 */
	public static List<Entity3> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the entity3s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity3s
	 */
	public static List<Entity3> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity3s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity3s
	 */
	public static List<Entity3> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity3> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public static Entity3 findByUuid_First(
			String uuid, OrderByComparator<Entity3> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public static Entity3 fetchByUuid_First(
		String uuid, OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public static Entity3 findByUuid_Last(
			String uuid, OrderByComparator<Entity3> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public static Entity3 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the entity3s before and after the current entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current entity3
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity3
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	public static Entity3[] findByUuid_PrevAndNext(
			int Teacher_Id, String uuid,
			OrderByComparator<Entity3> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().findByUuid_PrevAndNext(
			Teacher_Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the entity3s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of entity3s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity3s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the entity3s where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @return the matching entity3s
	 */
	public static List<Entity3> findByTeachers(int Teacher_Id) {
		return getPersistence().findByTeachers(Teacher_Id);
	}

	/**
	 * Returns a range of all the entity3s where Teacher_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @return the range of matching entity3s
	 */
	public static List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end) {

		return getPersistence().findByTeachers(Teacher_Id, start, end);
	}

	/**
	 * Returns an ordered range of all the entity3s where Teacher_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity3s
	 */
	public static List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end,
		OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().findByTeachers(
			Teacher_Id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity3s where Teacher_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity3s
	 */
	public static List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end,
		OrderByComparator<Entity3> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTeachers(
			Teacher_Id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public static Entity3 findByTeachers_First(
			int Teacher_Id, OrderByComparator<Entity3> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().findByTeachers_First(
			Teacher_Id, orderByComparator);
	}

	/**
	 * Returns the first entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public static Entity3 fetchByTeachers_First(
		int Teacher_Id, OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().fetchByTeachers_First(
			Teacher_Id, orderByComparator);
	}

	/**
	 * Returns the last entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public static Entity3 findByTeachers_Last(
			int Teacher_Id, OrderByComparator<Entity3> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().findByTeachers_Last(
			Teacher_Id, orderByComparator);
	}

	/**
	 * Returns the last entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public static Entity3 fetchByTeachers_Last(
		int Teacher_Id, OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().fetchByTeachers_Last(
			Teacher_Id, orderByComparator);
	}

	/**
	 * Removes all the entity3s where Teacher_Id = &#63; from the database.
	 *
	 * @param Teacher_Id the teacher_ ID
	 */
	public static void removeByTeachers(int Teacher_Id) {
		getPersistence().removeByTeachers(Teacher_Id);
	}

	/**
	 * Returns the number of entity3s where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @return the number of matching entity3s
	 */
	public static int countByTeachers(int Teacher_Id) {
		return getPersistence().countByTeachers(Teacher_Id);
	}

	/**
	 * Caches the entity3 in the entity cache if it is enabled.
	 *
	 * @param entity3 the entity3
	 */
	public static void cacheResult(Entity3 entity3) {
		getPersistence().cacheResult(entity3);
	}

	/**
	 * Caches the entity3s in the entity cache if it is enabled.
	 *
	 * @param entity3s the entity3s
	 */
	public static void cacheResult(List<Entity3> entity3s) {
		getPersistence().cacheResult(entity3s);
	}

	/**
	 * Creates a new entity3 with the primary key. Does not add the entity3 to the database.
	 *
	 * @param Teacher_Id the primary key for the new entity3
	 * @return the new entity3
	 */
	public static Entity3 create(int Teacher_Id) {
		return getPersistence().create(Teacher_Id);
	}

	/**
	 * Removes the entity3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3 that was removed
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	public static Entity3 remove(int Teacher_Id)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().remove(Teacher_Id);
	}

	public static Entity3 updateImpl(Entity3 entity3) {
		return getPersistence().updateImpl(entity3);
	}

	/**
	 * Returns the entity3 with the primary key or throws a <code>NoSuchEntity3Exception</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	public static Entity3 findByPrimaryKey(int Teacher_Id)
		throws Practical_ServiceBuilder.exception.NoSuchEntity3Exception {

		return getPersistence().findByPrimaryKey(Teacher_Id);
	}

	/**
	 * Returns the entity3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3, or <code>null</code> if a entity3 with the primary key could not be found
	 */
	public static Entity3 fetchByPrimaryKey(int Teacher_Id) {
		return getPersistence().fetchByPrimaryKey(Teacher_Id);
	}

	/**
	 * Returns all the entity3s.
	 *
	 * @return the entity3s
	 */
	public static List<Entity3> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the entity3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @return the range of entity3s
	 */
	public static List<Entity3> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the entity3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity3s
	 */
	public static List<Entity3> findAll(
		int start, int end, OrderByComparator<Entity3> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity3s
	 */
	public static List<Entity3> findAll(
		int start, int end, OrderByComparator<Entity3> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the entity3s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of entity3s.
	 *
	 * @return the number of entity3s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Entity3Persistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(Entity3Persistence persistence) {
		_persistence = persistence;
	}

	private static volatile Entity3Persistence _persistence;

}