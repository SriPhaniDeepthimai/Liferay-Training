create table Entity1_Entity1 (
	uuid_ VARCHAR(75) null,
	Student_Id LONG not null primary key,
	Student_Name VARCHAR(75) null,
	Maths_Marks INTEGER
);

create table Entity1_Entity2 (
	uuid_ VARCHAR(75) null,
	StudentId INTEGER not null primary key,
	Student_Name VARCHAR(75) null
);

create table Entity1_Entity3 (
	uuid_ VARCHAR(75) null,
	Teacher_Id INTEGER not null primary key,
	Teacher_Name VARCHAR(75) null
);

create table Entity1_Entity4 (
	uuid_ VARCHAR(75) null,
	Department_Id INTEGER not null primary key,
	Department_Name VARCHAR(75) null
);