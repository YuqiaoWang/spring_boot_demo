
## springboot 入门例子
### 1. 说明
### 2. 工程结构说明
#### 2.1 java
1. controller
    - @RestController 注解表明返回的数据格式是json
    - @RequestMapping 定义路由
2. dao
    - @Configuration 这个配置是写入spring Ioc 容器的
    - @MapperScan 配置mapper扫描路径
    - @Value 从application.properties里读出定义好的变量
#### 2.2 resources
1. static
2. templates
3. application.properties
    - 存放配置属性
        - server.port 端口
        - server.context-path 加入前缀
    - 程序中所用常量的信息
#### 2.3 webapp