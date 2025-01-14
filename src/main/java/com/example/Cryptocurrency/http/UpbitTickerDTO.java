package com.example.Cryptocurrency.http;

import lombok.Getter;

@Getter
public class UpbitTickerDTO {
    private String market; // 종목 구분 코드
    private String tradeDate; // 최근 거래 일자(UTC) - yyyyMMdd
    private String tradeTime; // 최근 거래 시각(UTC) - HHmmss
    private String tradeDateKst; // 최근 거래 일자(KST) - yyyyMMdd
    private String tradeTimeKst; // 최근 거래 시각(KST) - HHmmss
    private Long tradeTimestamp; // 최근 거래 일시(UTC) - Unix Timestamp
    private Double openingPrice; // 시가
    private Double highPrice; // 고가
    private Double lowPrice; // 저가
    private Double tradePrice; // 종가(현재가)
    private Double prevClosingPrice; // 전일 종가(UTC 0시 기준)
    private String change; // 변화 상태 (EVEN, RISE, FALL)
    private Double changePrice; // 변화액의 절대값
    private Double changeRate; // 변화율의 절대값
    private Double signedChangePrice; // 부호가 있는 변화액
    private Double signedChangeRate; // 부호가 있는 변화율
    private Double tradeVolume; // 가장 최근 거래량
    private Double accTradePrice; // 누적 거래대금(UTC 0시 기준)
    private Double accTradePrice24h; // 24시간 누적 거래대금
    private Double accTradeVolume; // 누적 거래량(UTC 0시 기준)
    private Double accTradeVolume24h; // 24시간 누적 거래량
    private Double highest52WeekPrice; // 52주 신고가
    private String highest52WeekDate; // 52주 신고가 달성일 - yyyy-MM-dd
    private Double lowest52WeekPrice; // 52주 신저가
    private String lowest52WeekDate; // 52주 신저가 달성일 - yyyy-MM-dd
    private Long timestamp; // 타임스탬프
}
