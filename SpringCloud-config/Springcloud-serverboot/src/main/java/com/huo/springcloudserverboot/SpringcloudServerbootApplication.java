package com.huo.springcloudserverboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//案例微服务
//修改配置文件为bootstrap.yml
//启动时就会优先加载配置项
@SpringBootApplication
public class SpringcloudServerbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServerbootApplication.class, args);
    }

}
