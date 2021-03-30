# node-demo

​		node的demo项目，主要是做api接口演示。

​		主体框架使用express，数据库使用mongodb。

### 数据库

使用docker安装mongodb，docker-compose.yml文件如下：

```yml
version: '3.1'
services:
  mongo:
    image: mongo:4.1.6
    ports:
      - 27017:27017
    restart: always
    environment:
      MONGO_INITDB_ROOT_USERNAME: admin
      MONGO_INITDB_ROOT_PASSWORD: admin
    volumes:
      - ./data/db:/data/db
```

### 程序代码

使用到的第三方模块有：

- mongoose 用于连接数据库

- express 用于web框架

- nodemon 用于热部署

- apidoc 用于生成接口文档

- nodemailer 用于发送邮件

- body-parser 用于解析请求体

- cors 用于解决跨域，其实可以不用这个，用ng解决跨域也是可以的

- multer 用于上传文件

- request 用于模拟发送请求

  

### 快速开始

1.新建目录

根目录新建static/img文件夹

2.生成api文档

接口文档生成命令：

```
//先cd到根目录
apidoc -i ./src/router/ -o apidoc/
```

3.安装依赖

```
npm i
```

4.启动

```
npm run start
```

