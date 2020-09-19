package kr.banchango.api.dto;

import lombok.Getter;

@Getter
public enum PaymentType {
  CREDIT_CARD, BANK_TRANSFER, VIRTUAL_ACCOUNT, KAKAO_PAY, TOSS;
}
