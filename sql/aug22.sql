use aug22;

create table emp(           -- To create table
empid int identity(101,1) primary key,  -- To use autoincreement in id
empname varchar(20));

insert into emp(empname) values('mohit');  -- To insert the values

select * from emp;    -- To check the data

----------------------------------------------------------------------------------------
create table emp2(date date,lofin datetime,logout smalldatetime,rowversion timestamp);  --To create employee table

select * from emp2;

insert into emp2(date,lofin,logout) values(GETDATE(),GETDATE(),getdate()); -- To check dat5e and the datetime and  smalldatetime

update emp2             -- To check the timestamp
set lofin = '2023-07-22 11:23:32:110'
where date = '2023-07-22';

drop table emp2;

------------------------------------------------------------------------------------------

create table emp3(    -- To create table with datetime, datetimeoffset,timestamp,smalldatetime and date
serialno bigint ,
empid bigint primary key ,
date date,
login datetime,
logout smalldatetime,
credtime datetimeoffset,
rowversion timestamp
);

insert into emp3(serialno,empid,date,login,credtime) values(102,1002,GETDATE(),GETDATE(),GETDATE());
insert into emp3(empid,credtime) values(101,'2023-8-27 15:00:00 -07:00');  -- To insert different timezone

update emp3 set serialno=3 where empid=101; -- To make chnage in data to check timestamp

select * from emp3;   -- QUERY FROM RECORDS

drop table emp3;

------------------------------------------------------------------------------------------------------------

create table emp4(                 --To create employee table 
id int identity(1,1) primary key,
name varchar(100),
age int);

insert into emp4 values('swati',22);

select * from emp4;

select age from emp4 where id=2 or id=5;    -- To  use where condition and using  operator


-----------------------------------------------------------------------------------------------------------

create table emp5(   --- To create employee table
creationdate date,
id int identity(1,1) primary key,
name varchar(100),
salary bigint);

insert into emp5 values(getdate(),'sita',15000);

select * from emp5;

select salary from emp5 where  id=2 or id=3;   -- To use where and or operator

select salary from emp5 where  id=2 and id=3;-- To use where and  &operator

--------------------------------------------------------------------------------------

 drop table emp7;
create table emp7(   -- To create employee tab;le
creationdate datetime,
serialno int not null unique,
empname varchar(20),
empid bigint identity(101,1) primary key,
empdepartment varchar(20),
accountno bigint not null unique,
bankname varchar(20),
age int check( age >=18 and age <=60),
address varchar(50));



select * from emp7;

drop table attendance1;
create table attendance1(   -- To create attendance table
 creationdate date,
 serialno int not null unique,
 empid bigint foreign key references emp7(empid),
 day varchar(20),
 date date,
 noofworkinghour bigint,
 login datetime,
 logout datetime
 );

  select *  from attendance;  ---To check the data 

   drop table attendance_record1;

   create table attendance_record1(   --To craete the attendace record table
 creationdate date,
 serialno bigint not null unique,
 empid bigint foreign key references emp7(empid),
 halfdays int,
 leavetaken int,
 leaveleft int,
 leaveapproved int,
 noofhoursworked int,
 totalworkinghours int,
 totalworkingday int,
 nofdaysworked int
 );

 select * from attendance_record1;

 drop table emp_salary1;
 create table emp_salary1(  -- To create the salary table
  creationdate date,
  serialno bigint not null  unique ,
  empid bigint foreign key references emp7(empid),
  salaryamount money check(salaryamount>=50000)
  default 700000,
  creddate datetime,
  month varchar(20)
  );

  select * from emp_salary;


  ----------------------------------------------------------------------------------------
  --ORDER BY


  drop table emp8;                   -- To check order by

  create table emp8(          -- To create employee table
  creationdate date,
  serialno int identity(1,1),
  empname varchar(20),
  empid int,
  empsalary bigint);

  insert into emp8(creationdate,empname,empid,empsalary) values(getdate(),'ronit',101,15000);   -- T	o insert thye values in the table

  select * from emp8 order by empsalary asc;   -- To check data in ascending order

  select * from emp8 order by empsalary desc;   -- To check data in descneidng order


----------------------------------------------------------------------------------------------

create table emp9(  -- To create emploee table
id int identity(1,1) primary key,
name  varchar(200),
age int not null);

insert into emp9(age) values(24); -- To insert the value

insert into emp9(name,age) values('bhaskar',23); -- To insert the value

select * from emp9; -- To check the data inside the table

select * from emp9 where name is not null or id=1;       -- To get only values where name is not null

select * from emp9 where name is null and id=1;                   -- To get only values where name is  null

select * from emp9 where name is not null and not id=8;                 -- To use not operator


----------------------------------------------------------------------------------------

  create table authors(   -- To create author table
   creationdate date,
  serialno int not null identity(1,1),
  authorid int primary key,
  firstname varchar(50),
  lastname varchar(50),
  bookid int foreign key(authorid) references Books(bookid)
  );

  select * from authors;

  insert into authors  values(getdate(),2001,'dinesh','lal',301);   -- To insert the values
 

  drop table  authors;


create table Books(    -- TO CREATE BOOK TABLE
creationdate date,
serialno int not null identity(1,1),
bookid int primary key,
authorid int ,
publisher int ,
title VARCHAR(20),
ISBN int,
genre varchar(50),
type varchar(20),
publication_year date,
price money,
condition varchar(20),
foreign key(bookid) references orderitems(orderid)
);

select * from Books;   -- To check the records inside the table

--To insert the values 
insert into Books values(getdate(),301,2001,5001,'jungle book',101,'comic','comic',getdate(),500,'new');


drop table Books;

create table publishers (      -- To create publishers table
   creationdate date,
  serialno int not null identity(1,1),
  publisherid int primary key ,
  country varchar(20),
  foreign key(publisherid) references Books(bookid)
  );   -- Primary key

  select * from publishers;

  insert into publishers values(getdate(),5001,'india',301),
  (getdate(),5002,'india',302);
  

  drop table publishers;

  create table inventory(   -- To create invnetory table
  creationdate date,
  serialno int not null identity(1,1),
  bookid int foreign key references Books(bookid),
  stocklevelused bigint ,
  stocklevelnew bigint 
  );

  select * from inventory;   -- To check the data inside it

  insert into inventory values(getdate(),301,200,600);
  
  drop table inventory;  --  To drop table inventory

  
  create table customers(  -- To make cutsomers table
  creationdate date,
  serialno int  identity(1,1),
  customerid int primary key,
  firstname varchar(20),
  lastname varchar(20),
  streetname varchar(100),
  postalcode int,
  province varchar(100),
  Country  varchar(20),
  phonenumber bigint unique
  );

  -- To insert the cutomers data
  insert into customers values(GETDATE(),0001,'ramwsh','shrama','hyd',480106,'hyd','india',5254345566);
   insert into customers values(GETDATE(),0002,'rohit','shrama','hyd',480106,'hyd','india',5252433355);
    insert into customers values(GETDATE(),0003,'dinesh','shrama','hyd',480106,'hyd','india',525344665);

  select * from customers;   -- To check the records

  drop table customers;   -- To drop the table


  select * from Books where bookid=301 and authorid=2001;  -- To get data  using bookid and authorid

  select * from publishers where bookid=301 and publisherid=5001;    -- To get data  using bookid and publisherid




  create table orders(           -- To create orders table
  creationdate date,
  serialno int not null identity(1,1),
  orderid int PRIMARY  KEY,
  customerid int, 
  orderdate date,
  subtotal money,
  tax money,
  noofbooks int,
  shipping varchar(200),
  total money,
  Foreign key (orderId) references  customers(customerid));

  select * from orders;
  
  insert into orders values(getdate(),1001,0001,getdate(),500,200 ,'madhapur hyderbad',700);
  insert into orders values(getdate(),1002,0002,getdate(),600,200 ,'madhapur hyderbad',800);
  insert into orders values(getdate(),1002,0003,getdate(),600,200 ,'madhapur hyderbad',800);

  drop table orders   -- drop table orders



  create table orderitems(  -- nTo create order items table
  creationdate date,
  serialno int not null identity(1,1),
  orderid int primary key,
  cutsomerid varchar(20),
  bookid int ,
  quantity float,
  price money,
  foreign key(orderid) references orders(orderid)
  );

  insert into orderitems values(getdate(),1001,301,400,500);
  
   select * from orderitems;  -- to checkk the data inside it

   drop table orderitems;   -- TO DROP THE TABLE


  create table  items(  -- Items table
  creationdate date,
  serialno int identity(1,1),
  itemname varchar(50),
  itemtype varchar(50),
  customerid int foreign  key references customers(customerid),
  orderdate date,
  );

  insert into items values(getdate(),'jungle book','book',0001,getdate());   --To insert the value
    insert into items values(getdate(),'cello','pen',0002,getdate());

  select * from items;   -- To check the data



