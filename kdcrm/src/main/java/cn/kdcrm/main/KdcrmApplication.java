package cn.kdcrm.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.kdcrm")
@MapperScan(basePackages = "cn.kdcrm.mapper")
public class KdcrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(KdcrmApplication.class, args);
    }

}
