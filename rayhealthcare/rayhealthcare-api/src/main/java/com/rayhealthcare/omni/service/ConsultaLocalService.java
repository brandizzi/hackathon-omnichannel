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

package com.rayhealthcare.omni.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rayhealthcare.omni.model.Consulta;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Consulta. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ConsultaLocalServiceUtil
 * @see com.rayhealthcare.omni.service.base.ConsultaLocalServiceBaseImpl
 * @see com.rayhealthcare.omni.service.impl.ConsultaLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ConsultaLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConsultaLocalServiceUtil} to access the consulta local service. Add custom service methods to {@link com.rayhealthcare.omni.service.impl.ConsultaLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the consulta to the database. Also notifies the appropriate model listeners.
	*
	* @param consulta the consulta
	* @return the consulta that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Consulta addConsulta(Consulta consulta);

	/**
	* Creates a new consulta with the primary key. Does not add the consulta to the database.
	*
	* @param consultaId the primary key for the new consulta
	* @return the new consulta
	*/
	public Consulta createConsulta(long consultaId);

	/**
	* Deletes the consulta from the database. Also notifies the appropriate model listeners.
	*
	* @param consulta the consulta
	* @return the consulta that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Consulta deleteConsulta(Consulta consulta);

	/**
	* Deletes the consulta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta that was removed
	* @throws PortalException if a consulta with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Consulta deleteConsulta(long consultaId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Consulta fetchConsulta(long consultaId);

	/**
	* Returns the consulta matching the UUID and group.
	*
	* @param uuid the consulta's UUID
	* @param groupId the primary key of the group
	* @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Consulta fetchConsultaByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the consulta with the primary key.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta
	* @throws PortalException if a consulta with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Consulta getConsulta(long consultaId) throws PortalException;

	/**
	* Returns the consulta matching the UUID and group.
	*
	* @param uuid the consulta's UUID
	* @param groupId the primary key of the group
	* @return the matching consulta
	* @throws PortalException if a matching consulta could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Consulta getConsultaByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	/**
	* Updates the consulta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param consulta the consulta
	* @return the consulta that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Consulta updateConsulta(Consulta consulta);

	/**
	* Returns the number of consultas.
	*
	* @return the number of consultas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getConsultasCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rayhealthcare.omni.model.impl.ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rayhealthcare.omni.model.impl.ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns a range of all the consultas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rayhealthcare.omni.model.impl.ConsultaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of consultas
	* @param end the upper bound of the range of consultas (not inclusive)
	* @return the range of consultas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Consulta> getConsultas(int start, int end);

	/**
	* Returns all the consultas matching the UUID and company.
	*
	* @param uuid the UUID of the consultas
	* @param companyId the primary key of the company
	* @return the matching consultas, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Consulta> getConsultasByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of consultas matching the UUID and company.
	*
	* @param uuid the UUID of the consultas
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of consultas
	* @param end the upper bound of the range of consultas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching consultas, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Consulta> getConsultasByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<Consulta> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}