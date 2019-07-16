package com.qq.taf.demo;

import com.qq.cloud.taf.spring.annotation.EnableTafServer;
import com.qq.cloud.taf.spring.annotation.RemotePropertySource;
import com.qq.cloud.taf.spring.annotation.TafHttpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yihengli
 * On 2018/7/3
 */
@SpringBootApplication
@EnableTafServer
@TafHttpService("HttpObj")
@RemotePropertySource({"test.properties"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
