package kr.banchango.api.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RegisterRes {
  private String username;
  private String email;
  private LocalDateTime registedAt;
}
