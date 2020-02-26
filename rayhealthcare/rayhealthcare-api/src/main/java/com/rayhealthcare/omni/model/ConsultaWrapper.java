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

package com.rayhealthcare.omni.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Consulta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Consulta
 * @generated
 */
@ProviderType
public class ConsultaWrapper implements Consulta, ModelWrapper<Consulta> {
	public ConsultaWrapper(Consulta consulta) {
		_consulta = consulta;
	}

	@Override
	public Class<?> getModelClass() {
		return Consulta.class;
	}

	@Override
	public String getModelClassName() {
		return Consulta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("consultaId", getConsultaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("pacienteId", getPacienteId());
		attributes.put("medicoId", getMedicoId());
		attributes.put("especialidade", getEspecialidade());
		attributes.put("time", getTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long consultaId = (Long)attributes.get("consultaId");

		if (consultaId != null) {
			setConsultaId(consultaId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long pacienteId = (Long)attributes.get("pacienteId");

		if (pacienteId != null) {
			setPacienteId(pacienteId);
		}

		Long medicoId = (Long)attributes.get("medicoId");

		if (medicoId != null) {
			setMedicoId(medicoId);
		}

		String especialidade = (String)attributes.get("especialidade");

		if (especialidade != null) {
			setEspecialidade(especialidade);
		}

		Long time = (Long)attributes.get("time");

		if (time != null) {
			setTime(time);
		}
	}

	@Override
	public Consulta toEscapedModel() {
		return new ConsultaWrapper(_consulta.toEscapedModel());
	}

	@Override
	public Consulta toUnescapedModel() {
		return new ConsultaWrapper(_consulta.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _consulta.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _consulta.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _consulta.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _consulta.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Consulta> toCacheModel() {
		return _consulta.toCacheModel();
	}

	@Override
	public int compareTo(Consulta consulta) {
		return _consulta.compareTo(consulta);
	}

	@Override
	public int hashCode() {
		return _consulta.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _consulta.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ConsultaWrapper((Consulta)_consulta.clone());
	}

	/**
	* Returns the especialidade of this consulta.
	*
	* @return the especialidade of this consulta
	*/
	@Override
	public java.lang.String getEspecialidade() {
		return _consulta.getEspecialidade();
	}

	/**
	* Returns the user name of this consulta.
	*
	* @return the user name of this consulta
	*/
	@Override
	public java.lang.String getUserName() {
		return _consulta.getUserName();
	}

	/**
	* Returns the user uuid of this consulta.
	*
	* @return the user uuid of this consulta
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _consulta.getUserUuid();
	}

	/**
	* Returns the uuid of this consulta.
	*
	* @return the uuid of this consulta
	*/
	@Override
	public java.lang.String getUuid() {
		return _consulta.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _consulta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _consulta.toXmlString();
	}

	/**
	* Returns the create date of this consulta.
	*
	* @return the create date of this consulta
	*/
	@Override
	public Date getCreateDate() {
		return _consulta.getCreateDate();
	}

	/**
	* Returns the modified date of this consulta.
	*
	* @return the modified date of this consulta
	*/
	@Override
	public Date getModifiedDate() {
		return _consulta.getModifiedDate();
	}

	/**
	* Returns the company ID of this consulta.
	*
	* @return the company ID of this consulta
	*/
	@Override
	public long getCompanyId() {
		return _consulta.getCompanyId();
	}

	/**
	* Returns the consulta ID of this consulta.
	*
	* @return the consulta ID of this consulta
	*/
	@Override
	public long getConsultaId() {
		return _consulta.getConsultaId();
	}

	/**
	* Returns the group ID of this consulta.
	*
	* @return the group ID of this consulta
	*/
	@Override
	public long getGroupId() {
		return _consulta.getGroupId();
	}

	/**
	* Returns the medico ID of this consulta.
	*
	* @return the medico ID of this consulta
	*/
	@Override
	public long getMedicoId() {
		return _consulta.getMedicoId();
	}

	/**
	* Returns the paciente ID of this consulta.
	*
	* @return the paciente ID of this consulta
	*/
	@Override
	public long getPacienteId() {
		return _consulta.getPacienteId();
	}

	/**
	* Returns the primary key of this consulta.
	*
	* @return the primary key of this consulta
	*/
	@Override
	public long getPrimaryKey() {
		return _consulta.getPrimaryKey();
	}

	/**
	* Returns the time of this consulta.
	*
	* @return the time of this consulta
	*/
	@Override
	public long getTime() {
		return _consulta.getTime();
	}

	/**
	* Returns the user ID of this consulta.
	*
	* @return the user ID of this consulta
	*/
	@Override
	public long getUserId() {
		return _consulta.getUserId();
	}

	@Override
	public void persist() {
		_consulta.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_consulta.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this consulta.
	*
	* @param companyId the company ID of this consulta
	*/
	@Override
	public void setCompanyId(long companyId) {
		_consulta.setCompanyId(companyId);
	}

	/**
	* Sets the consulta ID of this consulta.
	*
	* @param consultaId the consulta ID of this consulta
	*/
	@Override
	public void setConsultaId(long consultaId) {
		_consulta.setConsultaId(consultaId);
	}

	/**
	* Sets the create date of this consulta.
	*
	* @param createDate the create date of this consulta
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_consulta.setCreateDate(createDate);
	}

	/**
	* Sets the especialidade of this consulta.
	*
	* @param especialidade the especialidade of this consulta
	*/
	@Override
	public void setEspecialidade(java.lang.String especialidade) {
		_consulta.setEspecialidade(especialidade);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_consulta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_consulta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_consulta.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this consulta.
	*
	* @param groupId the group ID of this consulta
	*/
	@Override
	public void setGroupId(long groupId) {
		_consulta.setGroupId(groupId);
	}

	/**
	* Sets the medico ID of this consulta.
	*
	* @param medicoId the medico ID of this consulta
	*/
	@Override
	public void setMedicoId(long medicoId) {
		_consulta.setMedicoId(medicoId);
	}

	/**
	* Sets the modified date of this consulta.
	*
	* @param modifiedDate the modified date of this consulta
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_consulta.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_consulta.setNew(n);
	}

	/**
	* Sets the paciente ID of this consulta.
	*
	* @param pacienteId the paciente ID of this consulta
	*/
	@Override
	public void setPacienteId(long pacienteId) {
		_consulta.setPacienteId(pacienteId);
	}

	/**
	* Sets the primary key of this consulta.
	*
	* @param primaryKey the primary key of this consulta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_consulta.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_consulta.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the time of this consulta.
	*
	* @param time the time of this consulta
	*/
	@Override
	public void setTime(long time) {
		_consulta.setTime(time);
	}

	/**
	* Sets the user ID of this consulta.
	*
	* @param userId the user ID of this consulta
	*/
	@Override
	public void setUserId(long userId) {
		_consulta.setUserId(userId);
	}

	/**
	* Sets the user name of this consulta.
	*
	* @param userName the user name of this consulta
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_consulta.setUserName(userName);
	}

	/**
	* Sets the user uuid of this consulta.
	*
	* @param userUuid the user uuid of this consulta
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_consulta.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this consulta.
	*
	* @param uuid the uuid of this consulta
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_consulta.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConsultaWrapper)) {
			return false;
		}

		ConsultaWrapper consultaWrapper = (ConsultaWrapper)obj;

		if (Objects.equals(_consulta, consultaWrapper._consulta)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _consulta.getStagedModelType();
	}

	@Override
	public Consulta getWrappedModel() {
		return _consulta;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _consulta.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _consulta.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_consulta.resetOriginalValues();
	}

	private final Consulta _consulta;
}