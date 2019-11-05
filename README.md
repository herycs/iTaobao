# SSM

## 简介

> 基本仅框架及少量测试代码，不含复杂业务逻辑


## 用途
> 仅为ssm框架的一个整合，其中包含少量测试代码及两个验证码（validateCode由于配色原因展示不好，已注释）


## 其它相关数据及信息

### sql
    ``` 
      数据库表字段 tab_filed: 见itaobao.sql文件
    ```

### 相关信息：

> 其它文件及版本见：pro.xml文件

  数据库：mysql 8.0.15

  连接池：druid 1.1.11

  项目管理工具：maven 3.0.2

  整合框架：
          Mybatis
          Spring MVC
          Spring
            
## 关于款架使用

  > 可直接导入

  - 需修改的部分，db.properties
    ```
        driver=com.mysql.cj.jdbc.Driver

        url=jdbc:mysql:///itaobao?serverTimezone=PRC

        IUser=root

        password=123456
    ```
  - 关于验证码
  > 框架中使用的是validateCode,jar包在WEB-INF/lib下,本地测试可以直接使用maven命令导入maven仓库
  > 框架中包含了一个Maven仓库中的验证码配置
    - 其servlet配置在web.xml中（已注释），可启用，具体调用请自行查阅资料

​    

- 已配置spring security框架