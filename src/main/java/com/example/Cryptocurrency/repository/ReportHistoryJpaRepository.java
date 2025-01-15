package com.example.Cryptocurrency.repository;

import com.example.Cryptocurrency.entity.ReportHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportHistoryJpaRepository extends JpaRepository<ReportHistory, Integer> {
}
