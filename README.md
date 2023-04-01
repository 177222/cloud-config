### cloud-config 配置中心
1.导入spring-cloud-config-server依赖和spring-cloud-starter-netflix-eureka-client依赖
2.配置yml文件
config:
      server:
        git:
          uri: https://github.com/177222/cloud-config.git  #配置git服务地址
          username: huo #配置git用户名
          password: asasdd #配置git密码
          search-paths:
            - cloud-config  #仓库名
          default-label: master # 使用的默认分支，默认为 master
          clone-on-start: true
3.启动项添加@EnableConfigServer注解
### Springcloud-serverboot 需要访问配置中心的微服务
1.将原本的配置文件改为bootstrap.yml
2.修改配置文件
spring:
  cloud:
    config:
      name: Springcloud-serverboot #微服务名称
      profile: dev #访问的配置项
      label:master: master #访问分支
      uri: http://localhost:9966 #config配置中心的访问路径
