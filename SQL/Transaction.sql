--Author:Markus Baciu(C18350801)
--Description: 3 Transactions done. 1 Insert and 2 updates

--transaction 1

insert into student values(13456,'34 Dundalk street drogheda','BarryJohns',56378);
commit;

--transaction 2
update teacher
set teachername = 'Mr.Lions'
where teachername like '%Mr.Lancaster%';
commit;

--transaction 3
insert into subject values('eng02','English2',54321);
insert into teacher values(99809,'Ms.Chester','eng02',56378);

commit;

update teacher
set class_classid = 57643
where teachername like '%Ms.Chester%';

commit;
