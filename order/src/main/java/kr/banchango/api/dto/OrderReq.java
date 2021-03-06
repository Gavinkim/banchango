package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class OrderReq {
  private String productId;
  private int amount;
  private PaymentType paymentType;
  private OrderType orderType;
}
