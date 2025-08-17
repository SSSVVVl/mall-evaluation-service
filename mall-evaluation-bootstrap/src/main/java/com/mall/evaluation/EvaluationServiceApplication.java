package com.mall.evaluation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 评价服务启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mall.evaluation.adapter.out.persistence.mapper")
public class EvaluationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvaluationServiceApplication.class, args);
    }
}