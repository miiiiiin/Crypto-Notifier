package com.example.Cryptocurrency.http;

import com.example.Cryptocurrency.exception.UpbitClientException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

// 이 클래스를 호출해주는 곳은 Service가 될 수 있고, 이를 한 단계 더 감싼 클래스일 수 있음
@Component
@RequiredArgsConstructor // 생성자 주입 (restTemplate)
public class HTTPClient {
    private final RestTemplate restTemplate;

    public String execute(String uri, HttpMethod method, HttpHeaders headers) {
        try {
            return restTemplate.exchange(
                    uri,
                    method,
                    new HttpEntity<>(headers),
                    new ParameterizedTypeReference<String>() {}
            ).getBody();
        } catch (RestClientException e) {
            throw new UpbitClientException(e.getMessage());
        }
    }
}
