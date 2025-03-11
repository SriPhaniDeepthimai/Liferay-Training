/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.impl;

import Practical_ServiceBuilder.exception.NoSuchEntity4Exception;

import Practical_ServiceBuilder.model.Entity4;
import Practical_ServiceBuilder.model.Entity4Table;
import Practical_ServiceBuilder.model.impl.Entity4Impl;
import Practical_ServiceBuilder.model.impl.Entity4ModelImpl;

import Practical_ServiceBuilder.service.persistence.Entity4Persistence;
import Practical_ServiceBuilder.service.persistence.Entity4Util;
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
 * The persistence implementation for the entity4 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Entity4Persistence.class)
public class Entity4PersistenceImpl
	extends BasePersistenceImpl<Entity4> implements Entity4Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Entity4Util</code> to access the entity4 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Entity4Impl.class.getName();

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
	 * Returns all the entity4s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity4s
	 */
	@Override
	public List<Entity4> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity4> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Entity4> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity4> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Entity4> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity4> orderByComparator, boolean useFinderCache) {

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

		List<Entity4> list = null;

		if (useFinderCache) {
			list = (List<Entity4>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity4 entity4 : list) {
					if (!uuid.equals(entity4.getUuid())) {
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

			sb.append(_SQL_SELECT_ENTITY4_WHERE);

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
				sb.append(Entity4ModelImpl.ORDER_BY_JPQL);
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

				list = (List<Entity4>)QueryUtil.list(
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
	 * Returns the first entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	@Override
	public Entity4 findByUuid_First(
			String uuid, OrderByComparator<Entity4> orderByComparator)
		throws NoSuchEntity4Exception {

		Entity4 entity4 = fetchByUuid_First(uuid, orderByComparator);

		if (entity4 != null) {
			return entity4;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity4Exception(sb.toString());
	}

	/**
	 * Returns the first entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	@Override
	public Entity4 fetchByUuid_First(
		String uuid, OrderByComparator<Entity4> orderByComparator) {

		List<Entity4> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	@Override
	public Entity4 findByUuid_Last(
			String uuid, OrderByComparator<Entity4> orderByComparator)
		throws NoSuchEntity4Exception {

		Entity4 entity4 = fetchByUuid_Last(uuid, orderByComparator);

		if (entity4 != null) {
			return entity4;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity4Exception(sb.toString());
	}

	/**
	 * Returns the last entity4 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	@Override
	public Entity4 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity4> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Entity4> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Entity4[] findByUuid_PrevAndNext(
			int Department_Id, String uuid,
			OrderByComparator<Entity4> orderByComparator)
		throws NoSuchEntity4Exception {

		uuid = Objects.toString(uuid, "");

		Entity4 entity4 = findByPrimaryKey(Department_Id);

		Session session = null;

		try {
			session = openSession();

			Entity4[] array = new Entity4Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, entity4, uuid, orderByComparator, true);

			array[1] = entity4;

			array[2] = getByUuid_PrevAndNext(
				session, entity4, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Entity4 getByUuid_PrevAndNext(
		Session session, Entity4 entity4, String uuid,
		OrderByComparator<Entity4> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENTITY4_WHERE);

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
			sb.append(Entity4ModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(entity4)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Entity4> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the entity4s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Entity4 entity4 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity4);
		}
	}

	/**
	 * Returns the number of entity4s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity4s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY4_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "entity4.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(entity4.uuid IS NULL OR entity4.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByDepartments;
	private FinderPath _finderPathWithoutPaginationFindByDepartments;
	private FinderPath _finderPathCountByDepartments;

	/**
	 * Returns all the entity4s where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching entity4s
	 */
	@Override
	public List<Entity4> findByDepartments(int Department_Id) {
		return findByDepartments(
			Department_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity4> findByDepartments(
		int Department_Id, int start, int end) {

		return findByDepartments(Department_Id, start, end, null);
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
	@Override
	public List<Entity4> findByDepartments(
		int Department_Id, int start, int end,
		OrderByComparator<Entity4> orderByComparator) {

		return findByDepartments(
			Department_Id, start, end, orderByComparator, true);
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
	@Override
	public List<Entity4> findByDepartments(
		int Department_Id, int start, int end,
		OrderByComparator<Entity4> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDepartments;
				finderArgs = new Object[] {Department_Id};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDepartments;
			finderArgs = new Object[] {
				Department_Id, start, end, orderByComparator
			};
		}

		List<Entity4> list = null;

		if (useFinderCache) {
			list = (List<Entity4>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity4 entity4 : list) {
					if (Department_Id != entity4.getDepartment_Id()) {
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

			sb.append(_SQL_SELECT_ENTITY4_WHERE);

			sb.append(_FINDER_COLUMN_DEPARTMENTS_DEPARTMENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Entity4ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Department_Id);

				list = (List<Entity4>)QueryUtil.list(
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
	 * Returns the first entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	@Override
	public Entity4 findByDepartments_First(
			int Department_Id, OrderByComparator<Entity4> orderByComparator)
		throws NoSuchEntity4Exception {

		Entity4 entity4 = fetchByDepartments_First(
			Department_Id, orderByComparator);

		if (entity4 != null) {
			return entity4;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Department_Id=");
		sb.append(Department_Id);

		sb.append("}");

		throw new NoSuchEntity4Exception(sb.toString());
	}

	/**
	 * Returns the first entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	@Override
	public Entity4 fetchByDepartments_First(
		int Department_Id, OrderByComparator<Entity4> orderByComparator) {

		List<Entity4> list = findByDepartments(
			Department_Id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4
	 * @throws NoSuchEntity4Exception if a matching entity4 could not be found
	 */
	@Override
	public Entity4 findByDepartments_Last(
			int Department_Id, OrderByComparator<Entity4> orderByComparator)
		throws NoSuchEntity4Exception {

		Entity4 entity4 = fetchByDepartments_Last(
			Department_Id, orderByComparator);

		if (entity4 != null) {
			return entity4;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Department_Id=");
		sb.append(Department_Id);

		sb.append("}");

		throw new NoSuchEntity4Exception(sb.toString());
	}

	/**
	 * Returns the last entity4 in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity4, or <code>null</code> if a matching entity4 could not be found
	 */
	@Override
	public Entity4 fetchByDepartments_Last(
		int Department_Id, OrderByComparator<Entity4> orderByComparator) {

		int count = countByDepartments(Department_Id);

		if (count == 0) {
			return null;
		}

		List<Entity4> list = findByDepartments(
			Department_Id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the entity4s where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	@Override
	public void removeByDepartments(int Department_Id) {
		for (Entity4 entity4 :
				findByDepartments(
					Department_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(entity4);
		}
	}

	/**
	 * Returns the number of entity4s where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching entity4s
	 */
	@Override
	public int countByDepartments(int Department_Id) {
		FinderPath finderPath = _finderPathCountByDepartments;

		Object[] finderArgs = new Object[] {Department_Id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY4_WHERE);

			sb.append(_FINDER_COLUMN_DEPARTMENTS_DEPARTMENT_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Department_Id);

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

	private static final String _FINDER_COLUMN_DEPARTMENTS_DEPARTMENT_ID_2 =
		"entity4.Department_Id = ?";

	public Entity4PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Entity4.class);

		setModelImplClass(Entity4Impl.class);
		setModelPKClass(int.class);

		setTable(Entity4Table.INSTANCE);
	}

	/**
	 * Caches the entity4 in the entity cache if it is enabled.
	 *
	 * @param entity4 the entity4
	 */
	@Override
	public void cacheResult(Entity4 entity4) {
		entityCache.putResult(
			Entity4Impl.class, entity4.getPrimaryKey(), entity4);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the entity4s in the entity cache if it is enabled.
	 *
	 * @param entity4s the entity4s
	 */
	@Override
	public void cacheResult(List<Entity4> entity4s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (entity4s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Entity4 entity4 : entity4s) {
			if (entityCache.getResult(
					Entity4Impl.class, entity4.getPrimaryKey()) == null) {

				cacheResult(entity4);
			}
		}
	}

	/**
	 * Clears the cache for all entity4s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Entity4Impl.class);

		finderCache.clearCache(Entity4Impl.class);
	}

	/**
	 * Clears the cache for the entity4.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Entity4 entity4) {
		entityCache.removeResult(Entity4Impl.class, entity4);
	}

	@Override
	public void clearCache(List<Entity4> entity4s) {
		for (Entity4 entity4 : entity4s) {
			entityCache.removeResult(Entity4Impl.class, entity4);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Entity4Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Entity4Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new entity4 with the primary key. Does not add the entity4 to the database.
	 *
	 * @param Department_Id the primary key for the new entity4
	 * @return the new entity4
	 */
	@Override
	public Entity4 create(int Department_Id) {
		Entity4 entity4 = new Entity4Impl();

		entity4.setNew(true);
		entity4.setPrimaryKey(Department_Id);

		String uuid = PortalUUIDUtil.generate();

		entity4.setUuid(uuid);

		return entity4;
	}

	/**
	 * Removes the entity4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4 that was removed
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	@Override
	public Entity4 remove(int Department_Id) throws NoSuchEntity4Exception {
		return remove((Serializable)Department_Id);
	}

	/**
	 * Removes the entity4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the entity4
	 * @return the entity4 that was removed
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	@Override
	public Entity4 remove(Serializable primaryKey)
		throws NoSuchEntity4Exception {

		Session session = null;

		try {
			session = openSession();

			Entity4 entity4 = (Entity4)session.get(
				Entity4Impl.class, primaryKey);

			if (entity4 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntity4Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(entity4);
		}
		catch (NoSuchEntity4Exception noSuchEntityException) {
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
	protected Entity4 removeImpl(Entity4 entity4) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(entity4)) {
				entity4 = (Entity4)session.get(
					Entity4Impl.class, entity4.getPrimaryKeyObj());
			}

			if (entity4 != null) {
				session.delete(entity4);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (entity4 != null) {
			clearCache(entity4);
		}

		return entity4;
	}

	@Override
	public Entity4 updateImpl(Entity4 entity4) {
		boolean isNew = entity4.isNew();

		if (!(entity4 instanceof Entity4ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(entity4.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(entity4);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in entity4 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Entity4 implementation " +
					entity4.getClass());
		}

		Entity4ModelImpl entity4ModelImpl = (Entity4ModelImpl)entity4;

		if (Validator.isNull(entity4.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			entity4.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(entity4);
			}
			else {
				entity4 = (Entity4)session.merge(entity4);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(Entity4Impl.class, entity4ModelImpl, false, true);

		if (isNew) {
			entity4.setNew(false);
		}

		entity4.resetOriginalValues();

		return entity4;
	}

	/**
	 * Returns the entity4 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the entity4
	 * @return the entity4
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	@Override
	public Entity4 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntity4Exception {

		Entity4 entity4 = fetchByPrimaryKey(primaryKey);

		if (entity4 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntity4Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return entity4;
	}

	/**
	 * Returns the entity4 with the primary key or throws a <code>NoSuchEntity4Exception</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4
	 * @throws NoSuchEntity4Exception if a entity4 with the primary key could not be found
	 */
	@Override
	public Entity4 findByPrimaryKey(int Department_Id)
		throws NoSuchEntity4Exception {

		return findByPrimaryKey((Serializable)Department_Id);
	}

	/**
	 * Returns the entity4 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4, or <code>null</code> if a entity4 with the primary key could not be found
	 */
	@Override
	public Entity4 fetchByPrimaryKey(int Department_Id) {
		return fetchByPrimaryKey((Serializable)Department_Id);
	}

	/**
	 * Returns all the entity4s.
	 *
	 * @return the entity4s
	 */
	@Override
	public List<Entity4> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity4> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Entity4> findAll(
		int start, int end, OrderByComparator<Entity4> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Entity4> findAll(
		int start, int end, OrderByComparator<Entity4> orderByComparator,
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

		List<Entity4> list = null;

		if (useFinderCache) {
			list = (List<Entity4>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ENTITY4);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ENTITY4;

				sql = sql.concat(Entity4ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Entity4>)QueryUtil.list(
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
	 * Removes all the entity4s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Entity4 entity4 : findAll()) {
			remove(entity4);
		}
	}

	/**
	 * Returns the number of entity4s.
	 *
	 * @return the number of entity4s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ENTITY4);

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
		return "Department_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ENTITY4;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Entity4ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the entity4 persistence.
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

		_finderPathWithPaginationFindByDepartments = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepartments",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Department_Id"}, true);

		_finderPathWithoutPaginationFindByDepartments = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepartments",
			new String[] {Integer.class.getName()},
			new String[] {"Department_Id"}, true);

		_finderPathCountByDepartments = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepartments",
			new String[] {Integer.class.getName()},
			new String[] {"Department_Id"}, false);

		Entity4Util.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		Entity4Util.setPersistence(null);

		entityCache.removeCache(Entity4Impl.class.getName());
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

	private static final String _SQL_SELECT_ENTITY4 =
		"SELECT entity4 FROM Entity4 entity4";

	private static final String _SQL_SELECT_ENTITY4_WHERE =
		"SELECT entity4 FROM Entity4 entity4 WHERE ";

	private static final String _SQL_COUNT_ENTITY4 =
		"SELECT COUNT(entity4) FROM Entity4 entity4";

	private static final String _SQL_COUNT_ENTITY4_WHERE =
		"SELECT COUNT(entity4) FROM Entity4 entity4 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "entity4.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Entity4 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Entity4 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Entity4PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}