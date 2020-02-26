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

package com.rayhealthcare.omni.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rayhealthcare.omni.model.Consulta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Consulta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Consulta
 * @generated
 */
@ProviderType
public class ConsultaCacheModel implements CacheModel<Consulta>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConsultaCacheModel)) {
			return false;
		}

		ConsultaCacheModel consultaCacheModel = (ConsultaCacheModel)obj;

		if (consultaId == consultaCacheModel.consultaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, consultaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", consultaId=");
		sb.append(consultaId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", pacienteId=");
		sb.append(pacienteId);
		sb.append(", medicoId=");
		sb.append(medicoId);
		sb.append(", especialidade=");
		sb.append(especialidade);
		sb.append(", time=");
		sb.append(time);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Consulta toEntityModel() {
		ConsultaImpl consultaImpl = new ConsultaImpl();

		if (uuid == null) {
			consultaImpl.setUuid(StringPool.BLANK);
		}
		else {
			consultaImpl.setUuid(uuid);
		}

		consultaImpl.setConsultaId(consultaId);
		consultaImpl.setGroupId(groupId);
		consultaImpl.setCompanyId(companyId);
		consultaImpl.setUserId(userId);

		if (userName == null) {
			consultaImpl.setUserName(StringPool.BLANK);
		}
		else {
			consultaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			consultaImpl.setCreateDate(null);
		}
		else {
			consultaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			consultaImpl.setModifiedDate(null);
		}
		else {
			consultaImpl.setModifiedDate(new Date(modifiedDate));
		}

		consultaImpl.setPacienteId(pacienteId);
		consultaImpl.setMedicoId(medicoId);

		if (especialidade == null) {
			consultaImpl.setEspecialidade(StringPool.BLANK);
		}
		else {
			consultaImpl.setEspecialidade(especialidade);
		}

		consultaImpl.setTime(time);

		consultaImpl.resetOriginalValues();

		return consultaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		consultaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		pacienteId = objectInput.readLong();

		medicoId = objectInput.readLong();
		especialidade = objectInput.readUTF();

		time = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(consultaId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(pacienteId);

		objectOutput.writeLong(medicoId);

		if (especialidade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(especialidade);
		}

		objectOutput.writeLong(time);
	}

	public String uuid;
	public long consultaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long pacienteId;
	public long medicoId;
	public String especialidade;
	public long time;
}