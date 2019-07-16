package com.qq.taf.demo.impl;

import com.qq.cloud.taf.spring.annotation.TafClient;
import com.qq.cloud.taf.spring.annotation.TafService;
import com.qq.taf.demo.share.HelloWordPrx;
import com.qq.taf.demo.share.HelloWordServant;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by yihengli
 * On 2018/7/3
 */
@TafService("HelloObj")
public class HelloWorldServantImpl implements HelloWordServant {
    @TafClient(name = "TafJavaTest.SpringBootServer.HelloObj", syncTimeout = 1000)
    HelloWordPrx prx;

    @Value("${taf.test}")
    String test;

    public String sayHello() {
        return test;
    }
}
