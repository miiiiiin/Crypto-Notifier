package com.example.Cryptocurrency.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UpbitHttpClient {
    private final HTTPClient httpClient;

    public UpbitTickerDTO getTickerByMarket(String market) {
        try {

            HttpHeaders headers = new HttpHeaders();
            headers.add("accept", "application/json");
            String execute = httpClient.execute(
                    "https://api.upbit.com/v1/ticker?markets=" + market,
                    HttpMethod.GET,
                    headers
            );
            ObjectMapper obj = new ObjectMapper();
            return obj.readValue(execute, new TypeReference<List<UpbitTickerDTO>>() {}).stream().findFirst().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
