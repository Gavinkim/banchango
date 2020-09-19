package kr.banchango.api.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class LoginRes {
  private String username;
  private String email;
  private String thumbnail;
  private String accessToken;
  private String refreshToken;
  private LocalDateTime accessTokenExpiredAt;
  private LocalDateTime refreshTokenExpiredAt;
}
