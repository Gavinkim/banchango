package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UnRegisterReq {
  private String verifyCode;
  private boolean terms;
}
