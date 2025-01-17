package com.example.Cryptocurrency;

import com.example.Cryptocurrency.controller.TestController;
import com.example.Cryptocurrency.http.HTTPClient;
import com.example.Cryptocurrency.http.SlackHttpClient;
import com.example.Cryptocurrency.http.UpbitHttpClient;
import com.example.Cryptocurrency.service.UpbitSlackService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CryptocurrencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CryptocurrencyApplication.class, args);
		SpringApplication.exit(run);
	}

}
