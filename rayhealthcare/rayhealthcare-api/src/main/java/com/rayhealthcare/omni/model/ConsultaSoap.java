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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rayhealthcare.omni.service.http.ConsultaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.rayhealthcare.omni.service.http.ConsultaServiceSoap
 * @generated
 */
@ProviderType
public class ConsultaSoap implements Serializable {
	public static ConsultaSoap toSoapModel(Consulta model) {
		ConsultaSoap soapModel = new ConsultaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setConsultaId(model.getConsultaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPacienteId(model.getPacienteId());
		soapModel.setMedicoId(model.getMedicoId());
		soapModel.setEspecialidade(model.getEspecialidade());
		soapModel.setTime(model.getTime());

		return soapModel;
	}

	public static ConsultaSoap[] toSoapModels(Consulta[] models) {
		ConsultaSoap[] soapModels = new ConsultaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConsultaSoap[][] toSoapModels(Consulta[][] models) {
		ConsultaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConsultaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConsultaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConsultaSoap[] toSoapModels(List<Consulta> models) {
		List<ConsultaSoap> soapModels = new ArrayList<ConsultaSoap>(models.size());

		for (Consulta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConsultaSoap[soapModels.size()]);
	}

	public ConsultaSoap() {
	}

	public long getPrimaryKey() {
		return _consultaId;
	}

	public void setPrimaryKey(long pk) {
		setConsultaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getConsultaId() {
		return _consultaId;
	}

	public void setConsultaId(long consultaId) {
		_consultaId = consultaId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getPacienteId() {
		return _pacienteId;
	}

	public void setPacienteId(long pacienteId) {
		_pacienteId = pacienteId;
	}

	public long getMedicoId() {
		return _medicoId;
	}

	public void setMedicoId(long medicoId) {
		_medicoId = medicoId;
	}

	public String getEspecialidade() {
		return _especialidade;
	}

	public void setEspecialidade(String especialidade) {
		_especialidade = especialidade;
	}

	public long getTime() {
		return _time;
	}

	public void setTime(long time) {
		_time = time;
	}

	private String _uuid;
	private long _consultaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _pacienteId;
	private long _medicoId;
	private String _especialidade;
	private long _time;
}