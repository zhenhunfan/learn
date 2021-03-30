oauth2学习后的实验代码，学习的是李伟民老师的视频教程

dependencies：统一的依赖管理

resource：资源服务器

server：认证服务器

客户端就自己写吧



学习过程中碰到的问题：

1.当回调url是https，但是实际并不是的时候会报错：

HTTP method names must be tokens



2.application类上的MapperScan注解的正确的命名空间是tk的，而不是mybatis的，否则会找不到实体类对应的表



