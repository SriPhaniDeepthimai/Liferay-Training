/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.exception.NoSuchEntity1Exception;

import Practical_ServiceBuilder.model.Entity1;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entity1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity1Util
 * @generated
 */
@ProviderType
public interface Entity1Persistence extends BasePersistence<Entity1> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Entity1Util} to access the entity1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the entity1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity1s
	 */
	public java.util.List<Entity1> findByUuid(String uuid);

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
	public java.util.List<Entity1> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Entity1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

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
	public java.util.List<Entity1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public Entity1 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity1>
				orderByComparator)
		throws NoSuchEntity1Exception;

	/**
	 * Returns the first entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public Entity1 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

	/**
	 * Returns the last entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public Entity1 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity1>
				orderByComparator)
		throws NoSuchEntity1Exception;

	/**
	 * Returns the last entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public Entity1 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

	/**
	 * Returns the entity1s before and after the current entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param Student_Id the primary key of the current entity1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public Entity1[] findByUuid_PrevAndNext(
			long Student_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity1>
				orderByComparator)
		throws NoSuchEntity1Exception;

	/**
	 * Removes all the entity1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of entity1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity1s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the entity1s where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @return the matching entity1s
	 */
	public java.util.List<Entity1> findByMarks(String Student_Name);

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
	public java.util.List<Entity1> findByMarks(
		String Student_Name, int start, int end);

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
	public java.util.List<Entity1> findByMarks(
		String Student_Name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

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
	public java.util.List<Entity1> findByMarks(
		String Student_Name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public Entity1 findByMarks_First(
			String Student_Name,
			com.liferay.portal.kernel.util.OrderByComparator<Entity1>
				orderByComparator)
		throws NoSuchEntity1Exception;

	/**
	 * Returns the first entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public Entity1 fetchByMarks_First(
		String Student_Name,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

	/**
	 * Returns the last entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	public Entity1 findByMarks_Last(
			String Student_Name,
			com.liferay.portal.kernel.util.OrderByComparator<Entity1>
				orderByComparator)
		throws NoSuchEntity1Exception;

	/**
	 * Returns the last entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	public Entity1 fetchByMarks_Last(
		String Student_Name,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

	/**
	 * Returns the entity1s before and after the current entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Id the primary key of the current entity1
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public Entity1[] findByMarks_PrevAndNext(
			long Student_Id, String Student_Name,
			com.liferay.portal.kernel.util.OrderByComparator<Entity1>
				orderByComparator)
		throws NoSuchEntity1Exception;

	/**
	 * Removes all the entity1s where Student_Name = &#63; from the database.
	 *
	 * @param Student_Name the student_ name
	 */
	public void removeByMarks(String Student_Name);

	/**
	 * Returns the number of entity1s where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @return the number of matching entity1s
	 */
	public int countByMarks(String Student_Name);

	/**
	 * Caches the entity1 in the entity cache if it is enabled.
	 *
	 * @param entity1 the entity1
	 */
	public void cacheResult(Entity1 entity1);

	/**
	 * Caches the entity1s in the entity cache if it is enabled.
	 *
	 * @param entity1s the entity1s
	 */
	public void cacheResult(java.util.List<Entity1> entity1s);

	/**
	 * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
	 *
	 * @param Student_Id the primary key for the new entity1
	 * @return the new entity1
	 */
	public Entity1 create(long Student_Id);

	/**
	 * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1 that was removed
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public Entity1 remove(long Student_Id) throws NoSuchEntity1Exception;

	public Entity1 updateImpl(Entity1 entity1);

	/**
	 * Returns the entity1 with the primary key or throws a <code>NoSuchEntity1Exception</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	public Entity1 findByPrimaryKey(long Student_Id)
		throws NoSuchEntity1Exception;

	/**
	 * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
	 */
	public Entity1 fetchByPrimaryKey(long Student_Id);

	/**
	 * Returns all the entity1s.
	 *
	 * @return the entity1s
	 */
	public java.util.List<Entity1> findAll();

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
	public java.util.List<Entity1> findAll(int start, int end);

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
	public java.util.List<Entity1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator);

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
	public java.util.List<Entity1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entity1s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entity1s.
	 *
	 * @return the number of entity1s
	 */
	public int countAll();

}