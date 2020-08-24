package io.zingoworks.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
// 사용자 정의 스프링 프로퍼티를 다시 로드
// /actuator/refresh를 호출
public class LicensingServiceApplication {

    public static void main(String[] args) {
        //return ConfigurableApplicationContext class
        SpringApplication.run(LicensingServiceApplication.class, args);
    }

}
