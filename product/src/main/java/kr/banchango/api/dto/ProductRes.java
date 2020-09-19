package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProductRes {
  private String productId;
  private String productName;
  private String productImage;
  private String storeId;
  private String storeName;
  private String storeThumbnail;
  private String categoryId;
  private Long wishCount;
  private Long reviewCount;
  private long price;
  private double ratings;
}
