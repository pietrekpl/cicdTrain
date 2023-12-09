package mirkoserwis_send.mirkoserwis_send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MirkoserwisSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MirkoserwisSendApplication.class, args);
	}

}
