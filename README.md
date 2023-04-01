### cloud-config 配置中心
1.导入spring-cloud-config-server依赖和spring-cloud-starter-netflix-eureka-client依赖<br>
2.配置yml文件<br>
config:<br>
   server:<br>
        git:<br>
          uri: https://github.com/177222/cloud-config.git  #配置git服务地址<br>
          username: huo #配置git用户名<br>
          password: asasdd #配置git密码<br>
          search-paths:<br>
            - cloud-config  #仓库名<br>
          default-label: master # 使用的默认分支，默认为 master<br>
          clone-on-start: true<br>
3.启动项添加@EnableConfigServer注解<br>
### Springcloud-serverboot 需要访问配置中心的微服务<br>
1.将原本的配置文件改为bootstrap.yml<br>
2.修改配置文件<br>
spring:<br>
  cloud:<br>
    config:<br>
      name: Springcloud-serverboot #微服务名称<br>
      profile: dev #访问的配置项<br>
      label:master: master #访问分支<br>
      uri: http://localhost:9966 #config配置中心的访问路径<br>
