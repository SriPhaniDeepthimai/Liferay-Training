/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.impl;

import Practical_ServiceBuilder.exception.NoSuchEntity3Exception;

import Practical_ServiceBuilder.model.Entity3;
import Practical_ServiceBuilder.model.Entity3Table;
import Practical_ServiceBuilder.model.impl.Entity3Impl;
import Practical_ServiceBuilder.model.impl.Entity3ModelImpl;

import Practical_ServiceBuilder.service.persistence.Entity3Persistence;
import Practical_ServiceBuilder.service.persistence.Entity3Util;
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
 * The persistence implementation for the entity3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Entity3Persistence.class)
public class Entity3PersistenceImpl
	extends BasePersistenceImpl<Entity3> implements Entity3Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Entity3Util</code> to access the entity3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Entity3Impl.class.getName();

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
	 * Returns all the entity3s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity3s
	 */
	@Override
	public List<Entity3> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity3> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Entity3> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity3> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Entity3> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity3> orderByComparator, boolean useFinderCache) {

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

		List<Entity3> list = null;

		if (useFinderCache) {
			list = (List<Entity3>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity3 entity3 : list) {
					if (!uuid.equals(entity3.getUuid())) {
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

			sb.append(_SQL_SELECT_ENTITY3_WHERE);

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
				sb.append(Entity3ModelImpl.ORDER_BY_JPQL);
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

				list = (List<Entity3>)QueryUtil.list(
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
	 * Returns the first entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	@Override
	public Entity3 findByUuid_First(
			String uuid, OrderByComparator<Entity3> orderByComparator)
		throws NoSuchEntity3Exception {

		Entity3 entity3 = fetchByUuid_First(uuid, orderByComparator);

		if (entity3 != null) {
			return entity3;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity3Exception(sb.toString());
	}

	/**
	 * Returns the first entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	@Override
	public Entity3 fetchByUuid_First(
		String uuid, OrderByComparator<Entity3> orderByComparator) {

		List<Entity3> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	@Override
	public Entity3 findByUuid_Last(
			String uuid, OrderByComparator<Entity3> orderByComparator)
		throws NoSuchEntity3Exception {

		Entity3 entity3 = fetchByUuid_Last(uuid, orderByComparator);

		if (entity3 != null) {
			return entity3;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity3Exception(sb.toString());
	}

	/**
	 * Returns the last entity3 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	@Override
	public Entity3 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity3> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Entity3> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Entity3[] findByUuid_PrevAndNext(
			int Teacher_Id, String uuid,
			OrderByComparator<Entity3> orderByComparator)
		throws NoSuchEntity3Exception {

		uuid = Objects.toString(uuid, "");

		Entity3 entity3 = findByPrimaryKey(Teacher_Id);

		Session session = null;

		try {
			session = openSession();

			Entity3[] array = new Entity3Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, entity3, uuid, orderByComparator, true);

			array[1] = entity3;

			array[2] = getByUuid_PrevAndNext(
				session, entity3, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Entity3 getByUuid_PrevAndNext(
		Session session, Entity3 entity3, String uuid,
		OrderByComparator<Entity3> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENTITY3_WHERE);

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
			sb.append(Entity3ModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(entity3)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Entity3> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the entity3s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Entity3 entity3 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity3);
		}
	}

	/**
	 * Returns the number of entity3s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity3s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY3_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "entity3.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(entity3.uuid IS NULL OR entity3.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByTeachers;
	private FinderPath _finderPathWithoutPaginationFindByTeachers;
	private FinderPath _finderPathCountByTeachers;

	/**
	 * Returns all the entity3s where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @return the matching entity3s
	 */
	@Override
	public List<Entity3> findByTeachers(int Teacher_Id) {
		return findByTeachers(
			Teacher_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity3> findByTeachers(int Teacher_Id, int start, int end) {
		return findByTeachers(Teacher_Id, start, end, null);
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
	@Override
	public List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end,
		OrderByComparator<Entity3> orderByComparator) {

		return findByTeachers(Teacher_Id, start, end, orderByComparator, true);
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
	@Override
	public List<Entity3> findByTeachers(
		int Teacher_Id, int start, int end,
		OrderByComparator<Entity3> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByTeachers;
				finderArgs = new Object[] {Teacher_Id};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByTeachers;
			finderArgs = new Object[] {
				Teacher_Id, start, end, orderByComparator
			};
		}

		List<Entity3> list = null;

		if (useFinderCache) {
			list = (List<Entity3>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity3 entity3 : list) {
					if (Teacher_Id != entity3.getTeacher_Id()) {
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

			sb.append(_SQL_SELECT_ENTITY3_WHERE);

			sb.append(_FINDER_COLUMN_TEACHERS_TEACHER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Entity3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Teacher_Id);

				list = (List<Entity3>)QueryUtil.list(
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
	 * Returns the first entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	@Override
	public Entity3 findByTeachers_First(
			int Teacher_Id, OrderByComparator<Entity3> orderByComparator)
		throws NoSuchEntity3Exception {

		Entity3 entity3 = fetchByTeachers_First(Teacher_Id, orderByComparator);

		if (entity3 != null) {
			return entity3;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Teacher_Id=");
		sb.append(Teacher_Id);

		sb.append("}");

		throw new NoSuchEntity3Exception(sb.toString());
	}

	/**
	 * Returns the first entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	@Override
	public Entity3 fetchByTeachers_First(
		int Teacher_Id, OrderByComparator<Entity3> orderByComparator) {

		List<Entity3> list = findByTeachers(
			Teacher_Id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3
	 * @throws NoSuchEntity3Exception if a matching entity3 could not be found
	 */
	@Override
	public Entity3 findByTeachers_Last(
			int Teacher_Id, OrderByComparator<Entity3> orderByComparator)
		throws NoSuchEntity3Exception {

		Entity3 entity3 = fetchByTeachers_Last(Teacher_Id, orderByComparator);

		if (entity3 != null) {
			return entity3;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Teacher_Id=");
		sb.append(Teacher_Id);

		sb.append("}");

		throw new NoSuchEntity3Exception(sb.toString());
	}

	/**
	 * Returns the last entity3 in the ordered set where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity3, or <code>null</code> if a matching entity3 could not be found
	 */
	@Override
	public Entity3 fetchByTeachers_Last(
		int Teacher_Id, OrderByComparator<Entity3> orderByComparator) {

		int count = countByTeachers(Teacher_Id);

		if (count == 0) {
			return null;
		}

		List<Entity3> list = findByTeachers(
			Teacher_Id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the entity3s where Teacher_Id = &#63; from the database.
	 *
	 * @param Teacher_Id the teacher_ ID
	 */
	@Override
	public void removeByTeachers(int Teacher_Id) {
		for (Entity3 entity3 :
				findByTeachers(
					Teacher_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity3);
		}
	}

	/**
	 * Returns the number of entity3s where Teacher_Id = &#63;.
	 *
	 * @param Teacher_Id the teacher_ ID
	 * @return the number of matching entity3s
	 */
	@Override
	public int countByTeachers(int Teacher_Id) {
		FinderPath finderPath = _finderPathCountByTeachers;

		Object[] finderArgs = new Object[] {Teacher_Id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY3_WHERE);

			sb.append(_FINDER_COLUMN_TEACHERS_TEACHER_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Teacher_Id);

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

	private static final String _FINDER_COLUMN_TEACHERS_TEACHER_ID_2 =
		"entity3.Teacher_Id = ?";

	public Entity3PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Entity3.class);

		setModelImplClass(Entity3Impl.class);
		setModelPKClass(int.class);

		setTable(Entity3Table.INSTANCE);
	}

	/**
	 * Caches the entity3 in the entity cache if it is enabled.
	 *
	 * @param entity3 the entity3
	 */
	@Override
	public void cacheResult(Entity3 entity3) {
		entityCache.putResult(
			Entity3Impl.class, entity3.getPrimaryKey(), entity3);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the entity3s in the entity cache if it is enabled.
	 *
	 * @param entity3s the entity3s
	 */
	@Override
	public void cacheResult(List<Entity3> entity3s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (entity3s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Entity3 entity3 : entity3s) {
			if (entityCache.getResult(
					Entity3Impl.class, entity3.getPrimaryKey()) == null) {

				cacheResult(entity3);
			}
		}
	}

	/**
	 * Clears the cache for all entity3s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Entity3Impl.class);

		finderCache.clearCache(Entity3Impl.class);
	}

	/**
	 * Clears the cache for the entity3.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Entity3 entity3) {
		entityCache.removeResult(Entity3Impl.class, entity3);
	}

	@Override
	public void clearCache(List<Entity3> entity3s) {
		for (Entity3 entity3 : entity3s) {
			entityCache.removeResult(Entity3Impl.class, entity3);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Entity3Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Entity3Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new entity3 with the primary key. Does not add the entity3 to the database.
	 *
	 * @param Teacher_Id the primary key for the new entity3
	 * @return the new entity3
	 */
	@Override
	public Entity3 create(int Teacher_Id) {
		Entity3 entity3 = new Entity3Impl();

		entity3.setNew(true);
		entity3.setPrimaryKey(Teacher_Id);

		String uuid = PortalUUIDUtil.generate();

		entity3.setUuid(uuid);

		return entity3;
	}

	/**
	 * Removes the entity3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3 that was removed
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	@Override
	public Entity3 remove(int Teacher_Id) throws NoSuchEntity3Exception {
		return remove((Serializable)Teacher_Id);
	}

	/**
	 * Removes the entity3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the entity3
	 * @return the entity3 that was removed
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	@Override
	public Entity3 remove(Serializable primaryKey)
		throws NoSuchEntity3Exception {

		Session session = null;

		try {
			session = openSession();

			Entity3 entity3 = (Entity3)session.get(
				Entity3Impl.class, primaryKey);

			if (entity3 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntity3Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(entity3);
		}
		catch (NoSuchEntity3Exception noSuchEntityException) {
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
	protected Entity3 removeImpl(Entity3 entity3) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(entity3)) {
				entity3 = (Entity3)session.get(
					Entity3Impl.class, entity3.getPrimaryKeyObj());
			}

			if (entity3 != null) {
				session.delete(entity3);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (entity3 != null) {
			clearCache(entity3);
		}

		return entity3;
	}

	@Override
	public Entity3 updateImpl(Entity3 entity3) {
		boolean isNew = entity3.isNew();

		if (!(entity3 instanceof Entity3ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(entity3.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(entity3);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in entity3 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Entity3 implementation " +
					entity3.getClass());
		}

		Entity3ModelImpl entity3ModelImpl = (Entity3ModelImpl)entity3;

		if (Validator.isNull(entity3.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			entity3.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(entity3);
			}
			else {
				entity3 = (Entity3)session.merge(entity3);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(Entity3Impl.class, entity3ModelImpl, false, true);

		if (isNew) {
			entity3.setNew(false);
		}

		entity3.resetOriginalValues();

		return entity3;
	}

	/**
	 * Returns the entity3 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the entity3
	 * @return the entity3
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	@Override
	public Entity3 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntity3Exception {

		Entity3 entity3 = fetchByPrimaryKey(primaryKey);

		if (entity3 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntity3Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return entity3;
	}

	/**
	 * Returns the entity3 with the primary key or throws a <code>NoSuchEntity3Exception</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3
	 * @throws NoSuchEntity3Exception if a entity3 with the primary key could not be found
	 */
	@Override
	public Entity3 findByPrimaryKey(int Teacher_Id)
		throws NoSuchEntity3Exception {

		return findByPrimaryKey((Serializable)Teacher_Id);
	}

	/**
	 * Returns the entity3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3, or <code>null</code> if a entity3 with the primary key could not be found
	 */
	@Override
	public Entity3 fetchByPrimaryKey(int Teacher_Id) {
		return fetchByPrimaryKey((Serializable)Teacher_Id);
	}

	/**
	 * Returns all the entity3s.
	 *
	 * @return the entity3s
	 */
	@Override
	public List<Entity3> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity3> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Entity3> findAll(
		int start, int end, OrderByComparator<Entity3> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Entity3> findAll(
		int start, int end, OrderByComparator<Entity3> orderByComparator,
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

		List<Entity3> list = null;

		if (useFinderCache) {
			list = (List<Entity3>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ENTITY3);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ENTITY3;

				sql = sql.concat(Entity3ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Entity3>)QueryUtil.list(
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
	 * Removes all the entity3s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Entity3 entity3 : findAll()) {
			remove(entity3);
		}
	}

	/**
	 * Returns the number of entity3s.
	 *
	 * @return the number of entity3s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ENTITY3);

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
		return "Teacher_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ENTITY3;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Entity3ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the entity3 persistence.
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

		_finderPathWithPaginationFindByTeachers = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTeachers",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Teacher_Id"}, true);

		_finderPathWithoutPaginationFindByTeachers = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTeachers",
			new String[] {Integer.class.getName()}, new String[] {"Teacher_Id"},
			true);

		_finderPathCountByTeachers = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTeachers",
			new String[] {Integer.class.getName()}, new String[] {"Teacher_Id"},
			false);

		Entity3Util.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		Entity3Util.setPersistence(null);

		entityCache.removeCache(Entity3Impl.class.getName());
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

	private static final String _SQL_SELECT_ENTITY3 =
		"SELECT entity3 FROM Entity3 entity3";

	private static final String _SQL_SELECT_ENTITY3_WHERE =
		"SELECT entity3 FROM Entity3 entity3 WHERE ";

	private static final String _SQL_COUNT_ENTITY3 =
		"SELECT COUNT(entity3) FROM Entity3 entity3";

	private static final String _SQL_COUNT_ENTITY3_WHERE =
		"SELECT COUNT(entity3) FROM Entity3 entity3 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "entity3.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Entity3 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Entity3 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Entity3PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}