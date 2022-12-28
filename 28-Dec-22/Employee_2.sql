USE suchidb;
create table Employee_2( id int primary key,
E_id int(6),
E_Name varchar(20),
E_Addr varchar(20),
E_salary double,
E_contact bigint(6),
dept_id int,foreign key(dept_id) References Dept(dept_id));

insert into Employee_2 values
(081,'Vikram','12000','9878761212','Ad1',2),
(110,'Ajay','18000','9654376143','Ad2',1),
(098,'Rajesh','11000','9965322212','Ad3',4),
(067,'Ram','19000','8078343732','Ad4',3),
(045,'Vimal','27000','9932113221','Ad5',4),
(987,'Kiran','21000','7076337238','Ad6',2);

select*from Employee_2 where salary between 1000 and 1000000;

create table Dept(id int key,
D_id int(6),D_name varchar(20), d_head varchar(15),D_desc varchar(20));
insert into fees values
(1,'Accounts','Ramesh','Accounts Dept'),
(2,'Admin','Vijay','Admin Dept'),
(3,'Sales','Vinod','Sales Dept'),
(4,'HR','Mahesh','HR Dept');






