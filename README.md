## Spring Cloud Config 

### 리소스 전략

```text
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```

## server run
> ./spring-cloud-config-server/gradlew bootRun

## client run
> ./spring-cloud-config-client/gradlew bootRun 

## test
> curl localhost:8889 

client profile 에 따라 env 파일이 변경됨을 확인한다 


### references
- [https://www.baeldung.com/spring-cloud-configuration](https://www.baeldung.com/spring-cloud-configuration)
- [https://github.com/spring-cloud-samples/config-repo](https://github.com/spring-cloud-samples/config-repo)