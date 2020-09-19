package kr.banchango.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChangeReq {
  private String newPassword;
  private String username;
  private String thumbnail;
}
