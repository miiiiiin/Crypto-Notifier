package com.example.Cryptocurrency.service;

import com.example.Cryptocurrency.http.SlackHttpClient;
import com.example.Cryptocurrency.http.UpbitHttpClient;
import com.example.Cryptocurrency.http.UpbitTickerDTO;
import com.example.Cryptocurrency.repository.ReportHistoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UpbitSlackServiceTest {
    // Bean 다 mock 처리
    @Mock
    private SlackHttpClient slackHttpClient;
    @Mock
    private UpbitHttpClient upbitHttpClient;
    @Mock
    private ReportHistoryRepository repository;

    @InjectMocks
    private UpbitSlackService sut;

    @Test
    void test() {
        // given
        String market = "KRW-BTC";
        // mocking 처리
        when(upbitHttpClient.getTickerByMarket(market)).thenReturn(UpbitTickerDTO.builder()
                        .trade_price(10.0)
                        .build());

        // when
        sut.execute(market);

        // then
        verify(upbitHttpClient, atMostOnce()).getTickerByMarket(market);
        verify(slackHttpClient, atMostOnce()).send(any());
        verify(repository, atMostOnce()).save(any(), any());

    }

}