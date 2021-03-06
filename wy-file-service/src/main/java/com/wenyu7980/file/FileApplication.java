package com.wenyu7980.file;

import com.wenyu7980.authentication.common.feign.EnableWYAuthentication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author wenyu
 */
@SpringBootApplication
@EnableScheduling
@EnableWYAuthentication
@EnableFeignClients(basePackages = "com.wenyu7980")
public class FileApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileApplication.class, args);
    }
}
