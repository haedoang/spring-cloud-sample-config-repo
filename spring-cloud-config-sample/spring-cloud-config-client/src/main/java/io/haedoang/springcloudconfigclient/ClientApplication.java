package io.haedoang.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class ClientApplication {


	@RestController
	public static class MainController {

		@Value("${app.info}")
		private String info;

		@GetMapping
		public String index() {
			return "app.info: " + info;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
