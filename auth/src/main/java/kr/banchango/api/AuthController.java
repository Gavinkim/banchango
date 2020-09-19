package kr.banchango.api;

import java.time.LocalDateTime;
import kr.banchango.api.dto.LoginReq;
import kr.banchango.api.dto.LoginRes;
import kr.banchango.api.dto.RefreshTokenReq;
import kr.banchango.api.dto.RefreshTokenRes;
import kr.banchango.api.dto.TokenVerifyRes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AuthController extends BaseController {

  @PostMapping(path = "/login")
  public Mono<LoginRes> login(@RequestBody LoginReq loginReq) {
    return Mono.just(
        LoginRes.builder()
            .accessToken("jwt-access-token")
            .refreshToken("jwt-refresh-token")
            .email(loginReq.getEmail())
            .username("test-user")
            .accessTokenExpiredAt(LocalDateTime.now().plusHours(1))
            .refreshTokenExpiredAt(LocalDateTime.now().plusDays(1))
            .thumbnail("")
            .build()
    );
  }

  @PostMapping(path = "/refresh")
  public Mono<RefreshTokenRes> refresh(@RequestBody RefreshTokenReq refreshTokenReq) {
    return Mono.just(
        RefreshTokenRes.builder()
            .accessToken("jwt-access-token")
            .refreshToken("jwt-refresh-token")
            .accessTokenExpiredAt(LocalDateTime.now().plusHours(1))
            .refreshTokenExpiredAt(LocalDateTime.now().plusDays(1))
            .build()
    );
  }

  @PostMapping(path = "/verify")
  public Mono<TokenVerifyRes> tokenVerify() {
    return Mono.just(TokenVerifyRes.builder()
        .description("This token is valid.")
        .tokenStatus(TokenStatus.VALID)
        .build());
  }

  @DeleteMapping(path = "/logout")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Void> logout() {
    return Mono.empty();
  }

}
