
--Author:Markus Baciu(C18350801)
--Description: Inserts for all tables with weak entries entered as well

describe class;

insert into class values(56747,30);
insert into class values(57890,25);
insert into class(classid) values(57643);
insert into class(classid) values(56378);

describe student;
insert into student values('c1745','12 dublin street dublin','ShaneBurke',56747);
insert into student(studentid,studentname,class_classid) values('c6574','LukasMind',57643);
insert into student values('c3654','13 wexford street', 'SultanSine',56378);
insert into student values('d1812','27 trinity road','MatthewEnd',57890);

describe question;

insert into question values(01,'MCQ','d',5);
insert into question values(02,'short text','the answer',10);
insert into question values(03,'short text','answer 2',5);
insert into question values(04,'short text','answer 3',10);
insert into question values(05,'mcq','a',5);

describe exam;

insert into exam values(54321,'winter',sysdate,1200,0200,'t','f','f',01);
insert into exam (examid,examsession,examdate,starttime,examduration,compulsory,question_questionno) values(56475,'summer',sysdate - 10,1300,0130,'f',05);
insert into exam (examid,examsession,examdate,starttime,examduration,compulsory,question_questionno) values(76785,'summer',sysdate,1400,0200,'f',04);

describe subject;
insert into subject values('geo01','geography',56475);
insert into subject values('his01','history',54321);
insert into subject values('mat01','maths',76785);

describe teacher;
insert into teacher values(67586,'Mr.Lancaster','geo01',57643);
insert into teacher values(57486,'Ms.Reilly','geo01',56378);
insert into teacher values(56585,'Mr.Bean','mat01',57890);

commit;
