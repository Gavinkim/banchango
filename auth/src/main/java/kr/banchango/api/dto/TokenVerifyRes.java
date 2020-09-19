package kr.banchango.api.dto;

import kr.banchango.api.TokenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TokenVerifyRes {
  private String description;
  private TokenStatus tokenStatus;
}
