package kr.banchango.api.dto;

import kr.banchango.api.SearchType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductSearch {
  private SearchType type;
  private String searchName;
  private Long categoryId;
  private String storeId;
}
