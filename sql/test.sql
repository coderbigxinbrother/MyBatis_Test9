create table province(
    pid number primary key,
    pname varchar2(50)
)
create table city(
    cid number primary key,
    cname varchar2(50),
    pid number
)
create sequence seq_province;
create sequence seq_city;

alter table city add constraint fk_city_province_pid foreign key(pid) references province(pid);


insert into province values(seq_province.nextval,'湖南');
insert into province values(seq_province.nextval,'山东');

insert into city values(seq_city.nextval,'长沙','2');
insert into city values(seq_city.nextval,'衡阳','2');
insert into city values(seq_city.nextval,'株洲','2');
insert into city values(seq_city.nextval,'济南','3');
insert into city values(seq_city.nextval,'东营','3');

commit;
