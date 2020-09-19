package kr.banchango.api;

import java.util.List;
import kr.banchango.api.dto.ProductDetailRes;
import kr.banchango.api.dto.ProductRes;
import kr.banchango.api.dto.ProductSearch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ProductController extends BaseController {

  @GetMapping
  public Mono<List<ProductRes>> products(ProductSearch search) {
    return Mono.just(List.of(
        ProductRes.builder()
            .productId("111")
            .productImage("https://cdn.thebanchan.co.kr/upload/C00001/goods/prd/326/372/190920000024372.jpg")
            .productName("sample-product")
            .storeId("1111")
            .storeName("sample-store")
            .storeThumbnail("https://cdn.thebanchan.co.kr/upload/C00001/goods/prd/326/372/190920000024372.jpg")
            .categoryId("1dd")
            .price(10000l)
            .ratings(4.8)
            .reviewCount(300L)
            .wishCount(23L)
            .build()
    ));
  }

  @GetMapping("{productId}")
  public Mono<ProductDetailRes> getProductDetail(@PathVariable String productId) {
    return Mono.just(ProductDetailRes.builder()
        .productId("111")
        .productImage("https://cdn.thebanchan.co.kr/upload/C00001/goods/prd/326/372/190920000024372.jpg")
        .productName("sample-product")
        .storeId("1111")
        .storeName("sample-store")
        .storeThumbnail("https://cdn.thebanchan.co.kr/upload/C00001/goods/prd/326/372/190920000024372.jpg")
        .categoryId("1dd")
        .price(10000l)
        .ratings(4.8)
        .reviewCount(300L)
        .wishCount(23L)
        .description("This is sample product.")
        .build());
  }
}