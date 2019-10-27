/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/10/27 16:48:56                          */
/*==============================================================*/


drop table if exists announcement;

drop table if exists bus_detail;

drop table if exists business;

drop table if exists category;

drop table if exists collect;

drop table if exists credits;

drop table if exists favourable;

drop table if exists history;

drop table if exists manager;

drop table if exists orderDetail;

drop table if exists orderForm;

drop table if exists permission;

drop table if exists pro_detail;

drop table if exists product;

drop table if exists repertory;

drop table if exists role;

drop table if exists role_premission;

drop table if exists syslog;

drop table if exists user;

drop table if exists user_role;

/*==============================================================*/
/* Table: announcement                                          */
/*==============================================================*/
create table announcement
(
   annu_ID              int not null,
   annu_data            varchar(100),
   primary key (annu_ID)
);

/*==============================================================*/
/* Table: bus_detail                                            */
/*==============================================================*/
create table bus_detail
(
   bus_detail_ID        int not null,
   identfify_face       varchar(50),
   identfify_back       varchar(50),
   primary key (bus_detail_ID)
);

/*==============================================================*/
/* Table: business                                              */
/*==============================================================*/
create table business
(
   bus_ID               int not null,
   bus_detail_ID        int,
   bus_Name             varchar(20),
   bus_address          varchar(50),
   bus_phone            varchar(20),
   bus_email            varchar(30),
   bus_people           varchar(20),
   primary key (bus_ID)
);

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category
(
   cate_ID              int not null,
   pro_ID               int,
   cate_name            varchar(20),
   primary key (cate_ID)
);

/*==============================================================*/
/* Table: collect                                               */
/*==============================================================*/
create table collect
(
   collectID            int not null,
   userID               int,
   favourite_status     char(1) comment '1表示收藏
            0表示未收藏',
   primary key (collectID)
);

/*==============================================================*/
/* Table: credits                                               */
/*==============================================================*/
create table credits
(
   creditsID            int not null,
   userID               int,
   credits              int,
   primary key (creditsID)
);

/*==============================================================*/
/* Table: favourable                                            */
/*==============================================================*/
create table favourable
(
   fav_ID               int not null,
   pro_ID               int,
   fav_name             varchar(10),
   fav_price            float(2) comment '百分比：原价的多少
            整数：抵消一定金额',
   fav_method           int comment '3：优惠券
            2：津贴
            1：红包
            ',
   primary key (fav_ID)
);

/*==============================================================*/
/* Table: history                                               */
/*==============================================================*/
create table history
(
   historyID            int not null,
   userID               int,
   historyData          varchar(200),
   primary key (historyID)
);

/*==============================================================*/
/* Table: manager                                               */
/*==============================================================*/
create table manager
(
   man_ID               int not null,
   man_username         varchar(25),
   man_name             varchar(200),
   man_password         varchar(30),
   primary key (man_ID)
);

/*==============================================================*/
/* Table: orderDetail                                           */
/*==============================================================*/
create table orderDetail
(
   order_detail_ID      int not null,
   userID               int,
   pro_ID               int,
   bus_ID               int,
   buy_num              int,
   primary key (order_detail_ID)
);

/*==============================================================*/
/* Table: orderForm                                             */
/*==============================================================*/
create table orderForm
(
   orderID              int not null,
   order_detail_ID      int,
   money                float(2),
   createTime           datetime,
   payTime              datetime,
   orderStatus          char(1) comment '3表示已收货
            2表示已发货
            1表示成功
            0表示未付款
            -1表示失败
            -2表示已退货
            ',
   primary key (orderID)
);

/*==============================================================*/
/* Table: permission                                            */
/*==============================================================*/
create table permission
(
   permissionID         int not null,
   permissionName       varchar(50),
   permissionUrl        varchar(200),
   primary key (permissionID)
);

/*==============================================================*/
/* Table: pro_detail                                            */
/*==============================================================*/
create table pro_detail
(
   detail_ID            int not null comment '折扣详情，针对什么商品，达到什么要求，折扣多少',
   pro_ID               int,
   detail_data          varchar(100),
   detail_class         char(1),
   primary key (detail_ID)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   pro_ID               int not null,
   pro_name             varchar(50),
   pro_img              varchar(100),
   pro_price            float(2),
   pro_Info             varchar(200),
   pro_explain          varchar(100),
   pro_status           char(1) comment '2在售
            1待售
            0预购
            -1缺货
            -2下架',
   primary key (pro_ID)
);

/*==============================================================*/
/* Table: repertory                                             */
/*==============================================================*/
create table repertory
(
   repe_ID              int not null,
   pro_ID               int,
   repe_num             int,
   primary key (repe_ID)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   roleID               varchar(50) not null,
   roleName             varchar(20),
   roleDescribe         varchar(50),
   primary key (roleID)
);

/*==============================================================*/
/* Table: role_premission                                       */
/*==============================================================*/
create table role_premission
(
   role_preID           int not null,
   roleID               varchar(50),
   permissionID         int,
   primary key (role_preID)
);

/*==============================================================*/
/* Table: syslog                                                */
/*==============================================================*/
create table syslog
(
   logID                int not null,
   username             varchar(30),
   visitTime            datetime,
   ip                   varchar(50),
   url                  varchar(200),
   excutionTime         timestamp,
   method               varchar(100),
   primary key (logID)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   userID               int not null,
   username             varchar(30),
   password             varchar(30),
   sex                  char(1),
   birthday             date,
   telephone            varchar(18),
   email                varchar(35),
   status               char(1),
   code                 varchar(100),
   primary key (userID)
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_roleID          int not null,
   userID               int,
   roleID               varchar(50),
   primary key (user_roleID)
);

alter table business add constraint FK_Relationship_12 foreign key (bus_detail_ID)
      references bus_detail (bus_detail_ID) on delete restrict on update restrict;

alter table category add constraint FK_Relationship_9 foreign key (pro_ID)
      references product (pro_ID) on delete restrict on update restrict;

alter table collect add constraint FK_Relationship_3 foreign key (userID)
      references user (userID) on delete restrict on update restrict;

alter table credits add constraint FK_Relationship_1 foreign key (userID)
      references user (userID) on delete restrict on update restrict;

alter table favourable add constraint FK_Relationship_8 foreign key (pro_ID)
      references product (pro_ID) on delete restrict on update restrict;

alter table history add constraint FK_Relationship_2 foreign key (userID)
      references user (userID) on delete restrict on update restrict;

alter table orderDetail add constraint FK_Relationship_4 foreign key (userID)
      references user (userID) on delete restrict on update restrict;

alter table orderDetail add constraint FK_Relationship_5 foreign key (bus_ID)
      references business (bus_ID) on delete restrict on update restrict;

alter table orderDetail add constraint FK_Relationship_7 foreign key (pro_ID)
      references product (pro_ID) on delete restrict on update restrict;

alter table orderForm add constraint FK_Relationship_6 foreign key (order_detail_ID)
      references orderDetail (order_detail_ID) on delete restrict on update restrict;

alter table pro_detail add constraint FK_Relationship_11 foreign key (pro_ID)
      references product (pro_ID) on delete restrict on update restrict;

alter table repertory add constraint FK_Relationship_10 foreign key (pro_ID)
      references product (pro_ID) on delete restrict on update restrict;

alter table role_premission add constraint FK_Relationship_13 foreign key (roleID)
      references role (roleID) on delete restrict on update restrict;

alter table role_premission add constraint FK_Relationship_14 foreign key (permissionID)
      references permission (permissionID) on delete restrict on update restrict;

alter table user_role add constraint FK_Relationship_15 foreign key (roleID)
      references role (roleID) on delete restrict on update restrict;

alter table user_role add constraint FK_Relationship_16 foreign key (userID)
      references user (userID) on delete restrict on update restrict;

