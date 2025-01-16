package com.example.Cryptocurrency.http;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder // 생성자 없어서 builder 처리
public class UpbitTickerDTO {
    private String market; // 종목 구분 코드
    private String trade_date; // 최근 거래 일자(UTC) - yyyyMMdd
    private String trade_time; // 최근 거래 시각(UTC) - HHmmss
    private String trade_date_kst; // 최근 거래 일자(KST) - yyyyMMdd
    private String trade_time_kst; // 최근 거래 시각(KST) - HHmmss
    private Long trade_timestamp; // 최근 거래 일시(UTC) - Unix Timestamp
    private Double opening_price; // 시가
    private Double high_price; // 고가
    private Double low_price; // 저가
    private Double trade_price; // 종가(현재가)
    private Double prev_closing_price; // 전일 종가(UTC 0시 기준)
    private String change; // 변화 상태 (EVEN, RISE, FALL)
    private Double change_price; // 변화액의 절대값
    private Double change_rate; // 변화율의 절대값
    private Double signed_change_price; // 부호가 있는 변화액
    private Double signed_change_rate; // 부호가 있는 변화율
    private Double trade_volume; // 가장 최근 거래량
    private Double acc_trade_price; // 누적 거래대금(UTC 0시 기준)
    private Double acc_trade_price_24h; // 24시간 누적 거래대금
    private Double acc_trade_volume; // 누적 거래량(UTC 0시 기준)
    private Double acc_trade_volume_24h; // 24시간 누적 거래량
    private Double highest_52_week_price; // 52주 신고가
    private String highest_52_week_date; // 52주 신고가 달성일 - yyyy-MM-dd
    private Double lowest_52_week_price; // 52주 신저가
    private String lowest_52_week_date; // 52주 신저가 달성일 - yyyy-MM-dd
    private Long timestamp; // 타임스탬프
}
