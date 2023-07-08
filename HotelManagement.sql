Create database hotelmanagement;
use hotelmanagement;

Create table login ( username VARCHAR(50), password VARCHAR(50));

insert into login values("admin","12345");

insert into login values("Manager","45678");

select * from login;

create table customer	(Name varchar(100),
						Address varchar(500),
                        Adhaar varchar(20),
                        Phone varchar(20),
                        Room_no varchar(10),
                        No_of_people varchar(10),
                        Status varchar(10),
                        cid varchar(100)
                        );
                        
select * from customer;

create table employee	(Name varchar(100),
                        Adhaar varchar(20),
                        Email varchar(1000), 
                        Phone varchar(20),
                        DoB varchar(100),
                        Designation varchar(100),
                        Status varchar(10),
                        eid varchar(100)
                        );
                        
select * from employee;



