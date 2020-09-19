package kr.banchango.api.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ReviewRes {
  private String reviewId;
  private String productId;
  private String userId;
  private String username;
  private String content;
  private LocalDateTime writtenAt;
  private double ratings;
}
