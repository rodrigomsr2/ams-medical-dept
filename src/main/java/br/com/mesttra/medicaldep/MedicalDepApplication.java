package br.com.mesttra.medicaldep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MedicalDepApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalDepApplication.class, args);
    }

}
