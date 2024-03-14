package com.bekzod.gateway;

import org.apache.hc.client5.http.classic.HttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import org.springframework.cloud.gateway.config.HttpClientCustomizer;


@SpringBootApplication
public class GatewayApplication {

//	@Bean
//	public HttpClientCustomizer httpClientResolverCustomizer() {
//		return new HttpClientCustomizer() {
//
//			@Override
//			public HttpClient customize(HttpClient httpClient) {
//				return httpClient.resolver(DefaultAddressResolverGroup.INSTANCE);
//			}
//		};
//	}

	@Bean
	public HttpClient webClient() {
		return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
