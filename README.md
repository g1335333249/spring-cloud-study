# 文档
### 一、准备工作
- 1.nacos安装
   - 1.[官网](https://nacos.io/zh-cn/docs/quick-start-docker.html)
   - 2.获取docker脚本
      - `git clone https://github.com/nacos-group/nacos-docker.git`
   - 3.启动单机模式
      - `docker-compose -f example/standalone-derby.yaml up`
   - 4.访问控制台[http://127.0.0.1:8848](http://127.0.0.1:8848)
- 2.安装redis
   - 1.拉取docker最新版镜像
      - `docker pull redis`
   - 2.启动镜像（本文演示就不创建配置文件了，生产环境建议新建配置文件挂载到容器里面）
      - `docker run -p 6379:6379 --name redis -d redis redis-server --appendonly yes`
- 3.安装seata（分布式事务）
   - 1.[官网](https://seata.io/zh-cn/)
   - 2.获取docker脚本
     - `git clone https://github.com/seata/seata-docker.git`
   - 3.构建
     - ```
       cd seata-docker
       docker build -t seata:0.5.1 build
       ```
   - 3.启动体验版
     - `docker-compose -f example/standalone-derby.yaml up`
   - 4.访问控制台[http://127.0.0.1:8848](http://127.0.0.1:8848)
- 4.安装mysql
---
 |服务|端口|网关|
 | --------    | ----------------- | ----  |
 | 网关 spring-cloud-study-gateway|   5000  |/|
 | 权限 spring-cloud-study-auth   |   5001  |/auth|
 | 资源服务 spring-cloud-study-resource-server   |   5002  |/resource|
 | 资源服务 spring-cloud-study-resource-server-feign   |   5003  |/resource-feign|