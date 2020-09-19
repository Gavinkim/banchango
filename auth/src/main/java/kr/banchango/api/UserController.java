package kr.banchango.api;

import java.time.LocalDateTime;
import kr.banchango.api.dto.ChangeReq;
import kr.banchango.api.dto.ChangeRes;
import kr.banchango.api.dto.RegisterReq;
import kr.banchango.api.dto.RegisterRes;
import kr.banchango.api.dto.UnRegisterReq;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserController extends BaseController {

  @PostMapping("/register")
  @ResponseStatus(HttpStatus.OK)
  public Mono<RegisterRes> register(@RequestBody RegisterReq registerReq) {
    return Mono.just(RegisterRes.builder()
        .email(registerReq.getEmail())
        .username(registerReq.getUsername())
        .registedAt(LocalDateTime.now())
        .build());
  }

  @PostMapping("/change")
  @ResponseStatus(HttpStatus.OK)
  public Mono<ChangeRes> change(@RequestBody ChangeReq changeReq) {
    return Mono.just(ChangeRes.builder()
        .username(changeReq.getUsername())
        .updatedAt(LocalDateTime.now())
        .build());
  }

  @PostMapping("/unregister")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Void> unregister(@RequestBody UnRegisterReq unRegisterReq) {
    return Mono.empty();
  }
}
