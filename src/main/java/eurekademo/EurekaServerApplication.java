package eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServerApplication.class, args);
		//new SpringApplicationBuilder(EurekaServerApplication.class).web(EurekaServerApplication.class).run(args);
	}

}
