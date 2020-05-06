
--Author:Markus Baciu(C18350801)
--Description: technical figures done in this from sets to joins


--displays the student's teacher
create view TeacherStudent as(
select teachername,studentname 
from teacher
join class on(class_classid=classid)
join student using (studentid)
group by teachername);

--displays the subjects taught by the teacher
select teachername,subjectname
from teacher
join subject using(subjectID);
commit;

--displays when the exam will be on
select subjectname,examdate 
from subject
join exam on(exam_examid=examid);

--displays which subject has which class
select subjectName,classID 
from subject
join teacher on(teacher_teacherID=teacherID)
join class using(classID);

--selects the exam for each teacher
select teachername,examid
from teacher
join subject on(subject_subjectid=subjectid)
join exam on(exam_examid=examid);

--displays the unknown classsizes of the student which don't know the size
select studentname,classsize
from student
join class using(classid)
where classsize is null;

--displays the examid and the points and type of question
create view typeofexamquestion as(
select examid,questiontype,questionscore
from exam
join question using(questionno));

--displays the questions which are only mcq
select questiontype from typeofexamquestion
where questiontype like"%mcq%"
minus
select questiontype from typeofexamquestion
where questiontype not like"%mcq";

--shows the subjects taken by the student
select subjectname,studentID
from subject
join teacher using (subjectid)
join class using(classid)
join student using (studentid);
