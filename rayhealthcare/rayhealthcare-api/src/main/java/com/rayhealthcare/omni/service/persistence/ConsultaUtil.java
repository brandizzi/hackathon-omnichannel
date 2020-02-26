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

package com.rayhealthcare.omni.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rayhealthcare.omni.model.Consulta;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the consulta service. This utility wraps {@link com.rayhealthcare.omni.service.persistence.impl.ConsultaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConsultaPersistence
 * @see com.rayhealthcare.omni.service.persistence.impl.ConsultaPersistenceImpl
 * @generated
 */
@ProviderType
public class ConsultaUtil {
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
	public static void clearCache(Consulta consulta) {
		getPersistence().clearCache(consulta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Consulta> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Consulta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Consulta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Consulta update(Consulta consulta) {
		return getPersistence().update(consulta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Consulta update(Consulta consulta,
		ServiceContext serviceContext) {
		return getPersistence().update(consulta, serviceContext);
	}

	/**
	* Returns all the consultas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching consultas
	*/
	public static List<Consulta> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<Consulta> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<Consulta> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Consulta> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<Consulta> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public static Consulta findByUuid_First(java.lang.String uuid,
		OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public static Consulta findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static Consulta[] findByUuid_PrevAndNext(long consultaId,
		java.lang.String uuid, OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(consultaId, uuid, orderByComparator);
	}

	/**
	* Removes all the consultas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of consultas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching consultas
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the consulta where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchConsultaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public static Consulta findByUUID_G(java.lang.String uuid, long groupId)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the consulta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the consulta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the consulta where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the consulta that was removed
	*/
	public static Consulta removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of consultas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching consultas
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the consultas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching consultas
	*/
	public static List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
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
	public static List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
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
	public static List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
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
	public static List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Consulta> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
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
	public static Consulta findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
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
	public static Consulta findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
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
	public static Consulta[] findByUuid_C_PrevAndNext(long consultaId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(consultaId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the consultas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of consultas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching consultas
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the consultas where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @return the matching consultas
	*/
	public static List<Consulta> findByPacienteId(long pacienteId) {
		return getPersistence().findByPacienteId(pacienteId);
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
	public static List<Consulta> findByPacienteId(long pacienteId, int start,
		int end) {
		return getPersistence().findByPacienteId(pacienteId, start, end);
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
	public static List<Consulta> findByPacienteId(long pacienteId, int start,
		int end, OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .findByPacienteId(pacienteId, start, end, orderByComparator);
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
	public static List<Consulta> findByPacienteId(long pacienteId, int start,
		int end, OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPacienteId(pacienteId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public static Consulta findByPacienteId_First(long pacienteId,
		OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByPacienteId_First(pacienteId, orderByComparator);
	}

	/**
	* Returns the first consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByPacienteId_First(long pacienteId,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .fetchByPacienteId_First(pacienteId, orderByComparator);
	}

	/**
	* Returns the last consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public static Consulta findByPacienteId_Last(long pacienteId,
		OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByPacienteId_Last(pacienteId, orderByComparator);
	}

	/**
	* Returns the last consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public static Consulta fetchByPacienteId_Last(long pacienteId,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence()
				   .fetchByPacienteId_Last(pacienteId, orderByComparator);
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
	public static Consulta[] findByPacienteId_PrevAndNext(long consultaId,
		long pacienteId, OrderByComparator<Consulta> orderByComparator)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence()
				   .findByPacienteId_PrevAndNext(consultaId, pacienteId,
			orderByComparator);
	}

	/**
	* Removes all the consultas where pacienteId = &#63; from the database.
	*
	* @param pacienteId the paciente ID
	*/
	public static void removeByPacienteId(long pacienteId) {
		getPersistence().removeByPacienteId(pacienteId);
	}

	/**
	* Returns the number of consultas where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @return the number of matching consultas
	*/
	public static int countByPacienteId(long pacienteId) {
		return getPersistence().countByPacienteId(pacienteId);
	}

	/**
	* Caches the consulta in the entity cache if it is enabled.
	*
	* @param consulta the consulta
	*/
	public static void cacheResult(Consulta consulta) {
		getPersistence().cacheResult(consulta);
	}

	/**
	* Caches the consultas in the entity cache if it is enabled.
	*
	* @param consultas the consultas
	*/
	public static void cacheResult(List<Consulta> consultas) {
		getPersistence().cacheResult(consultas);
	}

	/**
	* Creates a new consulta with the primary key. Does not add the consulta to the database.
	*
	* @param consultaId the primary key for the new consulta
	* @return the new consulta
	*/
	public static Consulta create(long consultaId) {
		return getPersistence().create(consultaId);
	}

	/**
	* Removes the consulta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta that was removed
	* @throws NoSuchConsultaException if a consulta with the primary key could not be found
	*/
	public static Consulta remove(long consultaId)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence().remove(consultaId);
	}

	public static Consulta updateImpl(Consulta consulta) {
		return getPersistence().updateImpl(consulta);
	}

	/**
	* Returns the consulta with the primary key or throws a {@link NoSuchConsultaException} if it could not be found.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta
	* @throws NoSuchConsultaException if a consulta with the primary key could not be found
	*/
	public static Consulta findByPrimaryKey(long consultaId)
		throws com.rayhealthcare.omni.exception.NoSuchConsultaException {
		return getPersistence().findByPrimaryKey(consultaId);
	}

	/**
	* Returns the consulta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta, or <code>null</code> if a consulta with the primary key could not be found
	*/
	public static Consulta fetchByPrimaryKey(long consultaId) {
		return getPersistence().fetchByPrimaryKey(consultaId);
	}

	public static java.util.Map<java.io.Serializable, Consulta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the consultas.
	*
	* @return the consultas
	*/
	public static List<Consulta> findAll() {
		return getPersistence().findAll();
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
	public static List<Consulta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Consulta> findAll(int start, int end,
		OrderByComparator<Consulta> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Consulta> findAll(int start, int end,
		OrderByComparator<Consulta> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the consultas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of consultas.
	*
	* @return the number of consultas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ConsultaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ConsultaPersistence, ConsultaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ConsultaPersistence.class);
}