--Author:Markus Baciu(C18350801)
--Description: access given to 3 tables to EOPPONG

grant select,insert on subject to eoppong;
grant select on question to eoppong;
grant select,insert,update on teacher to eoppong;