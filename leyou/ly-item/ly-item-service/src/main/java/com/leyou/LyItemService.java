package com.leyou;

/**
 * Author: 98050
 * Time: 2018-08-03 21:23
 * Feature:
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author li
 * @time 2018-08-03 21:23
 */
@SpringBootApplication
@EnableDiscoveryClient
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.leyou.item.*")
//@MapperScan(basePackages = "com.leyou.item.mapper")
public class LyItemService {
    public static void main(String[] args) {
        SpringApplication.run(LyItemService.class,args);
    }
}
