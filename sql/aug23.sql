use aug23;  -- To use database

drop table emp;

create table emp(   -- To create the emmployee table
crationdate date,
serialno int identity(1,1),
empid int primary   key,
empname varchar(20),
age int,
salary money);

insert into emp values(getdate(),101,'abhi',20,34000);  --To insert the data

update emp set empname ='raj' where empid=101;   -- To Updatae the singlme column

update emp set empname ='raj', age =23 where empid=101;   -- To Updatae the multiple column


select * from emp;                     --To see the records

delete from emp where empid=102;       -- To deletre date from single row

delete from emp;                        -- To delete the entire data

select top 3 * from emp;                -- To get top3 records

select top 50 percent * from emp;       --To get top 50 % records

select top 50 percent * from emp where empname= 'nitesh';   -- To get only 50% record whose nqame is nitesh

truncate table emp;

alter table emp                         --To alter the table empname from varchar to text
alter column empname text; 

insert into emp values(getdate(),110,'nitesh',20);

select top 3 * from emp; -- To select top3 records


--To USE LIKE
select top 50 percent * from emp where empname like 'nitesh';  -- To get name in text datatype  and get thye data 

select * from emp where empname like 'nitesh%';                -- To get similar name records



select * from emp where empname like 'n%';                    --TO SHOW ALL THE NAME WHICH STARTS FROM N     

select * from emp where empname like 'H%';                    --TO SHOW ALL THE NAME WHICH ENDS WITH H

select * from emp where empname like '%i%';                   --TO  FIND ANY VALUE THAT HAVE "i " In any  position



select * from emp where empname like 'N%H';     --TO  show all the names which start from n and end in h             

--TO  show all the names which has second postion i
select * from emp where empname like '_i%';  

--TO  show all the names which does not strat from n
select * from emp where empname Not like 'N%';  


--  select * from emp  with(3) where empname like '%n';

select * from emp order by empid offset 2 rows fetch next 1 row only;  -- To get the data of middle or 3 rd row by ignoring top 3 row

select count(empid) from emp;  ---To coun the records in the table

select sum(salary)  from emp ;  -- To sum the salary of all the employee

select avg(salary) from emp ;   -- To get the average of the net salary

select * from emp where empid =1 or empid =2;  -- To search the small records

select * from emp where empid in(1,2);  --	 TO USE IN OPERATOR

select * from emp where empid not in(1,2);  --To get all the records except the id 1 & 2

select * from emp where salary between 40000 and 60000; -- To get the salary in the specific range &  BETWEEN OPERATOR

select * from emp where salary not between 40000  and 60000;   -- To get the salary is not between some range

 
-------------------------------------------------------------------------------------------

create table book(   -- To create the book table
craetiondate date,
serialno int identity(1,1),
bookid int primary key ,
bookname varchar(20),
booktype varchar(20));

insert into book values(getdate(),101,'junglebook','book');  --To insert the data
insert into book values(getdate(),102,'manga','comic');

select * from book;

update book set bookname='spiderman' where bookid=101;  -- To update the single column

update book set bookname='doremon' ,booktype='adventure' where bookid=101; -- To update the multiple column

delete from book where bookid=101; -- To delete specific book

delete from book;   -- To delete entire data

insert into book values(getdate(),105,'harrypotter','comic');

select top 3 * from book;  --To get top 3 books

select top 50 percent* from book;  --To get top 50 percent books

select top 50 percent * from book where booktype='comic'; -- To get top 50%  book where booktype is comic 
-------------------------------------------------------------------------------------------------


--TO USE UNION  

create table batch1(
caretiondate date,
id int identity(1,1) primary key,
name varchar(20),
age int);

insert into batch1 values(getdate(),'raju',20),(getdate(),'mukesh',20),(getdate(),'rohit',23);


create table batch2(   -- TO create the batch 2 table
caretiondate date,
id int identity(1,1) primary key,
name varchar(20),
age int);

 
insert into batch2 values(getdate(),'riya',20),(getdate(),'astha ',20),(getdate(),'bahvna',23);   -- To insert the data 

select * from batch1 union select * from batch2;  -- To get the data of both  the table with using UNION

select * from batch1 where  age =20 union select * from batch2 where age=20;     -- To get the data of both  the table with using UNION where age is 20

select * from batch1 union all select * from batch2;   --  To get the data in order in sqeunce one by one from both table


select  * from  batch1  union all select * from batch2;

------------------------------------------------------------------------------------------------------------------------

drop table batch1;  -- To drop the table

drop table batch2; 

create table batch1(
caretiondate date,
id int identity(1,1) primary key,
name varchar(20),
age int,
trainername varchar(20));

insert into batch1 values(getdate(),'raju',20,'nitesh'),(getdate(),'mukesh',20,'nitesh'),(getdate(),'rohit',23,'nitesh');


create table batch2(   -- TO create the batch 2 table
caretiondate date,
id int identity(1,1) primary key,
name varchar(20),
age int,
trainername varchar(20));   

 
insert into batch2(caretiondate,name,age,trainername) values(getdate(),'riya',20,''),(getdate(),'astha ',20,''),(getdate(),'bahvna',23,'');   -- To insert the data 

select * from batch1 union all select * from batch2; -- To get the data from both the table

