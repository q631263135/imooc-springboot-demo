package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpringBootDemoApplication {

	public static void main(String[] args) {
        try {
            SpringApplication.run(SpringBootDemoApplication.class, args);
        } catch (Exception e) {
//            e.printStackTrace();
        }
	}

}

/*
org.springframework.beans.factory.BeanCreationException:
Error creating bean with name 'defaultValidator' defined in
    class path resource [org/springframework/boot/autoconfigure/validation/ValidationAutoConfiguration.class]:
Bean instantiation via factory method failed;
nested exception is org.springframework.beans.BeanInstantiationException:
Failed to instantiate [org.springframework.validation.beanvalidation.LocalValidatorFactoryBean]:
Factory method 'defaultValidator' threw exception; nested exception is java.lang.NoClassDefFoundError:
Could not initialize class org.hibernate.validator.internal.engine.ConfigurationImpl
 */

/*
项目刚导入进来运行时：
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.9.RELEASE)

2019-10-10 19:46:22.843  INFO 2204 --- [           main] com.imooc.SpringBootDemoApplication      : Starting SpringBootDemoApplication on joyin-PC with PID 2204 (D:\workspaces\imooc-springboot-demo\target\classes started by joyin in D:\workspaces\imooc-springboot-demo)
2019-10-10 19:46:22.854  INFO 2204 --- [           main] com.imooc.SpringBootDemoApplication      : No active profile set, falling back to default profiles: default
2019-10-10 19:46:47.570  INFO 2204 --- [           main] com.imooc.SpringBootDemoApplication      : Started SpringBootDemoApplication in 44.328 seconds (JVM running for 149.259)
Disconnected from the target VM, address: '127.0.0.1:60187', transport: 'socket'


然后没有然后了...

第二天过来再跑时，又好了...
 */