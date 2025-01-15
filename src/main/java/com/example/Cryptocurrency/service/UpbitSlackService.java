package com.example.Cryptocurrency.service;

import com.example.Cryptocurrency.http.SlackHttpClient;
import com.example.Cryptocurrency.http.UpbitHttpClient;
import com.example.Cryptocurrency.http.UpbitTickerDTO;
import com.example.Cryptocurrency.repository.ReportHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitSlackService {
    private final SlackHttpClient slackHttpClient;
    private final UpbitHttpClient upbitHttpClient;

    private final ReportHistoryRepository repository;

    public void execute(String market) {
        UpbitTickerDTO tickerByMarket = upbitHttpClient.getTickerByMarket(market);
        StringBuilder sb = new StringBuilder();
        sb.append("[실시간 데이터] ");
        sb.append(market);
        sb.append(" price = ");
        sb.append(tickerByMarket.getTrade_price());
        slackHttpClient.send(sb.toString());

        repository.save(market, String.valueOf(tickerByMarket.getTrade_price()));
    }
}
