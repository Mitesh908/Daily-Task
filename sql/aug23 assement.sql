use aug23;


--TASK 1

 --drop table person;

create table person(   -- To create employee tab;le
creationdate datetime,
serialno int identity(1,1),
name varchar(20),
adhaarno bigint  primary key,
address varchar(20),
accountno bigint not null unique,
bankname varchar(20),
age int ,
phoneno bigint unique);

insert into person values(getdate(),'rohit',66345647556,'hyd',36465366,'sbi',23,5623645778);
insert into person values(getdate(),'rohit',65476778878,'hyd',36374677,'sbi',23,5623464776);
insert into person values(getdate(),'rohit',45676688909,'hyd',36465666,'sbi',23,56236454554);

select * from person;

 create table person_salary(  -- To create the salary table
  creationdate date,
  serialno bigint not null  unique ,
  adhaarno bigint foreign key references person(adhaarno),
  salaryamount money,
  creddate datetime,
  month varchar(20)
  );

 insert into person_salary values('2000-09-7',1,66345647556,10000,getdate(),'aug');  -- TO INSERT THE VALUES
  insert into person_salary values('2000-09-7',2,65476778878,10000,getdate(),'aug'),
  ('2000-09-7',3,45676688909,10000,getdate(),'aug')
 ;

 select  * from person_salary;  -- To get the persons salary

 create table attendance(   -- To create attendance table
 creationdate date,
 serialno int identity(1,1),
 adhaarno bigint foreign key references person(adhaarno),
 day varchar(20),
 date date,
 noofworkinghour bigint,
 login datetime,
 logout datetime
 );

 select * from attendance;
 
 insert into attendance values(getdate(),66345647556,'tue',getdate(),8,SYSDATETIME(),SYSDATETIME());  -- TO INSERT THE VALUES
 insert into attendance values('2002-09-8',65476778878,'mon',getdate(),9,SYSDATETIME(),SYSDATETIME());   --To insert the values
 insert into attendance values('2002-09-8',45676688909,'mon',getdate(),9,SYSDATETIME(),SYSDATETIME());
  

   select * from attendance ;   -- To check the record

   
 create table attendance_record(   --To craete the attendace record table
 creationdate date,
 serialno bigint identity(1,1),
 adhaarno bigint foreign key references person(adhaarno),
 halfdays int,
 leavetaken int,
 leaveleft int,
 leaveapproved int,
 noofhoursworked int,
 totalworkinghours int,
 totalworkingday int,
 nofdaysworked int
 );

 select * from attendance_record;   -- To check the  elemnt inside the table

 insert into attendance_record values('2000-09-8',66345647556,0,0,16,0,64,70,31,5);    -- To insert the values 
 insert into attendance_record values('2000-09-8',65476778878,0,1,15,0,68,70,31,5),
 ('2000-09-8',45676688909,0,0,16,0,66,70,31,5) ;

 select * from attendance_record;   --To get attendance record


 -------------------------------------------------------------------------------------------------

 --TASK 2


 
create table employee(creadtiondate date, serialno int identity(1,1),
empid bigint  ,
empname varchar(50) default 'prolifics',
empdepartment varchar(20),
accountno bigint not null unique,
bankname varchar(20),
age int check( age >=18 and age <=60),
address varchar(50),
primary key(empid,empname)
);

select * from employee;

drop table employee;

insert  into employee(creadtiondate,empid,empname,empdepartment,accountno,bankname,age,address) values('2000-09-9',1001,'raj','it',536456356,'sbi',20,'hyd');
insert  into employee(creadtiondate,empid,empname,empdepartment,accountno,bankname,age,address)
values('2000-09-9',1005,'rohit','it',734767467,'sbi',22,'hyd'),
('2000-09-9',1002,'ramesh','it',574865768,'sbi',24,'hyd'),
('2000-09-9',1003,'ritik','it',374676578,'sbi',26,'hyd'),
('2000-09-9',1004,'raju','it',873456484,'sbi',22,'hyd');

drop table emp_salary;

create table emp_salary(  -- To create the salary table
  creationdate date,
  serialno bigint not null  unique ,
  empid bigint ,
  empname varchar(50),
  salaryamount money,
  creddate datetime,
  month varchar(20),
  constraint employe foreign key(empid,empname) references employee(empid,empname)
  );

  select * from emp_salary;

   insert into emp_salary values('2000-09-7',1,1001,'raj',60000,getdate(),'aug');
  insert into emp_salary values('2000-09-7',2,1005,'rohit',55000,getdate(),'aug'),
  ('2000-09-7',3,1002,'ramesh',50000,getdate(),'aug'),
  ('2000-09-7',4,1003,'ritik',57000,getdate(),'aug');


  
--------------------------------------------------------------------------