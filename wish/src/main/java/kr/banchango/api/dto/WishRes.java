package kr.banchango.api.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class WishRes {
  private String productId;
  private String productName;
  private String productThumbnail;
  private LocalDateTime registeredAt;
}
