package com.example.Cryptocurrency.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "report_histories")
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 생성자 (default
public class ReportHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MYSQL은 identity 전략 (db id 생성 기준)
    private int id;

    @Column
    private String market;
    @Column
    private String price;
    @Column
    private LocalDateTime reportedAt;

    public ReportHistory(String market, String price) {
        this.market = market;
        this.price = price;
        this.reportedAt = LocalDateTime.now();
    }
}
