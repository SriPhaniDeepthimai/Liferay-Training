/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.model.Entity2;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the entity2 service. This utility wraps <code>Practical_ServiceBuilder.service.persistence.impl.Entity2PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity2Persistence
 * @generated
 */
public class Entity2Util {

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
	public static void clearCache(Entity2 entity2) {
		getPersistence().clearCache(entity2);
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
	public static Map<Serializable, Entity2> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entity2> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entity2> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entity2> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Entity2 update(Entity2 entity2) {
		return getPersistence().update(entity2);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Entity2 update(
		Entity2 entity2, ServiceContext serviceContext) {

		return getPersistence().update(entity2, serviceContext);
	}

	/**
	 * Returns all the entity2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity2s
	 */
	public static List<Entity2> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the entity2s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of matching entity2s
	 */
	public static List<Entity2> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the entity2s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity2s
	 */
	public static List<Entity2> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity2s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity2s
	 */
	public static List<Entity2> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity2> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public static Entity2 findByUuid_First(
			String uuid, OrderByComparator<Entity2> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public static Entity2 fetchByUuid_First(
		String uuid, OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public static Entity2 findByUuid_Last(
			String uuid, OrderByComparator<Entity2> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public static Entity2 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the entity2s before and after the current entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param StudentId the primary key of the current entity2
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity2
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	public static Entity2[] findByUuid_PrevAndNext(
			int StudentId, String uuid,
			OrderByComparator<Entity2> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().findByUuid_PrevAndNext(
			StudentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the entity2s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of entity2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity2s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the entity2s where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @return the matching entity2s
	 */
	public static List<Entity2> findByStudents(int StudentId) {
		return getPersistence().findByStudents(StudentId);
	}

	/**
	 * Returns a range of all the entity2s where StudentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param StudentId the student ID
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of matching entity2s
	 */
	public static List<Entity2> findByStudents(
		int StudentId, int start, int end) {

		return getPersistence().findByStudents(StudentId, start, end);
	}

	/**
	 * Returns an ordered range of all the entity2s where StudentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param StudentId the student ID
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity2s
	 */
	public static List<Entity2> findByStudents(
		int StudentId, int start, int end,
		OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().findByStudents(
			StudentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity2s where StudentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param StudentId the student ID
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity2s
	 */
	public static List<Entity2> findByStudents(
		int StudentId, int start, int end,
		OrderByComparator<Entity2> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByStudents(
			StudentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public static Entity2 findByStudents_First(
			int StudentId, OrderByComparator<Entity2> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().findByStudents_First(
			StudentId, orderByComparator);
	}

	/**
	 * Returns the first entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public static Entity2 fetchByStudents_First(
		int StudentId, OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().fetchByStudents_First(
			StudentId, orderByComparator);
	}

	/**
	 * Returns the last entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public static Entity2 findByStudents_Last(
			int StudentId, OrderByComparator<Entity2> orderByComparator)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().findByStudents_Last(
			StudentId, orderByComparator);
	}

	/**
	 * Returns the last entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public static Entity2 fetchByStudents_Last(
		int StudentId, OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().fetchByStudents_Last(
			StudentId, orderByComparator);
	}

	/**
	 * Removes all the entity2s where StudentId = &#63; from the database.
	 *
	 * @param StudentId the student ID
	 */
	public static void removeByStudents(int StudentId) {
		getPersistence().removeByStudents(StudentId);
	}

	/**
	 * Returns the number of entity2s where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @return the number of matching entity2s
	 */
	public static int countByStudents(int StudentId) {
		return getPersistence().countByStudents(StudentId);
	}

	/**
	 * Caches the entity2 in the entity cache if it is enabled.
	 *
	 * @param entity2 the entity2
	 */
	public static void cacheResult(Entity2 entity2) {
		getPersistence().cacheResult(entity2);
	}

	/**
	 * Caches the entity2s in the entity cache if it is enabled.
	 *
	 * @param entity2s the entity2s
	 */
	public static void cacheResult(List<Entity2> entity2s) {
		getPersistence().cacheResult(entity2s);
	}

	/**
	 * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
	 *
	 * @param StudentId the primary key for the new entity2
	 * @return the new entity2
	 */
	public static Entity2 create(int StudentId) {
		return getPersistence().create(StudentId);
	}

	/**
	 * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2 that was removed
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	public static Entity2 remove(int StudentId)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().remove(StudentId);
	}

	public static Entity2 updateImpl(Entity2 entity2) {
		return getPersistence().updateImpl(entity2);
	}

	/**
	 * Returns the entity2 with the primary key or throws a <code>NoSuchEntity2Exception</code> if it could not be found.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	public static Entity2 findByPrimaryKey(int StudentId)
		throws Practical_ServiceBuilder.exception.NoSuchEntity2Exception {

		return getPersistence().findByPrimaryKey(StudentId);
	}

	/**
	 * Returns the entity2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2, or <code>null</code> if a entity2 with the primary key could not be found
	 */
	public static Entity2 fetchByPrimaryKey(int StudentId) {
		return getPersistence().fetchByPrimaryKey(StudentId);
	}

	/**
	 * Returns all the entity2s.
	 *
	 * @return the entity2s
	 */
	public static List<Entity2> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of entity2s
	 */
	public static List<Entity2> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity2s
	 */
	public static List<Entity2> findAll(
		int start, int end, OrderByComparator<Entity2> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity2s
	 */
	public static List<Entity2> findAll(
		int start, int end, OrderByComparator<Entity2> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the entity2s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of entity2s.
	 *
	 * @return the number of entity2s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Entity2Persistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(Entity2Persistence persistence) {
		_persistence = persistence;
	}

	private static volatile Entity2Persistence _persistence;

}