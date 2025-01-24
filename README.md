# hexagon-demo
## Project structure: 
```
src/main/java/com/example/hexagonal
├── application (business logic)
│   ├── port
│   │   ├── in
│   │   │   └── CreateOrderUseCase.java
│   │   ├── out
│   │   │   └── OrderRepository.java
│   └── service
│       └── OrderService.java
├── domain
│   └── Order.java
├── infrastructure (adapters)
│   ├── persistence
│   │   ├── JpaOrderRepository.java
│   │   └── OrderEntity.java
│   ├── rest
│   │   └── OrderController.java
└── HexagonalApplication.java
```

## Api usage example:
curl -X POST "http://localhost:8080/orders?productName=Book&quantity=1"