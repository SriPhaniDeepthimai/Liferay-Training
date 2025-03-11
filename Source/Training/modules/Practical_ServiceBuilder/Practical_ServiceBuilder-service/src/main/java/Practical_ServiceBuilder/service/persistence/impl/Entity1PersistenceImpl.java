/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.impl;

import Practical_ServiceBuilder.exception.NoSuchEntity1Exception;

import Practical_ServiceBuilder.model.Entity1;
import Practical_ServiceBuilder.model.Entity1Table;
import Practical_ServiceBuilder.model.impl.Entity1Impl;
import Practical_ServiceBuilder.model.impl.Entity1ModelImpl;

import Practical_ServiceBuilder.service.persistence.Entity1Persistence;
import Practical_ServiceBuilder.service.persistence.Entity1Util;
import Practical_ServiceBuilder.service.persistence.impl.constants.Entity1PersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the entity1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Entity1Persistence.class)
public class Entity1PersistenceImpl
	extends BasePersistenceImpl<Entity1> implements Entity1Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Entity1Util</code> to access the entity1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Entity1Impl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the entity1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity1s
	 */
	@Override
	public List<Entity1> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity1> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Entity1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity1> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Entity1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity1> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Entity1> list = null;

		if (useFinderCache) {
			list = (List<Entity1>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity1 entity1 : list) {
					if (!uuid.equals(entity1.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ENTITY1_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Entity1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Entity1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	@Override
	public Entity1 findByUuid_First(
			String uuid, OrderByComparator<Entity1> orderByComparator)
		throws NoSuchEntity1Exception {

		Entity1 entity1 = fetchByUuid_First(uuid, orderByComparator);

		if (entity1 != null) {
			return entity1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity1Exception(sb.toString());
	}

	/**
	 * Returns the first entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	@Override
	public Entity1 fetchByUuid_First(
		String uuid, OrderByComparator<Entity1> orderByComparator) {

		List<Entity1> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	@Override
	public Entity1 findByUuid_Last(
			String uuid, OrderByComparator<Entity1> orderByComparator)
		throws NoSuchEntity1Exception {

		Entity1 entity1 = fetchByUuid_Last(uuid, orderByComparator);

		if (entity1 != null) {
			return entity1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity1Exception(sb.toString());
	}

	/**
	 * Returns the last entity1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	@Override
	public Entity1 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity1> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Entity1> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Entity1[] findByUuid_PrevAndNext(
			long Student_Id, String uuid,
			OrderByComparator<Entity1> orderByComparator)
		throws NoSuchEntity1Exception {

		uuid = Objects.toString(uuid, "");

		Entity1 entity1 = findByPrimaryKey(Student_Id);

		Session session = null;

		try {
			session = openSession();

			Entity1[] array = new Entity1Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, entity1, uuid, orderByComparator, true);

			array[1] = entity1;

			array[2] = getByUuid_PrevAndNext(
				session, entity1, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Entity1 getByUuid_PrevAndNext(
		Session session, Entity1 entity1, String uuid,
		OrderByComparator<Entity1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENTITY1_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Entity1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(entity1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Entity1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the entity1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Entity1 entity1 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity1);
		}
	}

	/**
	 * Returns the number of entity1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity1s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY1_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "entity1.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(entity1.uuid IS NULL OR entity1.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByMarks;
	private FinderPath _finderPathWithoutPaginationFindByMarks;
	private FinderPath _finderPathCountByMarks;

	/**
	 * Returns all the entity1s where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @return the matching entity1s
	 */
	@Override
	public List<Entity1> findByMarks(String Student_Name) {
		return findByMarks(
			Student_Name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity1> findByMarks(String Student_Name, int start, int end) {
		return findByMarks(Student_Name, start, end, null);
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
	@Override
	public List<Entity1> findByMarks(
		String Student_Name, int start, int end,
		OrderByComparator<Entity1> orderByComparator) {

		return findByMarks(Student_Name, start, end, orderByComparator, true);
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
	@Override
	public List<Entity1> findByMarks(
		String Student_Name, int start, int end,
		OrderByComparator<Entity1> orderByComparator, boolean useFinderCache) {

		Student_Name = Objects.toString(Student_Name, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByMarks;
				finderArgs = new Object[] {Student_Name};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByMarks;
			finderArgs = new Object[] {
				Student_Name, start, end, orderByComparator
			};
		}

		List<Entity1> list = null;

		if (useFinderCache) {
			list = (List<Entity1>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity1 entity1 : list) {
					if (!Student_Name.equals(entity1.getStudent_Name())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ENTITY1_WHERE);

			boolean bindStudent_Name = false;

			if (Student_Name.isEmpty()) {
				sb.append(_FINDER_COLUMN_MARKS_STUDENT_NAME_3);
			}
			else {
				bindStudent_Name = true;

				sb.append(_FINDER_COLUMN_MARKS_STUDENT_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Entity1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStudent_Name) {
					queryPos.add(Student_Name);
				}

				list = (List<Entity1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	@Override
	public Entity1 findByMarks_First(
			String Student_Name, OrderByComparator<Entity1> orderByComparator)
		throws NoSuchEntity1Exception {

		Entity1 entity1 = fetchByMarks_First(Student_Name, orderByComparator);

		if (entity1 != null) {
			return entity1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Student_Name=");
		sb.append(Student_Name);

		sb.append("}");

		throw new NoSuchEntity1Exception(sb.toString());
	}

	/**
	 * Returns the first entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	@Override
	public Entity1 fetchByMarks_First(
		String Student_Name, OrderByComparator<Entity1> orderByComparator) {

		List<Entity1> list = findByMarks(Student_Name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1
	 * @throws NoSuchEntity1Exception if a matching entity1 could not be found
	 */
	@Override
	public Entity1 findByMarks_Last(
			String Student_Name, OrderByComparator<Entity1> orderByComparator)
		throws NoSuchEntity1Exception {

		Entity1 entity1 = fetchByMarks_Last(Student_Name, orderByComparator);

		if (entity1 != null) {
			return entity1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Student_Name=");
		sb.append(Student_Name);

		sb.append("}");

		throw new NoSuchEntity1Exception(sb.toString());
	}

	/**
	 * Returns the last entity1 in the ordered set where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity1, or <code>null</code> if a matching entity1 could not be found
	 */
	@Override
	public Entity1 fetchByMarks_Last(
		String Student_Name, OrderByComparator<Entity1> orderByComparator) {

		int count = countByMarks(Student_Name);

		if (count == 0) {
			return null;
		}

		List<Entity1> list = findByMarks(
			Student_Name, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Entity1[] findByMarks_PrevAndNext(
			long Student_Id, String Student_Name,
			OrderByComparator<Entity1> orderByComparator)
		throws NoSuchEntity1Exception {

		Student_Name = Objects.toString(Student_Name, "");

		Entity1 entity1 = findByPrimaryKey(Student_Id);

		Session session = null;

		try {
			session = openSession();

			Entity1[] array = new Entity1Impl[3];

			array[0] = getByMarks_PrevAndNext(
				session, entity1, Student_Name, orderByComparator, true);

			array[1] = entity1;

			array[2] = getByMarks_PrevAndNext(
				session, entity1, Student_Name, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Entity1 getByMarks_PrevAndNext(
		Session session, Entity1 entity1, String Student_Name,
		OrderByComparator<Entity1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENTITY1_WHERE);

		boolean bindStudent_Name = false;

		if (Student_Name.isEmpty()) {
			sb.append(_FINDER_COLUMN_MARKS_STUDENT_NAME_3);
		}
		else {
			bindStudent_Name = true;

			sb.append(_FINDER_COLUMN_MARKS_STUDENT_NAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Entity1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStudent_Name) {
			queryPos.add(Student_Name);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(entity1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Entity1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the entity1s where Student_Name = &#63; from the database.
	 *
	 * @param Student_Name the student_ name
	 */
	@Override
	public void removeByMarks(String Student_Name) {
		for (Entity1 entity1 :
				findByMarks(
					Student_Name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity1);
		}
	}

	/**
	 * Returns the number of entity1s where Student_Name = &#63;.
	 *
	 * @param Student_Name the student_ name
	 * @return the number of matching entity1s
	 */
	@Override
	public int countByMarks(String Student_Name) {
		Student_Name = Objects.toString(Student_Name, "");

		FinderPath finderPath = _finderPathCountByMarks;

		Object[] finderArgs = new Object[] {Student_Name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY1_WHERE);

			boolean bindStudent_Name = false;

			if (Student_Name.isEmpty()) {
				sb.append(_FINDER_COLUMN_MARKS_STUDENT_NAME_3);
			}
			else {
				bindStudent_Name = true;

				sb.append(_FINDER_COLUMN_MARKS_STUDENT_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStudent_Name) {
					queryPos.add(Student_Name);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MARKS_STUDENT_NAME_2 =
		"entity1.Student_Name = ?";

	private static final String _FINDER_COLUMN_MARKS_STUDENT_NAME_3 =
		"(entity1.Student_Name IS NULL OR entity1.Student_Name = '')";

	public Entity1PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Entity1.class);

		setModelImplClass(Entity1Impl.class);
		setModelPKClass(long.class);

		setTable(Entity1Table.INSTANCE);
	}

	/**
	 * Caches the entity1 in the entity cache if it is enabled.
	 *
	 * @param entity1 the entity1
	 */
	@Override
	public void cacheResult(Entity1 entity1) {
		entityCache.putResult(
			Entity1Impl.class, entity1.getPrimaryKey(), entity1);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the entity1s in the entity cache if it is enabled.
	 *
	 * @param entity1s the entity1s
	 */
	@Override
	public void cacheResult(List<Entity1> entity1s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (entity1s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Entity1 entity1 : entity1s) {
			if (entityCache.getResult(
					Entity1Impl.class, entity1.getPrimaryKey()) == null) {

				cacheResult(entity1);
			}
		}
	}

	/**
	 * Clears the cache for all entity1s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Entity1Impl.class);

		finderCache.clearCache(Entity1Impl.class);
	}

	/**
	 * Clears the cache for the entity1.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Entity1 entity1) {
		entityCache.removeResult(Entity1Impl.class, entity1);
	}

	@Override
	public void clearCache(List<Entity1> entity1s) {
		for (Entity1 entity1 : entity1s) {
			entityCache.removeResult(Entity1Impl.class, entity1);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Entity1Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Entity1Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
	 *
	 * @param Student_Id the primary key for the new entity1
	 * @return the new entity1
	 */
	@Override
	public Entity1 create(long Student_Id) {
		Entity1 entity1 = new Entity1Impl();

		entity1.setNew(true);
		entity1.setPrimaryKey(Student_Id);

		String uuid = PortalUUIDUtil.generate();

		entity1.setUuid(uuid);

		return entity1;
	}

	/**
	 * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1 that was removed
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	@Override
	public Entity1 remove(long Student_Id) throws NoSuchEntity1Exception {
		return remove((Serializable)Student_Id);
	}

	/**
	 * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the entity1
	 * @return the entity1 that was removed
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	@Override
	public Entity1 remove(Serializable primaryKey)
		throws NoSuchEntity1Exception {

		Session session = null;

		try {
			session = openSession();

			Entity1 entity1 = (Entity1)session.get(
				Entity1Impl.class, primaryKey);

			if (entity1 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntity1Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(entity1);
		}
		catch (NoSuchEntity1Exception noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Entity1 removeImpl(Entity1 entity1) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(entity1)) {
				entity1 = (Entity1)session.get(
					Entity1Impl.class, entity1.getPrimaryKeyObj());
			}

			if (entity1 != null) {
				session.delete(entity1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (entity1 != null) {
			clearCache(entity1);
		}

		return entity1;
	}

	@Override
	public Entity1 updateImpl(Entity1 entity1) {
		boolean isNew = entity1.isNew();

		if (!(entity1 instanceof Entity1ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(entity1.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(entity1);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in entity1 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Entity1 implementation " +
					entity1.getClass());
		}

		Entity1ModelImpl entity1ModelImpl = (Entity1ModelImpl)entity1;

		if (Validator.isNull(entity1.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			entity1.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(entity1);
			}
			else {
				entity1 = (Entity1)session.merge(entity1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(Entity1Impl.class, entity1ModelImpl, false, true);

		if (isNew) {
			entity1.setNew(false);
		}

		entity1.resetOriginalValues();

		return entity1;
	}

	/**
	 * Returns the entity1 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the entity1
	 * @return the entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	@Override
	public Entity1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntity1Exception {

		Entity1 entity1 = fetchByPrimaryKey(primaryKey);

		if (entity1 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntity1Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return entity1;
	}

	/**
	 * Returns the entity1 with the primary key or throws a <code>NoSuchEntity1Exception</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1
	 * @throws NoSuchEntity1Exception if a entity1 with the primary key could not be found
	 */
	@Override
	public Entity1 findByPrimaryKey(long Student_Id)
		throws NoSuchEntity1Exception {

		return findByPrimaryKey((Serializable)Student_Id);
	}

	/**
	 * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
	 */
	@Override
	public Entity1 fetchByPrimaryKey(long Student_Id) {
		return fetchByPrimaryKey((Serializable)Student_Id);
	}

	/**
	 * Returns all the entity1s.
	 *
	 * @return the entity1s
	 */
	@Override
	public List<Entity1> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity1> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Entity1> findAll(
		int start, int end, OrderByComparator<Entity1> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Entity1> findAll(
		int start, int end, OrderByComparator<Entity1> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Entity1> list = null;

		if (useFinderCache) {
			list = (List<Entity1>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ENTITY1);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ENTITY1;

				sql = sql.concat(Entity1ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Entity1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the entity1s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Entity1 entity1 : findAll()) {
			remove(entity1);
		}
	}

	/**
	 * Returns the number of entity1s.
	 *
	 * @return the number of entity1s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ENTITY1);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "Student_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ENTITY1;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Entity1ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the entity1 persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByMarks = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMarks",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Student_Name"}, true);

		_finderPathWithoutPaginationFindByMarks = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMarks",
			new String[] {String.class.getName()},
			new String[] {"Student_Name"}, true);

		_finderPathCountByMarks = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMarks",
			new String[] {String.class.getName()},
			new String[] {"Student_Name"}, false);

		Entity1Util.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		Entity1Util.setPersistence(null);

		entityCache.removeCache(Entity1Impl.class.getName());
	}

	@Override
	@Reference(
		target = Entity1PersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = Entity1PersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = Entity1PersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ENTITY1 =
		"SELECT entity1 FROM Entity1 entity1";

	private static final String _SQL_SELECT_ENTITY1_WHERE =
		"SELECT entity1 FROM Entity1 entity1 WHERE ";

	private static final String _SQL_COUNT_ENTITY1 =
		"SELECT COUNT(entity1) FROM Entity1 entity1";

	private static final String _SQL_COUNT_ENTITY1_WHERE =
		"SELECT COUNT(entity1) FROM Entity1 entity1 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "entity1.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Entity1 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Entity1 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Entity1PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}