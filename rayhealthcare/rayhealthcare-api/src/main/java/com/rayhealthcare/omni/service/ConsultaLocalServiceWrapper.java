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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConsultaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConsultaLocalService
 * @generated
 */
@ProviderType
public class ConsultaLocalServiceWrapper implements ConsultaLocalService,
	ServiceWrapper<ConsultaLocalService> {
	public ConsultaLocalServiceWrapper(
		ConsultaLocalService consultaLocalService) {
		_consultaLocalService = consultaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _consultaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _consultaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _consultaLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _consultaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _consultaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _consultaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the consulta to the database. Also notifies the appropriate model listeners.
	*
	* @param consulta the consulta
	* @return the consulta that was added
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta addConsulta(
		com.rayhealthcare.omni.model.Consulta consulta) {
		return _consultaLocalService.addConsulta(consulta);
	}

	/**
	* Creates a new consulta with the primary key. Does not add the consulta to the database.
	*
	* @param consultaId the primary key for the new consulta
	* @return the new consulta
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta createConsulta(long consultaId) {
		return _consultaLocalService.createConsulta(consultaId);
	}

	/**
	* Deletes the consulta from the database. Also notifies the appropriate model listeners.
	*
	* @param consulta the consulta
	* @return the consulta that was removed
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta deleteConsulta(
		com.rayhealthcare.omni.model.Consulta consulta) {
		return _consultaLocalService.deleteConsulta(consulta);
	}

	/**
	* Deletes the consulta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta that was removed
	* @throws PortalException if a consulta with the primary key could not be found
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta deleteConsulta(long consultaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _consultaLocalService.deleteConsulta(consultaId);
	}

	@Override
	public com.rayhealthcare.omni.model.Consulta fetchConsulta(long consultaId) {
		return _consultaLocalService.fetchConsulta(consultaId);
	}

	/**
	* Returns the consulta matching the UUID and group.
	*
	* @param uuid the consulta's UUID
	* @param groupId the primary key of the group
	* @return the matching consulta, or <code>null</code> if a matching consulta could not be found
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta fetchConsultaByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _consultaLocalService.fetchConsultaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the consulta with the primary key.
	*
	* @param consultaId the primary key of the consulta
	* @return the consulta
	* @throws PortalException if a consulta with the primary key could not be found
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta getConsulta(long consultaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _consultaLocalService.getConsulta(consultaId);
	}

	/**
	* Returns the consulta matching the UUID and group.
	*
	* @param uuid the consulta's UUID
	* @param groupId the primary key of the group
	* @return the matching consulta
	* @throws PortalException if a matching consulta could not be found
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta getConsultaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _consultaLocalService.getConsultaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the consulta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param consulta the consulta
	* @return the consulta that was updated
	*/
	@Override
	public com.rayhealthcare.omni.model.Consulta updateConsulta(
		com.rayhealthcare.omni.model.Consulta consulta) {
		return _consultaLocalService.updateConsulta(consulta);
	}

	/**
	* Returns the number of consultas.
	*
	* @return the number of consultas
	*/
	@Override
	public int getConsultasCount() {
		return _consultaLocalService.getConsultasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _consultaLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _consultaLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _consultaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _consultaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

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
	@Override
	public java.util.List<com.rayhealthcare.omni.model.Consulta> getConsultas(
		int start, int end) {
		return _consultaLocalService.getConsultas(start, end);
	}

	/**
	* Returns all the consultas matching the UUID and company.
	*
	* @param uuid the UUID of the consultas
	* @param companyId the primary key of the company
	* @return the matching consultas, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rayhealthcare.omni.model.Consulta> getConsultasByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _consultaLocalService.getConsultasByUuidAndCompanyId(uuid,
			companyId);
	}

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
	@Override
	public java.util.List<com.rayhealthcare.omni.model.Consulta> getConsultasByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rayhealthcare.omni.model.Consulta> orderByComparator) {
		return _consultaLocalService.getConsultasByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _consultaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _consultaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ConsultaLocalService getWrappedService() {
		return _consultaLocalService;
	}

	@Override
	public void setWrappedService(ConsultaLocalService consultaLocalService) {
		_consultaLocalService = consultaLocalService;
	}

	private ConsultaLocalService _consultaLocalService;
}