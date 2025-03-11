/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence.impl;

import Practical_ServiceBuilder.exception.NoSuchEntity2Exception;

import Practical_ServiceBuilder.model.Entity2;
import Practical_ServiceBuilder.model.Entity2Table;
import Practical_ServiceBuilder.model.impl.Entity2Impl;
import Practical_ServiceBuilder.model.impl.Entity2ModelImpl;

import Practical_ServiceBuilder.service.persistence.Entity2Persistence;
import Practical_ServiceBuilder.service.persistence.Entity2Util;
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
 * The persistence implementation for the entity2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Entity2Persistence.class)
public class Entity2PersistenceImpl
	extends BasePersistenceImpl<Entity2> implements Entity2Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Entity2Util</code> to access the entity2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Entity2Impl.class.getName();

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
	 * Returns all the entity2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity2s
	 */
	@Override
	public List<Entity2> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity2> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Entity2> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity2> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Entity2> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entity2> orderByComparator, boolean useFinderCache) {

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

		List<Entity2> list = null;

		if (useFinderCache) {
			list = (List<Entity2>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity2 entity2 : list) {
					if (!uuid.equals(entity2.getUuid())) {
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

			sb.append(_SQL_SELECT_ENTITY2_WHERE);

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
				sb.append(Entity2ModelImpl.ORDER_BY_JPQL);
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

				list = (List<Entity2>)QueryUtil.list(
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
	 * Returns the first entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	@Override
	public Entity2 findByUuid_First(
			String uuid, OrderByComparator<Entity2> orderByComparator)
		throws NoSuchEntity2Exception {

		Entity2 entity2 = fetchByUuid_First(uuid, orderByComparator);

		if (entity2 != null) {
			return entity2;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity2Exception(sb.toString());
	}

	/**
	 * Returns the first entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	@Override
	public Entity2 fetchByUuid_First(
		String uuid, OrderByComparator<Entity2> orderByComparator) {

		List<Entity2> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	@Override
	public Entity2 findByUuid_Last(
			String uuid, OrderByComparator<Entity2> orderByComparator)
		throws NoSuchEntity2Exception {

		Entity2 entity2 = fetchByUuid_Last(uuid, orderByComparator);

		if (entity2 != null) {
			return entity2;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEntity2Exception(sb.toString());
	}

	/**
	 * Returns the last entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	@Override
	public Entity2 fetchByUuid_Last(
		String uuid, OrderByComparator<Entity2> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Entity2> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Entity2[] findByUuid_PrevAndNext(
			int StudentId, String uuid,
			OrderByComparator<Entity2> orderByComparator)
		throws NoSuchEntity2Exception {

		uuid = Objects.toString(uuid, "");

		Entity2 entity2 = findByPrimaryKey(StudentId);

		Session session = null;

		try {
			session = openSession();

			Entity2[] array = new Entity2Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, entity2, uuid, orderByComparator, true);

			array[1] = entity2;

			array[2] = getByUuid_PrevAndNext(
				session, entity2, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Entity2 getByUuid_PrevAndNext(
		Session session, Entity2 entity2, String uuid,
		OrderByComparator<Entity2> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENTITY2_WHERE);

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
			sb.append(Entity2ModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(entity2)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Entity2> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the entity2s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Entity2 entity2 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity2);
		}
	}

	/**
	 * Returns the number of entity2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity2s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY2_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "entity2.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(entity2.uuid IS NULL OR entity2.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByStudents;
	private FinderPath _finderPathWithoutPaginationFindByStudents;
	private FinderPath _finderPathCountByStudents;

	/**
	 * Returns all the entity2s where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @return the matching entity2s
	 */
	@Override
	public List<Entity2> findByStudents(int StudentId) {
		return findByStudents(
			StudentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity2> findByStudents(int StudentId, int start, int end) {
		return findByStudents(StudentId, start, end, null);
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
	@Override
	public List<Entity2> findByStudents(
		int StudentId, int start, int end,
		OrderByComparator<Entity2> orderByComparator) {

		return findByStudents(StudentId, start, end, orderByComparator, true);
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
	@Override
	public List<Entity2> findByStudents(
		int StudentId, int start, int end,
		OrderByComparator<Entity2> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByStudents;
				finderArgs = new Object[] {StudentId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByStudents;
			finderArgs = new Object[] {
				StudentId, start, end, orderByComparator
			};
		}

		List<Entity2> list = null;

		if (useFinderCache) {
			list = (List<Entity2>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Entity2 entity2 : list) {
					if (StudentId != entity2.getStudentId()) {
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

			sb.append(_SQL_SELECT_ENTITY2_WHERE);

			sb.append(_FINDER_COLUMN_STUDENTS_STUDENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Entity2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(StudentId);

				list = (List<Entity2>)QueryUtil.list(
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
	 * Returns the first entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	@Override
	public Entity2 findByStudents_First(
			int StudentId, OrderByComparator<Entity2> orderByComparator)
		throws NoSuchEntity2Exception {

		Entity2 entity2 = fetchByStudents_First(StudentId, orderByComparator);

		if (entity2 != null) {
			return entity2;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("StudentId=");
		sb.append(StudentId);

		sb.append("}");

		throw new NoSuchEntity2Exception(sb.toString());
	}

	/**
	 * Returns the first entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	@Override
	public Entity2 fetchByStudents_First(
		int StudentId, OrderByComparator<Entity2> orderByComparator) {

		List<Entity2> list = findByStudents(StudentId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	@Override
	public Entity2 findByStudents_Last(
			int StudentId, OrderByComparator<Entity2> orderByComparator)
		throws NoSuchEntity2Exception {

		Entity2 entity2 = fetchByStudents_Last(StudentId, orderByComparator);

		if (entity2 != null) {
			return entity2;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("StudentId=");
		sb.append(StudentId);

		sb.append("}");

		throw new NoSuchEntity2Exception(sb.toString());
	}

	/**
	 * Returns the last entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	@Override
	public Entity2 fetchByStudents_Last(
		int StudentId, OrderByComparator<Entity2> orderByComparator) {

		int count = countByStudents(StudentId);

		if (count == 0) {
			return null;
		}

		List<Entity2> list = findByStudents(
			StudentId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the entity2s where StudentId = &#63; from the database.
	 *
	 * @param StudentId the student ID
	 */
	@Override
	public void removeByStudents(int StudentId) {
		for (Entity2 entity2 :
				findByStudents(
					StudentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(entity2);
		}
	}

	/**
	 * Returns the number of entity2s where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @return the number of matching entity2s
	 */
	@Override
	public int countByStudents(int StudentId) {
		FinderPath finderPath = _finderPathCountByStudents;

		Object[] finderArgs = new Object[] {StudentId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENTITY2_WHERE);

			sb.append(_FINDER_COLUMN_STUDENTS_STUDENTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(StudentId);

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

	private static final String _FINDER_COLUMN_STUDENTS_STUDENTID_2 =
		"entity2.StudentId = ?";

	public Entity2PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Entity2.class);

		setModelImplClass(Entity2Impl.class);
		setModelPKClass(int.class);

		setTable(Entity2Table.INSTANCE);
	}

	/**
	 * Caches the entity2 in the entity cache if it is enabled.
	 *
	 * @param entity2 the entity2
	 */
	@Override
	public void cacheResult(Entity2 entity2) {
		entityCache.putResult(
			Entity2Impl.class, entity2.getPrimaryKey(), entity2);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the entity2s in the entity cache if it is enabled.
	 *
	 * @param entity2s the entity2s
	 */
	@Override
	public void cacheResult(List<Entity2> entity2s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (entity2s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Entity2 entity2 : entity2s) {
			if (entityCache.getResult(
					Entity2Impl.class, entity2.getPrimaryKey()) == null) {

				cacheResult(entity2);
			}
		}
	}

	/**
	 * Clears the cache for all entity2s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Entity2Impl.class);

		finderCache.clearCache(Entity2Impl.class);
	}

	/**
	 * Clears the cache for the entity2.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Entity2 entity2) {
		entityCache.removeResult(Entity2Impl.class, entity2);
	}

	@Override
	public void clearCache(List<Entity2> entity2s) {
		for (Entity2 entity2 : entity2s) {
			entityCache.removeResult(Entity2Impl.class, entity2);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Entity2Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Entity2Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
	 *
	 * @param StudentId the primary key for the new entity2
	 * @return the new entity2
	 */
	@Override
	public Entity2 create(int StudentId) {
		Entity2 entity2 = new Entity2Impl();

		entity2.setNew(true);
		entity2.setPrimaryKey(StudentId);

		String uuid = PortalUUIDUtil.generate();

		entity2.setUuid(uuid);

		return entity2;
	}

	/**
	 * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2 that was removed
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	@Override
	public Entity2 remove(int StudentId) throws NoSuchEntity2Exception {
		return remove((Serializable)StudentId);
	}

	/**
	 * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the entity2
	 * @return the entity2 that was removed
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	@Override
	public Entity2 remove(Serializable primaryKey)
		throws NoSuchEntity2Exception {

		Session session = null;

		try {
			session = openSession();

			Entity2 entity2 = (Entity2)session.get(
				Entity2Impl.class, primaryKey);

			if (entity2 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntity2Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(entity2);
		}
		catch (NoSuchEntity2Exception noSuchEntityException) {
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
	protected Entity2 removeImpl(Entity2 entity2) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(entity2)) {
				entity2 = (Entity2)session.get(
					Entity2Impl.class, entity2.getPrimaryKeyObj());
			}

			if (entity2 != null) {
				session.delete(entity2);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (entity2 != null) {
			clearCache(entity2);
		}

		return entity2;
	}

	@Override
	public Entity2 updateImpl(Entity2 entity2) {
		boolean isNew = entity2.isNew();

		if (!(entity2 instanceof Entity2ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(entity2.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(entity2);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in entity2 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Entity2 implementation " +
					entity2.getClass());
		}

		Entity2ModelImpl entity2ModelImpl = (Entity2ModelImpl)entity2;

		if (Validator.isNull(entity2.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			entity2.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(entity2);
			}
			else {
				entity2 = (Entity2)session.merge(entity2);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(Entity2Impl.class, entity2ModelImpl, false, true);

		if (isNew) {
			entity2.setNew(false);
		}

		entity2.resetOriginalValues();

		return entity2;
	}

	/**
	 * Returns the entity2 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the entity2
	 * @return the entity2
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	@Override
	public Entity2 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntity2Exception {

		Entity2 entity2 = fetchByPrimaryKey(primaryKey);

		if (entity2 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntity2Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return entity2;
	}

	/**
	 * Returns the entity2 with the primary key or throws a <code>NoSuchEntity2Exception</code> if it could not be found.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	@Override
	public Entity2 findByPrimaryKey(int StudentId)
		throws NoSuchEntity2Exception {

		return findByPrimaryKey((Serializable)StudentId);
	}

	/**
	 * Returns the entity2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2, or <code>null</code> if a entity2 with the primary key could not be found
	 */
	@Override
	public Entity2 fetchByPrimaryKey(int StudentId) {
		return fetchByPrimaryKey((Serializable)StudentId);
	}

	/**
	 * Returns all the entity2s.
	 *
	 * @return the entity2s
	 */
	@Override
	public List<Entity2> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Entity2> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Entity2> findAll(
		int start, int end, OrderByComparator<Entity2> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Entity2> findAll(
		int start, int end, OrderByComparator<Entity2> orderByComparator,
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

		List<Entity2> list = null;

		if (useFinderCache) {
			list = (List<Entity2>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ENTITY2);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ENTITY2;

				sql = sql.concat(Entity2ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Entity2>)QueryUtil.list(
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
	 * Removes all the entity2s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Entity2 entity2 : findAll()) {
			remove(entity2);
		}
	}

	/**
	 * Returns the number of entity2s.
	 *
	 * @return the number of entity2s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ENTITY2);

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
		return "StudentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ENTITY2;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Entity2ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the entity2 persistence.
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

		_finderPathWithPaginationFindByStudents = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStudents",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"StudentId"}, true);

		_finderPathWithoutPaginationFindByStudents = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStudents",
			new String[] {Integer.class.getName()}, new String[] {"StudentId"},
			true);

		_finderPathCountByStudents = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudents",
			new String[] {Integer.class.getName()}, new String[] {"StudentId"},
			false);

		Entity2Util.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		Entity2Util.setPersistence(null);

		entityCache.removeCache(Entity2Impl.class.getName());
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

	private static final String _SQL_SELECT_ENTITY2 =
		"SELECT entity2 FROM Entity2 entity2";

	private static final String _SQL_SELECT_ENTITY2_WHERE =
		"SELECT entity2 FROM Entity2 entity2 WHERE ";

	private static final String _SQL_COUNT_ENTITY2 =
		"SELECT COUNT(entity2) FROM Entity2 entity2";

	private static final String _SQL_COUNT_ENTITY2_WHERE =
		"SELECT COUNT(entity2) FROM Entity2 entity2 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "entity2.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Entity2 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Entity2 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Entity2PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}