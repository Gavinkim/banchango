package kr.banchango.api;

import java.time.LocalDateTime;
import java.util.List;
import kr.banchango.api.dto.WishReq;
import kr.banchango.api.dto.WishRes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WishController extends BaseController {

  @GetMapping
  public Mono<List<WishRes>> getMyWish() {
    return Mono.just(
        List.of(
            WishRes.builder()
                .productId("1111")
                .productName("Sample-Wish-product-name")
                .productThumbnail("")
                .registeredAt(LocalDateTime.now())
                .build(),
            WishRes.builder()
                .productId("222")
                .productName("Sample-Wish-product-name")
                .productThumbnail("")
                .registeredAt(LocalDateTime.now())
                .build()
        )
    );
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public Mono<WishRes> add(@RequestBody WishReq wishReq) {
    return Mono.just(WishRes.builder()
        .productId(wishReq.getProductId())
        .productName("Sample-Wish-product-name")
        .productThumbnail("")
        .registeredAt(LocalDateTime.now())
        .build());
  }

  @DeleteMapping("{wishId}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Void> delete(@PathVariable Long wishId) {
    return Mono.empty();
  }
}
