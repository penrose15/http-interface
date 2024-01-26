package com.example.api2.httpinterface;

import org.springframework.http.ResponseEntity;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/api1/first")
public interface ExchangeHttpClient {
    @GetExchange
    ResponseEntity<String> getPortInfo();
}
