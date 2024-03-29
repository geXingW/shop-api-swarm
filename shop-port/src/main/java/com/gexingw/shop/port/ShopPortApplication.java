package com.gexingw.shop.port;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GeXingW
 */
@SpringBootApplication
@MapperScan({"com.gexingw.shop.*.mapper"})
public class ShopPortApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopPortApplication.class, args);
    }

}
