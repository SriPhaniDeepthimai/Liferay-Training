create unique index IX_E7296051 on Department_Details (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D30DC314 on Student_Details (Department_Id);
create unique index IX_F25FE9BA on Student_Details (uuid_[$COLUMN_LENGTH:75$], groupId);

create unique index IX_550DD95B on Students_Marks (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B5B3D34D on Teacher_Details (Department_Id);
create unique index IX_647BE0A1 on Teacher_Details (uuid_[$COLUMN_LENGTH:75$], groupId);