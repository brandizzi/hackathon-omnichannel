create index IX_63A267B4 on FOO_Consulta (pacienteId);
create index IX_8E7D6EC8 on FOO_Consulta (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_64A3074A on FOO_Consulta (uuid_[$COLUMN_LENGTH:75$], groupId);