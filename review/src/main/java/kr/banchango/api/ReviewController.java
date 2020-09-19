package kr.banchango.api;

import java.time.LocalDateTime;
import java.util.List;
import kr.banchango.api.dto.AddReview;
import kr.banchango.api.dto.ModifyReview;
import kr.banchango.api.dto.ReviewRes;
import kr.banchango.api.dto.ReviewSearch;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ReviewController extends BaseController {

  @GetMapping("{productId}")
  public Mono<List<ReviewRes>> getReviews(ReviewSearch search) {
    return Mono.just(
        List.of(
            ReviewRes.builder()
                .productId(search.getProductId())
                .reviewId("111")
                .userId("111")
                .username("test-user")
                .content("This is sample description.")
                .writtenAt(LocalDateTime.now().minusDays(1))
                .ratings(3.4)
                .build(),
            ReviewRes.builder()
                .productId(search.getProductId())
                .reviewId("2222")
                .userId("2222")
                .username("test-user")
                .content("This is sample description.")
                .writtenAt(LocalDateTime.now().minusDays(1))
                .ratings(4.5)
                .build()
        )
    );
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public Mono<Void> add(@RequestBody AddReview addReview) {
    return Mono.empty();
  }

  @PutMapping
  public Mono<Void> update(@RequestBody ModifyReview modifyReview) {
    return Mono.empty();
  }

  @DeleteMapping("{reviewId}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Void> delete(@PathVariable Long reviewId) {
    return Mono.empty();
  }

}
