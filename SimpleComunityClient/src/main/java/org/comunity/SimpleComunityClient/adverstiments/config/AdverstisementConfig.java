package org.comunity.SimpleComunityClient.adverstiments.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AdverstisementConfig {

	@Bean
	public RestOperations createRestTemplate(final ClientHttpRequestFactory factory){
		return new RestTemplate(factory);
	}
	
	@Bean
	public ClientHttpRequestFactory createHttpRequestFactory(
			@Value("${community.ws.config.connection.timeout}")final int connectTimeout,
			@Value("${community.ws.config.read.timeout}")final int readTimeout){
		HttpComponentsClientHttpRequestFactory connFactory 
						= new HttpComponentsClientHttpRequestFactory();
		connFactory.setConnectionRequestTimeout(readTimeout);
		connFactory.setConnectTimeout(connectTimeout);
		return connFactory;
	}
}
