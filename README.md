# Personal-Blog
  自己在入门springboot后，制作的一个个人博客网站，用到的技术主要为SpringBoot+Mybatis+Themeleaf+Durid+Layui+Swagger，还要学好多好多，继续加油！


## 讲一讲该个人博客该如何部署
  该网站使用的技术栈并不是很多，而且技术都是比较基础的，所以部署起来特别方便，可轻松部署成功，查看效果。
  废话不多说，请看下面的步骤：
  
    1. clone该文件后，第一请先看数据库详情文件，这里写的是一些数据库表的创建和t_user表定义的一个管理员，方便进入后台其用户名是：admin ，密码为：123456。
   
    2.建立好数据库后，接下来就找到application-dev.yml,这是生产环境的配置，所以你们可以用它来修改相关配置信息。
   Ps：特别说明一下，作者用的是数据库8.0.19，而且用的也是java11，所以版本可能会和大多数人不一样，当然在java8中不知道能不能稳定运行，
   这个我也没有测试过，感觉应该可以吧，在如果数据库版本太低的童鞋请将 driver-class-name: 属性后面的参数改为 com.mysql.jdbc.Driver，
   由于作者用的数据库版本比较高，所以这个参数名不一样。
   
     3.接下来就是改一下root 和 password 就可以了！
   
     4.运行成功！耶！
   
   ## 觉得不错的同学麻烦给个star吧？
   给个效果图看看？
   
   效果图文件可以去查看效果哦！
   
   