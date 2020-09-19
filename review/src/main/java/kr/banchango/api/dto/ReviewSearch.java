package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewSearch {
  private String productId;
  private String search;
}
