package com.fastcampus.boardserver.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.fastcampus.boardserver.mapper")
public class MysqlConfig {

}
