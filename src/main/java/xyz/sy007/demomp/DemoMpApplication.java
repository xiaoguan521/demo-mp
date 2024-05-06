package xyz.sy007.demomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.sy007.demomp.Dao")
public class DemoMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMpApplication.class, args);
    }

}
