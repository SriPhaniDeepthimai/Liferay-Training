/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.model.Entity4;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the entity4 service. This utility wraps <code>Practical_ServiceBuilder.service.persistence.impl.Entity4PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity4Persistence
 * @generated
 */
public class Entity4Util {

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
	public static void clearCache(Entity4 entity4) {
		getPersistence().clearCache(entity4);
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
	public static Map<Serializable, Entity4> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entity4> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entity4> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entity4> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Entity4 update(Entity4 entity4) {
		return getPersistence().update(entity4);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Entity4 update(
		Entity4 entity4, ServiceContext serviceContext) {

		return getPersistence().update(entity4, serviceContext);
	}

	/**
	 * Returns all the entity4s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity4s
	 */
	public static List<Entity4> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the entity4s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @return the range of matching entity4s
	 */
	public static List<Entity4> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the entity4s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity4s
	 */
	public static List<Entity4> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity4s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity4s
	 */
	public static List<Entity4> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity4> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public static Entity4 findByUuid_First(
			String uuid, OrderByComparator<Entity4> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public static Entity4 fetchByUuid_First(
		String uuid, OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public static Entity4 findByUuid_Last(
			String uuid, OrderByComparator<Entity4> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public static Entity4 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the entity4s before and after the current entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param Department_Id the primary key of the current entity4
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity4
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	public static Entity4[] findByUuid_PrevAndNext(
			int Department_Id, String uuid,
			OrderByComparator<Entity4> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().findByUuid_PrevAndNext(
			Department_Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the entity4s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of entity4s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity4s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the entity4s where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching entity4s
	 */
	public static List<Entity4> findByDepartments(int Department_Id) {
		return getPersistence().findByDepartments(Department_Id);
	}

	/**
	 * Returns a range of all the entity4s where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @return the range of matching entity4s
	 */
	public static List<Entity4> findByDepartments(
		int Department_Id, int start, int end) {

		return getPersistence().findByDepartments(Department_Id, start, end);
	}

	/**
	 * Returns an ordered range of all the entity4s where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity4s
	 */
	public static List<Entity4> findByDepartments(
		int Department_Id, int start, int end,
		OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().findByDepartments(
			Department_Id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity4s where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity4s
	 */
	public static List<Entity4> findByDepartments(
		int Department_Id, int start, int end,
		OrderByComparator<Entity4> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByDepartments(
			Department_Id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public static Entity4 findByDepartments_First(
			int Department_Id, OrderByComparator<Entity4> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().findByDepartments_First(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the first entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public static Entity4 fetchByDepartments_First(
		int Department_Id, OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().fetchByDepartments_First(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the last entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public static Entity4 findByDepartments_Last(
			int Department_Id, OrderByComparator<Entity4> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().findByDepartments_Last(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the last entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public static Entity4 fetchByDepartments_Last(
		int Department_Id, OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().fetchByDepartments_Last(
			Department_Id, orderByComparator);
	}

	/**
	 * Removes all the entity4s where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	public static void removeByDepartments(int Department_Id) {
		getPersistence().removeByDepartments(Department_Id);
	}

	/**
	 * Returns the number of entity4s where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching entity4s
	 */
	public static int countByDepartments(int Department_Id) {
		return getPersistence().countByDepartments(Department_Id);
	}

	/**
	 * Caches the entity4 in the entity cache if it is enabled.
	 *
	 * @param entity4 the entity4
	 */
	public static void cacheResult(Entity4 entity4) {
		getPersistence().cacheResult(entity4);
	}

	/**
	 * Caches the entity4s in the entity cache if it is enabled.
	 *
	 * @param entity4s the entity4s
	 */
	public static void cacheResult(List<Entity4> entity4s) {
		getPersistence().cacheResult(entity4s);
	}

	/**
	 * Creates a new entity4 with the primary key. Does not add the entity4 to the database.
	 *
	 * @param Department_Id the primary key for the new entity4
	 * @return the new entity4
	 */
	public static Entity4 create(int Department_Id) {
		return getPersistence().create(Department_Id);
	}

	/**
	 * Removes the entity4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4 that was removed
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	public static Entity4 remove(int Department_Id)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().remove(Department_Id);
	}

	public static Entity4 updateImpl(Entity4 entity4) {
		return getPersistence().updateImpl(entity4);
	}

	/**
	 * Returns the entity4 with the primary key or throws a <code>NoSuchEntity4Exception</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	public static Entity4 findByPrimaryKey(int Department_Id)
		throws Practical_ServiceBuilder.exception.NoSuchEntity4Exception {

		return getPersistence().findByPrimaryKey(Department_Id);
	}

	/**
	 * Returns the entity4 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4, or <code>null</code> if a entity4 with the primary key could not be found
	 */
	public static Entity4 fetchByPrimaryKey(int Department_Id) {
		return getPersistence().fetchByPrimaryKey(Department_Id);
	}

	/**
	 * Returns all the entity4s.
	 *
	 * @return the entity4s
	 */
	public static List<Entity4> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the entity4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @return the range of entity4s
	 */
	public static List<Entity4> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the entity4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity4s
	 */
	public static List<Entity4> findAll(
		int start, int end, OrderByComparator<Entity4> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity4s
	 */
	public static List<Entity4> findAll(
		int start, int end, OrderByComparator<Entity4> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the entity4s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of entity4s.
	 *
	 * @return the number of entity4s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Entity4Persistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(Entity4Persistence persistence) {
		_persistence = persistence;
	}

	private static volatile Entity4Persistence _persistence;

}