package com.github.jaafaree.uamatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 2018/4/17 15:58
 */
@ComponentScan({"com.github.jaafaree.uamatcher"})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
