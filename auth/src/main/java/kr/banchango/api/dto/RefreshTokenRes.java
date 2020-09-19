package kr.banchango.api.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RefreshTokenRes {
  private String accessToken;
  private String refreshToken;
  private LocalDateTime accessTokenExpiredAt;
  private LocalDateTime refreshTokenExpiredAt;
}
