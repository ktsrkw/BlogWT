## 使用到的技术
springboot/mybatis/thymeleaf/mysql

## 数据库
### 建表SQL语句
```sql
-- 创建项目数据库
create database `simpleblogofwt`;
use `simpleblogofwt`;

-- 建博客表
create table `blog`(
    `id` int unsigned auto_increment,
    `content` varchar(15000),
    `time` datetime,
    `category` varchar(20),
    primary key(`id`)
)engine=InnoDB default charset=utf8mb4;
```
