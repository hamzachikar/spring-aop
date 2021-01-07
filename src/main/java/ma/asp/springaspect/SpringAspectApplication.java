package ma.asp.springaspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringAspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAspectApplication.class, args);
	}

}
