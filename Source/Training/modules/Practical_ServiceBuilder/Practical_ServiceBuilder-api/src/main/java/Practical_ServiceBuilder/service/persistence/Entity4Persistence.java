/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.exception.NoSuchEntity4Exception;

import Practical_ServiceBuilder.model.Entity4;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entity4 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity4Util
 * @generated
 */
@ProviderType
public interface Entity4Persistence extends BasePersistence<Entity4> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Entity4Util} to access the entity4 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the entity4s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity4s
	 */
	public java.util.List<Entity4> findByUuid(String uuid);

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
	public java.util.List<Entity4> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Entity4> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

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
	public java.util.List<Entity4> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public Entity4 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity4>
				orderByComparator)
		throws NoSuchEntity4Exception;

	/**
	 * Returns the first entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public Entity4 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

	/**
	 * Returns the last entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public Entity4 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity4>
				orderByComparator)
		throws NoSuchEntity4Exception;

	/**
	 * Returns the last entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public Entity4 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

	/**
	 * Returns the entity4s before and after the current entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param Department_Id the primary key of the current entity4
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity4
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	public Entity4[] findByUuid_PrevAndNext(
			int Department_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity4>
				orderByComparator)
		throws NoSuchEntity4Exception;

	/**
	 * Removes all the entity4s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of entity4s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity4s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the entity4s where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching entity4s
	 */
	public java.util.List<Entity4> findByDepartments(int Department_Id);

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
	public java.util.List<Entity4> findByDepartments(
		int Department_Id, int start, int end);

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
	public java.util.List<Entity4> findByDepartments(
		int Department_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

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
	public java.util.List<Entity4> findByDepartments(
		int Department_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public Entity4 findByDepartments_First(
			int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Entity4>
				orderByComparator)
		throws NoSuchEntity4Exception;

	/**
	 * Returns the first entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public Entity4 fetchByDepartments_First(
		int Department_Id,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

	/**
	 * Returns the last entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	public Entity4 findByDepartments_Last(
			int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Entity4>
				orderByComparator)
		throws NoSuchEntity4Exception;

	/**
	 * Returns the last entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	public Entity4 fetchByDepartments_Last(
		int Department_Id,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

	/**
	 * Removes all the entity4s where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	public void removeByDepartments(int Department_Id);

	/**
	 * Returns the number of entity4s where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching entity4s
	 */
	public int countByDepartments(int Department_Id);

	/**
	 * Caches the entity4 in the entity cache if it is enabled.
	 *
	 * @param entity4 the entity4
	 */
	public void cacheResult(Entity4 entity4);

	/**
	 * Caches the entity4s in the entity cache if it is enabled.
	 *
	 * @param entity4s the entity4s
	 */
	public void cacheResult(java.util.List<Entity4> entity4s);

	/**
	 * Creates a new entity4 with the primary key. Does not add the entity4 to the database.
	 *
	 * @param Department_Id the primary key for the new entity4
	 * @return the new entity4
	 */
	public Entity4 create(int Department_Id);

	/**
	 * Removes the entity4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4 that was removed
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	public Entity4 remove(int Department_Id) throws NoSuchEntity4Exception;

	public Entity4 updateImpl(Entity4 entity4);

	/**
	 * Returns the entity4 with the primary key or throws a <code>NoSuchEntity4Exception</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	public Entity4 findByPrimaryKey(int Department_Id)
		throws NoSuchEntity4Exception;

	/**
	 * Returns the entity4 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4, or <code>null</code> if a entity4 with the primary key could not be found
	 */
	public Entity4 fetchByPrimaryKey(int Department_Id);

	/**
	 * Returns all the entity4s.
	 *
	 * @return the entity4s
	 */
	public java.util.List<Entity4> findAll();

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
	public java.util.List<Entity4> findAll(int start, int end);

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
	public java.util.List<Entity4> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator);

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
	public java.util.List<Entity4> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity4>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entity4s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entity4s.
	 *
	 * @return the number of entity4s
	 */
	public int countAll();

}