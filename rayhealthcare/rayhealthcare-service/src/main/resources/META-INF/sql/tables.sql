create table FOO_Consulta (
	uuid_ VARCHAR(75) null,
	consultaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	pacienteId LONG,
	medicoId LONG,
	especialidade VARCHAR(75) null,
	time_ LONG
);