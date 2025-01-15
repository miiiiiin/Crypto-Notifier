package com.example.Cryptocurrency.repository;

import com.example.Cryptocurrency.entity.ReportHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
// ReportHistoryJpaRepository 호출
@Repository
@RequiredArgsConstructor
public class ReportHistoryRepository{
    private final ReportHistoryJpaRepository repository;

    public void save(String market, String price) {
        repository.save(new ReportHistory(market, price));
    }
}
