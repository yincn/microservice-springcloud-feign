# microservice-springcloud-feign
#### 工程说明

* 1个公式 API

  将公共文件和 Service 接口全部放在此工程里，使其它微服务能够共用

* 1个 Eureka （注册中心）

* 1个 Consumer（消费者）

* 2个 Provider（provider-dept 和 provider-user 作为提供者）

#### 架构思路

Eureka 作为注册中心，Consumer 和 Provider 注册到 Eureka，客户端访问微服务走统一入口 Consumer，Consumer 中以 SpringMVC 的开发风格，在 Controller 层调用 Service，Service 以 Feign 注解指向特定微服务，从而达到通过 Feign 进行微服务之前的调用