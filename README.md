# Banchango microservice

### Tutorial
```
- maven module
- spring gateway
- spring reactive
- spring batch 
```

### Build
```
-pl [ ] : 지정된 이름의 모듈만 빌드한다.
-am : 연결된 상위 모듈까지 같이 빌드한다.

example: order-api build 
mvn clean install -pl order-api -am
```

### Info

* auth
> http://localhost:9091/api/auth

* order
 > http://localhost:9092/api/order

* product
 > http://localhost:9093/api/product

* review
 > http://localhost:9094/api/review

* wish
 > http://localhost:9095/api/wish