package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ModifyReview {
  private String reviewId;
  private String content;
  private String productId;
  private double ratings;
}
