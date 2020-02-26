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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rayhealthcare.omni.exception.NoSuchConsultaException;
import com.rayhealthcare.omni.model.Consulta;

/**
 * The persistence interface for the consulta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rayhealthcare.omni.service.persistence.impl.ConsultaPersistenceImpl
 * @see ConsultaUtil
 * @generated
 */
@ProviderType
public interface ConsultaPersistence extends BasePersistence<Consulta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConsultaUtil} to access the consulta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the consultas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching consultas
	*/
	public java.util.List<Consulta> findByUuid(java.lang.String uuid);

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
	public java.util.List<Consulta> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Consulta> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

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
	public java.util.List<Consulta> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Returns the first consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

	/**
	* Returns the last consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Returns the last consulta in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

	/**
	* Returns the consultas before and after the current consulta in the ordered set where uuid = &#63;.
	*
	* @param consultaId the primary key of the current consulta
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consulta
	* @throws NoSuchConsultaException if a consulta with the primary key could not be found
	*/
	public Consulta[] findByUuid_PrevAndNext(long consultaId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Removes all the consultas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of consultas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching consultas
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the consulta where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchConsultaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchConsultaException;

	/**
	* Returns the consulta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the consulta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the consulta where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the consulta that was removed
	*/
	public Consulta removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchConsultaException;

	/**
	* Returns the number of consultas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching consultas
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the consultas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching consultas
	*/
	public java.util.List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

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
	public java.util.List<Consulta> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Returns the first consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

	/**
	* Returns the last consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Returns the last consulta in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

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
	public Consulta[] findByUuid_C_PrevAndNext(long consultaId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Removes all the consultas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of consultas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching consultas
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the consultas where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @return the matching consultas
	*/
	public java.util.List<Consulta> findByPacienteId(long pacienteId);

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
	public java.util.List<Consulta> findByPacienteId(long pacienteId,
		int start, int end);

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
	public java.util.List<Consulta> findByPacienteId(long pacienteId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

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
	public java.util.List<Consulta> findByPacienteId(long pacienteId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByPacienteId_First(long pacienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Returns the first consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByPacienteId_First(long pacienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

	/**
	* Returns the last consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta
	* @throws NoSuchConsultaException if a matching consulta could not be found
	*/
	public Consulta findByPacienteId_Last(long pacienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Returns the last consulta in the ordered set where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	public Consulta fetchByPacienteId_Last(long pacienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

	/**
	* Returns the consultas before and after the current consulta in the ordered set where pacienteId = &#63;.
	*
	* @param consultaId the primary key of the current consulta
	* @param pacienteId the paciente ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consulta
	* @throws NoSuchConsultaException if a consulta with the primary key could not be found
	*/
	public Consulta[] findByPacienteId_PrevAndNext(long consultaId,
		long pacienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator)
		throws NoSuchConsultaException;

	/**
	* Removes all the consultas where pacienteId = &#63; from the database.
	*
	* @param pacienteId the paciente ID
	*/
	public void removeByPacienteId(long pacienteId);

	/**
	* Returns the number of consultas where pacienteId = &#63;.
	*
	* @param pacienteId the paciente ID
	* @return the number of matching consultas
	*/
	public int countByPacienteId(long pacienteId);

	/**
	* Caches the consulta in the entity cache if it is enabled.
	*
	* @param consulta the consulta
	*/
	public void cacheResult(Consulta consulta);

	/**
	* Caches the consultas in the entity cache if it is enabled.
	*
	* @param consultas the consultas
	*/
	public void cacheResult(java.util.List<Consulta> consultas);

	/**
	* Creates a new consulta with the primary key. Does not add the consulta to the database.
	*
	* @param consultaId the primary key for the new consulta
	* @return the new consulta
	*/
	public Consulta create(long consultaId);

	/**
	* Removes the consulta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta that was removed
	* @throws NoSuchConsultaException if a consulta with the primary key could not be found
	*/
	public Consulta remove(long consultaId) throws NoSuchConsultaException;

	public Consulta updateImpl(Consulta consulta);

	/**
	* Returns the consulta with the primary key or throws a {@link NoSuchConsultaException} if it could not be found.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta
	* @throws NoSuchConsultaException if a consulta with the primary key could not be found
	*/
	public Consulta findByPrimaryKey(long consultaId)
		throws NoSuchConsultaException;

	/**
	* Returns the consulta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta, or <code>null</code> if a consulta with the primary key could not be found
	*/
	public Consulta fetchByPrimaryKey(long consultaId);

	@Override
	public java.util.Map<java.io.Serializable, Consulta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the consultas.
	*
	* @return the consultas
	*/
	public java.util.List<Consulta> findAll();

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
	public java.util.List<Consulta> findAll(int start, int end);

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
	public java.util.List<Consulta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator);

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
	public java.util.List<Consulta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Consulta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the consultas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of consultas.
	*
	* @return the number of consultas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}