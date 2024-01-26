package com.example.api1.httpinterface;

import org.springframework.http.ResponseEntity;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.Map;

@HttpExchange("/api2/second")
public interface ExchangeHttpClient {
    @GetExchange
    ResponseEntity<String> getPortInfo();
}
