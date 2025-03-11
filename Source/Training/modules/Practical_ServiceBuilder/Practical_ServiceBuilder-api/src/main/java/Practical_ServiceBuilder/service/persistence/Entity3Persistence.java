/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.exception.NoSuchEntity3Exception;

import Practical_ServiceBuilder.model.Entity3;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entity3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity3Util
 * @generated
 */
@ProviderType
public interface Entity3Persistence extends BasePersistence<Entity3> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Entity3Util} to access the entity3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the entity3s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity3s
	 */
	public java.util.List<Entity3> findByUuid(String uuid);

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
	public java.util.List<Entity3> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Entity3> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

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
	public java.util.List<Entity3> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public Entity3 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity3>
				orderByComparator)
		throws NoSuchEntity3Exception;

	/**
	 * Returns the first entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public Entity3 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

	/**
	 * Returns the last entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public Entity3 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity3>
				orderByComparator)
		throws NoSuchEntity3Exception;

	/**
	 * Returns the last entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public Entity3 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

	/**
	 * Returns the entity3s before and after the current entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current entity3
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity3
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	public Entity3[] findByUuid_PrevAndNext(
			int Teacher_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity3>
				orderByComparator)
		throws NoSuchEntity3Exception;

	/**
	 * Removes all the entity3s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of entity3s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity3s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the entity3s where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @return the matching entity3s
	 */
	public java.util.List<Entity3> findByTeachers(int Teacher_Id);

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
	public java.util.List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end);

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
	public java.util.List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

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
	public java.util.List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public Entity3 findByTeachers_First(
			int Teacher_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Entity3>
				orderByComparator)
		throws NoSuchEntity3Exception;

	/**
	 * Returns the first entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public Entity3 fetchByTeachers_First(
		int Teacher_Id,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

	/**
	 * Returns the last entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	public Entity3 findByTeachers_Last(
			int Teacher_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Entity3>
				orderByComparator)
		throws NoSuchEntity3Exception;

	/**
	 * Returns the last entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	public Entity3 fetchByTeachers_Last(
		int Teacher_Id,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

	/**
	 * Removes all the entity3s where Teacher_Id = &#63; from the database.
	 *
	 * @param Teacher_Id the teacher_ ID
	 */
	public void removeByTeachers(int Teacher_Id);

	/**
	 * Returns the number of entity3s where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @return the number of matching entity3s
	 */
	public int countByTeachers(int Teacher_Id);

	/**
	 * Caches the entity3 in the entity cache if it is enabled.
	 *
	 * @param entity3 the entity3
	 */
	public void cacheResult(Entity3 entity3);

	/**
	 * Caches the entity3s in the entity cache if it is enabled.
	 *
	 * @param entity3s the entity3s
	 */
	public void cacheResult(java.util.List<Entity3> entity3s);

	/**
	 * Creates a new entity3 with the primary key. Does not add the entity3 to the database.
	 *
	 * @param Teacher_Id the primary key for the new entity3
	 * @return the new entity3
	 */
	public Entity3 create(int Teacher_Id);

	/**
	 * Removes the entity3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3 that was removed
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	public Entity3 remove(int Teacher_Id) throws NoSuchEntity3Exception;

	public Entity3 updateImpl(Entity3 entity3);

	/**
	 * Returns the entity3 with the primary key or throws a <code>NoSuchEntity3Exception</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	public Entity3 findByPrimaryKey(int Teacher_Id)
		throws NoSuchEntity3Exception;

	/**
	 * Returns the entity3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3, or <code>null</code> if a entity3 with the primary key could not be found
	 */
	public Entity3 fetchByPrimaryKey(int Teacher_Id);

	/**
	 * Returns all the entity3s.
	 *
	 * @return the entity3s
	 */
	public java.util.List<Entity3> findAll();

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
	public java.util.List<Entity3> findAll(int start, int end);

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
	public java.util.List<Entity3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator);

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
	public java.util.List<Entity3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity3>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entity3s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entity3s.
	 *
	 * @return the number of entity3s
	 */
	public int countAll();

}