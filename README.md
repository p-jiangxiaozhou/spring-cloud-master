# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.10.RELEASE/maven-plugin/)
* [Nacos Service Discovery](https://spring-cloud-alibaba-group.github.io/github-pages/hoxton/en-us/index.html#_spring_cloud_alibaba_nacos_discovery)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-webservices)

### Guides
The following guides illustrate how to use some features concretely:

* [Nacos Service Discovery Example](https://github.com/alibaba/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-examples/nacos-example/nacos-discovery-example/readme.md)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)

### oauth2默认授权端点

* /oauth/authorize: 授权端点
* /oauth/token: 令牌端点
* /oauth/confirm_access: 用户确认授权提交端点
* /oauth/error: 授权服务错误信息端点
* /oauth/check_token: 用于资源服务访问的令牌解析端点
* /oauth/token_key: 提供公有密钥的端点，如果你使用JWT令牌的话。

