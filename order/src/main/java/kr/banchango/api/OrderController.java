package kr.banchango.api;

import java.util.Arrays;
import java.util.List;
import kr.banchango.api.dto.OrderReq;
import kr.banchango.api.dto.OrderRes;
import kr.banchango.api.dto.OrderStatus;
import kr.banchango.api.dto.OrderType;
import kr.banchango.api.dto.PaymentType;
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
public class OrderController extends BaseController {

  @GetMapping
  public Mono<List<OrderRes>> getOrderList(){
    return Mono.just(
        Arrays.asList(
            OrderRes.builder()
                .amount(2)
                .orderStatus(OrderStatus.REQUEST)
                .orderType(OrderType.DELIVERY)
                .paymentType(PaymentType.BANK_TRANSFER)
                .productId("111332")
                .productName("sample-product")
                .productThumbnail("")
                .totalAmount(10000l)
                .storeId("111111")
                .orderId("22213333")
                .build(),
            OrderRes.builder()
                .amount(2)
                .orderStatus(OrderStatus.CONFIRM)
                .orderType(OrderType.DELIVERY)
                .paymentType(PaymentType.CREDIT_CARD)
                .productId("111332")
                .productName("sample-product")
                .productThumbnail("")
                .totalAmount(10000l)
                .storeId("111111")
                .orderId("22213333")
                .build()
        )
    );
  }

  @GetMapping("{orderId}")
  public Mono<OrderRes> getOrderDetail(){
    return Mono.just(
        OrderRes.builder()
            .amount(2)
            .orderStatus(OrderStatus.REQUEST)
            .orderType(OrderType.DELIVERY)
            .paymentType(PaymentType.BANK_TRANSFER)
            .productId("111332")
            .productName("sample-product")
            .productThumbnail("")
            .totalAmount(10000l)
            .storeId("111111")
            .orderId("22213333")
            .build()
    );
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public Mono<OrderRes> order(@RequestBody OrderReq orderReq) {
    return Mono.just(OrderRes.builder()
        .amount(orderReq.getAmount())
        .orderStatus(OrderStatus.REQUEST)
        .orderType(orderReq.getOrderType())
        .paymentType(orderReq.getPaymentType())
        .productId(orderReq.getProductId())
        .productName("sample-product")
        .productThumbnail("")
        .totalAmount(10000l)
        .storeId("111111")
        .orderId("22213333")
        .build());
  }

  @DeleteMapping(path = "{orderId}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Void> orderCancel(@PathVariable Long orderId) {
    return Mono.empty();
  }
}
