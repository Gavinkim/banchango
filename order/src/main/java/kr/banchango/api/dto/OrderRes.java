package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class OrderRes {
  private String productName;
  private String productId;
  private String productThumbnail;
  private String storeId;
  private int amount;
  private Long totalAmount;
  private PaymentType paymentType;
  private OrderType orderType;
  private OrderStatus orderStatus;
  private String orderId;
}
