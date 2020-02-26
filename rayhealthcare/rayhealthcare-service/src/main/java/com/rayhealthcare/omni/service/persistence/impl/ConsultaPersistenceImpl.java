/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rayhealthcare.omni.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.rayhealthcare.omni.exception.NoSuchConsultaException;
import com.rayhealthcare.omni.model.Consulta;
import com.rayhealthcare.omni.model.impl.ConsultaImpl;
import com.rayhealthcare.omni.model.impl.ConsultaModelImpl;
import com.rayhealthcare.omni.service.persistence.ConsultaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the consulta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConsultaPersistence
 * @see com.rayhealthcare.omni.service.persistence.ConsultaUtil
 * @generated
 */
@ProviderType
public class ConsultaPersistenceImpl extends BasePersistenceImpl<Consulta>
	implements ConsultaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConsultaUtil} to access the consulta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConsultaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ConsultaModelImpl.UUID_COLUMN_BITMASK |
			ConsultaModelImpl.TIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the consultas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching consultas
	 */
	@Override
	public List<Consulta> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the consultas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @return the range of matching consultas
	 */
	@Override
	public List<Consulta> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the consultas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching consultas
	 */
	@Override
	public List<Consulta> findByUuid(String uuid, int start, int end,
		OrderByComparator<Consulta> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the consultas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching consultas
	 */
	@Override
	public List<Consulta> findByUuid(String uuid, int start, int end,
		OrderByComparator<Consulta> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Consulta> list = null;

		if (retrieveFromCache) {
			list = (List<Consulta>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Consulta consulta : list) {
					if (!Objects.equals(uuid, consulta.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONSULTA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConsultaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first consulta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByUuid_First(String uuid,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByUuid_First(uuid, orderByComparator);

		if (consulta != null) {
			return consulta;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsultaException(msg.toString());
	}

	/**
	 * Returns the first consulta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByUuid_First(String uuid,
		OrderByComparator<Consulta> orderByComparator) {
		List<Consulta> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last consulta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByUuid_Last(String uuid,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByUuid_Last(uuid, orderByComparator);

		if (consulta != null) {
			return consulta;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsultaException(msg.toString());
	}

	/**
	 * Returns the last consulta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByUuid_Last(String uuid,
		OrderByComparator<Consulta> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Consulta> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the consultas before and after the current consulta in the ordered set where uuid = &#63;.
	 *
	 * @param consultaId the primary key of the current consulta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next consulta
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta[] findByUuid_PrevAndNext(long consultaId, String uuid,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = findByPrimaryKey(consultaId);

		Session session = null;

		try {
			session = openSession();

			Consulta[] array = new ConsultaImpl[3];

			array[0] = getByUuid_PrevAndNext(session, consulta, uuid,
					orderByComparator, true);

			array[1] = consulta;

			array[2] = getByUuid_PrevAndNext(session, consulta, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Consulta getByUuid_PrevAndNext(Session session,
		Consulta consulta, String uuid,
		OrderByComparator<Consulta> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONSULTA_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConsultaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(consulta);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Consulta> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the consultas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Consulta consulta : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(consulta);
		}
	}

	/**
	 * Returns the number of consultas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching consultas
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONSULTA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "consulta.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "consulta.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(consulta.uuid IS NULL OR consulta.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			ConsultaModelImpl.UUID_COLUMN_BITMASK |
			ConsultaModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the consulta where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchConsultaException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByUUID_G(String uuid, long groupId)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByUUID_G(uuid, groupId);

		if (consulta == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchConsultaException(msg.toString());
		}

		return consulta;
	}

	/**
	 * Returns the consulta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the consulta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Consulta) {
			Consulta consulta = (Consulta)result;

			if (!Objects.equals(uuid, consulta.getUuid()) ||
					(groupId != consulta.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CONSULTA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Consulta> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Consulta consulta = list.get(0);

					result = consulta;

					cacheResult(consulta);

					if ((consulta.getUuid() == null) ||
							!consulta.getUuid().equals(uuid) ||
							(consulta.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, consulta);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Consulta)result;
		}
	}

	/**
	 * Removes the consulta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the consulta that was removed
	 */
	@Override
	public Consulta removeByUUID_G(String uuid, long groupId)
		throws NoSuchConsultaException {
		Consulta consulta = findByUUID_G(uuid, groupId);

		return remove(consulta);
	}

	/**
	 * Returns the number of consultas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching consultas
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CONSULTA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "consulta.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "consulta.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(consulta.uuid IS NULL OR consulta.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "consulta.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			ConsultaModelImpl.UUID_COLUMN_BITMASK |
			ConsultaModelImpl.COMPANYID_COLUMN_BITMASK |
			ConsultaModelImpl.TIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the consultas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching consultas
	 */
	@Override
	public List<Consulta> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the consultas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @return the range of matching consultas
	 */
	@Override
	public List<Consulta> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the consultas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching consultas
	 */
	@Override
	public List<Consulta> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Consulta> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the consultas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching consultas
	 */
	@Override
	public List<Consulta> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Consulta> list = null;

		if (retrieveFromCache) {
			list = (List<Consulta>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Consulta consulta : list) {
					if (!Objects.equals(uuid, consulta.getUuid()) ||
							(companyId != consulta.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CONSULTA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConsultaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (consulta != null) {
			return consulta;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsultaException(msg.toString());
	}

	/**
	 * Returns the first consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Consulta> orderByComparator) {
		List<Consulta> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (consulta != null) {
			return consulta;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsultaException(msg.toString());
	}

	/**
	 * Returns the last consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Consulta> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Consulta> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the consultas before and after the current consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param consultaId the primary key of the current consulta
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next consulta
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta[] findByUuid_C_PrevAndNext(long consultaId, String uuid,
		long companyId, OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = findByPrimaryKey(consultaId);

		Session session = null;

		try {
			session = openSession();

			Consulta[] array = new ConsultaImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, consulta, uuid,
					companyId, orderByComparator, true);

			array[1] = consulta;

			array[2] = getByUuid_C_PrevAndNext(session, consulta, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Consulta getByUuid_C_PrevAndNext(Session session,
		Consulta consulta, String uuid, long companyId,
		OrderByComparator<Consulta> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CONSULTA_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConsultaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(consulta);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Consulta> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the consultas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Consulta consulta : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(consulta);
		}
	}

	/**
	 * Returns the number of consultas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching consultas
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CONSULTA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "consulta.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "consulta.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(consulta.uuid IS NULL OR consulta.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "consulta.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACIENTEID =
		new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPacienteId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACIENTEID =
		new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, ConsultaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPacienteId",
			new String[] { Long.class.getName() },
			ConsultaModelImpl.PACIENTEID_COLUMN_BITMASK |
			ConsultaModelImpl.TIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACIENTEID = new FinderPath(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPacienteId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the consultas where pacienteId = &#63;.
	 *
	 * @param pacienteId the paciente ID
	 * @return the matching consultas
	 */
	@Override
	public List<Consulta> findByPacienteId(long pacienteId) {
		return findByPacienteId(pacienteId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the consultas where pacienteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pacienteId the paciente ID
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @return the range of matching consultas
	 */
	@Override
	public List<Consulta> findByPacienteId(long pacienteId, int start, int end) {
		return findByPacienteId(pacienteId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the consultas where pacienteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pacienteId the paciente ID
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching consultas
	 */
	@Override
	public List<Consulta> findByPacienteId(long pacienteId, int start, int end,
		OrderByComparator<Consulta> orderByComparator) {
		return findByPacienteId(pacienteId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the consultas where pacienteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pacienteId the paciente ID
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching consultas
	 */
	@Override
	public List<Consulta> findByPacienteId(long pacienteId, int start, int end,
		OrderByComparator<Consulta> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACIENTEID;
			finderArgs = new Object[] { pacienteId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACIENTEID;
			finderArgs = new Object[] { pacienteId, start, end, orderByComparator };
		}

		List<Consulta> list = null;

		if (retrieveFromCache) {
			list = (List<Consulta>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Consulta consulta : list) {
					if ((pacienteId != consulta.getPacienteId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONSULTA_WHERE);

			query.append(_FINDER_COLUMN_PACIENTEID_PACIENTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConsultaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pacienteId);

				if (!pagination) {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first consulta in the ordered set where pacienteId = &#63;.
	 *
	 * @param pacienteId the paciente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByPacienteId_First(long pacienteId,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByPacienteId_First(pacienteId,
				orderByComparator);

		if (consulta != null) {
			return consulta;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("pacienteId=");
		msg.append(pacienteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsultaException(msg.toString());
	}

	/**
	 * Returns the first consulta in the ordered set where pacienteId = &#63;.
	 *
	 * @param pacienteId the paciente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByPacienteId_First(long pacienteId,
		OrderByComparator<Consulta> orderByComparator) {
		List<Consulta> list = findByPacienteId(pacienteId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last consulta in the ordered set where pacienteId = &#63;.
	 *
	 * @param pacienteId the paciente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consulta
	 * @throws NoSuchConsultaException if a matching consulta could not be found
	 */
	@Override
	public Consulta findByPacienteId_Last(long pacienteId,
		OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByPacienteId_Last(pacienteId, orderByComparator);

		if (consulta != null) {
			return consulta;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("pacienteId=");
		msg.append(pacienteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsultaException(msg.toString());
	}

	/**
	 * Returns the last consulta in the ordered set where pacienteId = &#63;.
	 *
	 * @param pacienteId the paciente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	 */
	@Override
	public Consulta fetchByPacienteId_Last(long pacienteId,
		OrderByComparator<Consulta> orderByComparator) {
		int count = countByPacienteId(pacienteId);

		if (count == 0) {
			return null;
		}

		List<Consulta> list = findByPacienteId(pacienteId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the consultas before and after the current consulta in the ordered set where pacienteId = &#63;.
	 *
	 * @param consultaId the primary key of the current consulta
	 * @param pacienteId the paciente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next consulta
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta[] findByPacienteId_PrevAndNext(long consultaId,
		long pacienteId, OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException {
		Consulta consulta = findByPrimaryKey(consultaId);

		Session session = null;

		try {
			session = openSession();

			Consulta[] array = new ConsultaImpl[3];

			array[0] = getByPacienteId_PrevAndNext(session, consulta,
					pacienteId, orderByComparator, true);

			array[1] = consulta;

			array[2] = getByPacienteId_PrevAndNext(session, consulta,
					pacienteId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Consulta getByPacienteId_PrevAndNext(Session session,
		Consulta consulta, long pacienteId,
		OrderByComparator<Consulta> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONSULTA_WHERE);

		query.append(_FINDER_COLUMN_PACIENTEID_PACIENTEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConsultaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(pacienteId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(consulta);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Consulta> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the consultas where pacienteId = &#63; from the database.
	 *
	 * @param pacienteId the paciente ID
	 */
	@Override
	public void removeByPacienteId(long pacienteId) {
		for (Consulta consulta : findByPacienteId(pacienteId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(consulta);
		}
	}

	/**
	 * Returns the number of consultas where pacienteId = &#63;.
	 *
	 * @param pacienteId the paciente ID
	 * @return the number of matching consultas
	 */
	@Override
	public int countByPacienteId(long pacienteId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACIENTEID;

		Object[] finderArgs = new Object[] { pacienteId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONSULTA_WHERE);

			query.append(_FINDER_COLUMN_PACIENTEID_PACIENTEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pacienteId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PACIENTEID_PACIENTEID_2 = "consulta.pacienteId = ?";

	public ConsultaPersistenceImpl() {
		setModelClass(Consulta.class);
	}

	/**
	 * Caches the consulta in the entity cache if it is enabled.
	 *
	 * @param consulta the consulta
	 */
	@Override
	public void cacheResult(Consulta consulta) {
		entityCache.putResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaImpl.class, consulta.getPrimaryKey(), consulta);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { consulta.getUuid(), consulta.getGroupId() }, consulta);

		consulta.resetOriginalValues();
	}

	/**
	 * Caches the consultas in the entity cache if it is enabled.
	 *
	 * @param consultas the consultas
	 */
	@Override
	public void cacheResult(List<Consulta> consultas) {
		for (Consulta consulta : consultas) {
			if (entityCache.getResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
						ConsultaImpl.class, consulta.getPrimaryKey()) == null) {
				cacheResult(consulta);
			}
			else {
				consulta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all consultas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ConsultaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the consulta.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Consulta consulta) {
		entityCache.removeResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaImpl.class, consulta.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ConsultaModelImpl)consulta, true);
	}

	@Override
	public void clearCache(List<Consulta> consultas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Consulta consulta : consultas) {
			entityCache.removeResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
				ConsultaImpl.class, consulta.getPrimaryKey());

			clearUniqueFindersCache((ConsultaModelImpl)consulta, true);
		}
	}

	protected void cacheUniqueFindersCache(ConsultaModelImpl consultaModelImpl) {
		Object[] args = new Object[] {
				consultaModelImpl.getUuid(), consultaModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			consultaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ConsultaModelImpl consultaModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					consultaModelImpl.getUuid(), consultaModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((consultaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					consultaModelImpl.getOriginalUuid(),
					consultaModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new consulta with the primary key. Does not add the consulta to the database.
	 *
	 * @param consultaId the primary key for the new consulta
	 * @return the new consulta
	 */
	@Override
	public Consulta create(long consultaId) {
		Consulta consulta = new ConsultaImpl();

		consulta.setNew(true);
		consulta.setPrimaryKey(consultaId);

		String uuid = PortalUUIDUtil.generate();

		consulta.setUuid(uuid);

		consulta.setCompanyId(companyProvider.getCompanyId());

		return consulta;
	}

	/**
	 * Removes the consulta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param consultaId the primary key of the consulta
	 * @return the consulta that was removed
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta remove(long consultaId) throws NoSuchConsultaException {
		return remove((Serializable)consultaId);
	}

	/**
	 * Removes the consulta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the consulta
	 * @return the consulta that was removed
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta remove(Serializable primaryKey)
		throws NoSuchConsultaException {
		Session session = null;

		try {
			session = openSession();

			Consulta consulta = (Consulta)session.get(ConsultaImpl.class,
					primaryKey);

			if (consulta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConsultaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(consulta);
		}
		catch (NoSuchConsultaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Consulta removeImpl(Consulta consulta) {
		consulta = toUnwrappedModel(consulta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(consulta)) {
				consulta = (Consulta)session.get(ConsultaImpl.class,
						consulta.getPrimaryKeyObj());
			}

			if (consulta != null) {
				session.delete(consulta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (consulta != null) {
			clearCache(consulta);
		}

		return consulta;
	}

	@Override
	public Consulta updateImpl(Consulta consulta) {
		consulta = toUnwrappedModel(consulta);

		boolean isNew = consulta.isNew();

		ConsultaModelImpl consultaModelImpl = (ConsultaModelImpl)consulta;

		if (Validator.isNull(consulta.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			consulta.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (consulta.getCreateDate() == null)) {
			if (serviceContext == null) {
				consulta.setCreateDate(now);
			}
			else {
				consulta.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!consultaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				consulta.setModifiedDate(now);
			}
			else {
				consulta.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (consulta.isNew()) {
				session.save(consulta);

				consulta.setNew(false);
			}
			else {
				consulta = (Consulta)session.merge(consulta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ConsultaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((consultaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { consultaModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { consultaModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((consultaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						consultaModelImpl.getOriginalUuid(),
						consultaModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						consultaModelImpl.getUuid(),
						consultaModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((consultaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACIENTEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						consultaModelImpl.getOriginalPacienteId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PACIENTEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACIENTEID,
					args);

				args = new Object[] { consultaModelImpl.getPacienteId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PACIENTEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACIENTEID,
					args);
			}
		}

		entityCache.putResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
			ConsultaImpl.class, consulta.getPrimaryKey(), consulta, false);

		clearUniqueFindersCache(consultaModelImpl, false);
		cacheUniqueFindersCache(consultaModelImpl);

		consulta.resetOriginalValues();

		return consulta;
	}

	protected Consulta toUnwrappedModel(Consulta consulta) {
		if (consulta instanceof ConsultaImpl) {
			return consulta;
		}

		ConsultaImpl consultaImpl = new ConsultaImpl();

		consultaImpl.setNew(consulta.isNew());
		consultaImpl.setPrimaryKey(consulta.getPrimaryKey());

		consultaImpl.setUuid(consulta.getUuid());
		consultaImpl.setConsultaId(consulta.getConsultaId());
		consultaImpl.setGroupId(consulta.getGroupId());
		consultaImpl.setCompanyId(consulta.getCompanyId());
		consultaImpl.setUserId(consulta.getUserId());
		consultaImpl.setUserName(consulta.getUserName());
		consultaImpl.setCreateDate(consulta.getCreateDate());
		consultaImpl.setModifiedDate(consulta.getModifiedDate());
		consultaImpl.setPacienteId(consulta.getPacienteId());
		consultaImpl.setMedicoId(consulta.getMedicoId());
		consultaImpl.setEspecialidade(consulta.getEspecialidade());
		consultaImpl.setTime(consulta.getTime());

		return consultaImpl;
	}

	/**
	 * Returns the consulta with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the consulta
	 * @return the consulta
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConsultaException {
		Consulta consulta = fetchByPrimaryKey(primaryKey);

		if (consulta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConsultaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return consulta;
	}

	/**
	 * Returns the consulta with the primary key or throws a {@link NoSuchConsultaException} if it could not be found.
	 *
	 * @param consultaId the primary key of the consulta
	 * @return the consulta
	 * @throws NoSuchConsultaException if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta findByPrimaryKey(long consultaId)
		throws NoSuchConsultaException {
		return findByPrimaryKey((Serializable)consultaId);
	}

	/**
	 * Returns the consulta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the consulta
	 * @return the consulta, or <code>null</code> if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
				ConsultaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Consulta consulta = (Consulta)serializable;

		if (consulta == null) {
			Session session = null;

			try {
				session = openSession();

				consulta = (Consulta)session.get(ConsultaImpl.class, primaryKey);

				if (consulta != null) {
					cacheResult(consulta);
				}
				else {
					entityCache.putResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
						ConsultaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
					ConsultaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return consulta;
	}

	/**
	 * Returns the consulta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param consultaId the primary key of the consulta
	 * @return the consulta, or <code>null</code> if a consulta with the primary key could not be found
	 */
	@Override
	public Consulta fetchByPrimaryKey(long consultaId) {
		return fetchByPrimaryKey((Serializable)consultaId);
	}

	@Override
	public Map<Serializable, Consulta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Consulta> map = new HashMap<Serializable, Consulta>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Consulta consulta = fetchByPrimaryKey(primaryKey);

			if (consulta != null) {
				map.put(primaryKey, consulta);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
					ConsultaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Consulta)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONSULTA_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Consulta consulta : (List<Consulta>)q.list()) {
				map.put(consulta.getPrimaryKeyObj(), consulta);

				cacheResult(consulta);

				uncachedPrimaryKeys.remove(consulta.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ConsultaModelImpl.ENTITY_CACHE_ENABLED,
					ConsultaImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the consultas.
	 *
	 * @return the consultas
	 */
	@Override
	public List<Consulta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the consultas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @return the range of consultas
	 */
	@Override
	public List<Consulta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the consultas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of consultas
	 */
	@Override
	public List<Consulta> findAll(int start, int end,
		OrderByComparator<Consulta> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the consultas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of consultas
	 * @param end the upper bound of the range of consultas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of consultas
	 */
	@Override
	public List<Consulta> findAll(int start, int end,
		OrderByComparator<Consulta> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Consulta> list = null;

		if (retrieveFromCache) {
			list = (List<Consulta>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONSULTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONSULTA;

				if (pagination) {
					sql = sql.concat(ConsultaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Consulta>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the consultas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Consulta consulta : findAll()) {
			remove(consulta);
		}
	}

	/**
	 * Returns the number of consultas.
	 *
	 * @return the number of consultas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONSULTA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
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
	protected Map<String, Integer> getTableColumnsMap() {
		return ConsultaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the consulta persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ConsultaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CONSULTA = "SELECT consulta FROM Consulta consulta";
	private static final String _SQL_SELECT_CONSULTA_WHERE_PKS_IN = "SELECT consulta FROM Consulta consulta WHERE consultaId IN (";
	private static final String _SQL_SELECT_CONSULTA_WHERE = "SELECT consulta FROM Consulta consulta WHERE ";
	private static final String _SQL_COUNT_CONSULTA = "SELECT COUNT(consulta) FROM Consulta consulta";
	private static final String _SQL_COUNT_CONSULTA_WHERE = "SELECT COUNT(consulta) FROM Consulta consulta WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "consulta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Consulta exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Consulta exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ConsultaPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "time"
			});
}