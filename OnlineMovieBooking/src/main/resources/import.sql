insert into MOVIE_user(user_id,name,username,userpassword,isadmin,dateof_birth,contact) values(1001,'Javvadi Sai Krishna','KRISHNA','krishna',1,To_Date('1998/07/21','yyyy/mm/dd'),7889290843);
insert into MOVIE_user(user_id,name,username,userpassword,isadmin,dateof_birth,contact) values(2000,'Chityala Hemanth Reddy','HEMANTH','hemanth',0,To_Date('1998/09/12','yyyy/mm/dd'),9515958234);
select * from MOVIE_user;

insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1001,'Bahubali','Prabhas','Anushka','Telugu','S S Rajamouli','Periodic',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1002,'War','Hrithik Roshan','Vani Kapoor','Hindi','Karan','Action',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1003,'KGF','Yash','Rashmi Desai','Kannada','Prashanth Neol','Action',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1004,'World Famous Lover','Vijay Devarakoda','Rashi Kanna','Telugu','Karthikeya','Romantic',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1005,'Hit','Viswak Sen','Pooja','Telugu','Sudheer','Thriller',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1006,'Bahubali 2','Prabhas','Anushka','Telugu','S S Rajamouli','Periodic',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1007,'Avengers EndGame','Robert Downey','Anne Baker','English','Russou Brothers','SciFi',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1008,'KGF 2','Yash','Rashmi Desai','Kannada','Prashanth Neol','Action',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1009,'Wonder Woman','Gal Gadot','Chris Pine','English','Dc World','SciFi',1);
insert into MOVIE_MOVIE(movie_Id,movie_Name,hero,heroine,language,director,genre,active_status) values(1010,'Majili','Nani','Surabhi','Telugu','Venky K','Romantic',1);

select * from MOVIE_MOVIE;

Insert into MOVIE_THEATER(theater_Id,theater_Name,theater_City,manager_Name,manager_Contact,movie_Id) values(1, 'a','jalandhar','ram',9875,1001);
Insert into MOVIE_THEATER(theater_Id,theater_Name,theater_City,manager_Name,manager_Contact,movie_Id) values(2, 'b','jalandhar','sam',7896,1001);
Insert into MOVIE_THEATER(theater_Id,theater_Name,theater_City,manager_Name,manager_Contact,movie_Id) values(3, 'c','phagwara','shyam',7568,1002);
Insert into MOVIE_THEATER(theater_Id,theater_Name,theater_City,manager_Name,manager_Contact,movie_Id) values(4, 'd','phagwara','singh',8974,1003);
Insert into MOVIE_THEATER(theater_Id,theater_Name,theater_City,manager_Name,manager_Contact,movie_Id) values(5, 'e','amritsar','harpal',6548,1003);
select * from MOVIE_THEATER;

insert into MOVIE_SHOW(show_Id,show_Name,seats,screen_name,show_Start_Time,show_End_Time,theater_Id) values(1001,'morningshow',100,'dolby',TO_DATE('2020/05/03 09:30:00', 'yyyy/mm/dd hh24:mi:ss'),TO_DATE('2020/05/03 12:30:00', 'yyyy/mm/dd hh24:mi:ss'),1);
insert into MOVIE_SHOW(show_Id,show_Name,seats,screen_name,show_Start_Time,show_End_Time,theater_Id) values(1002,'morningshow',100,'dolby',TO_DATE('2020/05/03 09:30:00', 'yyyy/mm/dd hh24:mi:ss'),TO_DATE('2020/05/03 12:30:00', 'yyyy/mm/dd hh24:mi:ss'),2);
select * from MOVIE_SHOW;

INSERT INTO MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1025,200,'Available',1001);
INSERT INTO MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1024,200,'Available',1001);
INSERT INTO MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1021,250,'Available',1001);
INSERT INTO MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1022,260,'Available',1002);
INSERT INTO MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1023,270,'Available',1002);
select * from MOVIE_SEAT;