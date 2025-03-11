create table Department_Details (
	uuid_ VARCHAR(75) null,
	Department_Id INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Department_Name VARCHAR(250) null
);

create table Student_Details (
	uuid_ VARCHAR(75) null,
	Student_Id INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Student_Name VARCHAR(75) null,
	Department_Id INTEGER
);

create table Students_Marks (
	uuid_ VARCHAR(75) null,
	Student_Id INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Student_Marks VARCHAR(75) null
);

create table Teacher_Details (
	uuid_ VARCHAR(75) null,
	Teacher_Id INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Teacher_Name VARCHAR(75) null,
	Department_Id INTEGER
);