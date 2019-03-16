# microservice-springcloud-feign
#### 工程说明

1个eureka（注册不心）、1个consumer（消费者）、2个provider（provider-dept 和 provider-user 作为提供者）

#### 架构思路

eureka 作为注册中心，consumer 和 provider 注册到 eureka，客户端访问微服务走统一入口 consumer，consumer 中以 SpringMVC 的开发风格，在 controller 层调用 service，暨调用了微服务