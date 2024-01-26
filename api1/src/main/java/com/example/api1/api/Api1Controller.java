package com.example.api1.api;

import com.example.api1.httpinterface.ExchangeHttpClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/api1/first")
@RestController
public class Api1Controller {
    private final ApplicationContext applicationContext;

    @GetMapping
    public String test() {
        Environment env = applicationContext.getEnvironment();
        String port = env.getProperty("server.port");

        log.info("port : {}",port);
        return "api1 port : " + port;
    }

    @GetMapping("/exchange")
    public String getApiFromApi2() {
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8081/")
                .build();
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient))
                .build();
        ExchangeHttpClient exchangeHttpClient = httpServiceProxyFactory.createClient(ExchangeHttpClient.class);
        String res = exchangeHttpClient.getPortInfo();

        return "exchange info from api2 - " + res;
    }
}
