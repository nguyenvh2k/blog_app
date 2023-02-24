
use servletv23;

-- role de phan quyen cho user
create table role(
                     id bigint not null primary key auto_increment,
                     name varchar(150) not null,
                     code varchar(150) not null,
                     createdate timestamp null,
                     modifieddate timestamp null,
                     createdby varchar(255) null,
                     modifiedby varchar(255) null
);

-- bang user
create table user(
                     id bigint not null primary key auto_increment,
                     name varchar(150) not null,
                     password varchar(150) not null,
                     fullname varchar(150) not null,
                     status int not null,
                     roleid bigint not null,
                     createddate timestamp null,
                     modifieddate timestamp null,
                     createdby varchar(255) null,
                     modifiedby varchar(255) null
);

drop table user;
-- khoa ngoai cho bang user
alter table user add constraint fk_user_role foreign key(roleid) references role(id);


create table news(
                     id bigint not null primary key auto_increment,
                     title varchar(255) null,
                     thumbnail varchar(150) null,-- chua ten hinh
                     shortdescription text null, -- mo ta ngan noi dung bai viet
                     content text null,
                     categoryid bigint not null,
                     createddate timestamp null,
                     modifieddate timestamp null,
                     createdby varchar(255) null,
                     modifiedby varchar(255) null
);

create table category(
                         id bigint not null primary key auto_increment,
                         name varchar(150) not null,
                         code varchar(150) not null,
                         createddate timestamp null,
                         modifieddate timestamp null,
                         createdby varchar(255) null,
                         modifiedby varchar(255) null
);

alter table news add constraint fk_news_category foreign key(categoryid) references category(id);

create table comment(
                        id bigint not null primary key auto_increment,
                        content text not null,
                        user_id bigint not null,
                        new_id bigint not null,
                        createddate timestamp null,
                        modifieddate timestamp null,
                        createdby varchar(255) null,
                        modifiedby varchar(255) null
);

alter table comment add constraint fk_comment_user foreign key(user_id) references user(id);
alter table comment add constraint fk_comment_news foreign key(new_id) references news(id);
