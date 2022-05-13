package com.star.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: <br>
 * Create Date: 2022/5/10 下午8:29 <br>
 *
 * @author wangyu@mvtech.com.cn
 */
@EnableDubbo
@SpringBootApplication
public class ProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain.class, args);
    }
}
