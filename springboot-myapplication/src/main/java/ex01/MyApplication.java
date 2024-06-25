package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {
    @Bean
    public Mycomponent mycomponent() {
        return new Mycomponent();
    }
    public static void main(String[] args) {
        try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
        }

    }
}
