package kz.iitu.bussystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class BusSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusSystemApplication.class, args);
	}

}
