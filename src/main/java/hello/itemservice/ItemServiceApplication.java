package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}


	// 메세지 소스 설정하는 법
	// Spring Boot 사용시 자동으로 설정이 들어간다.

//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new
//				ResourceBundleMessageSource();
//		messageSource.setBasenames("messages", "errors");
//		messageSource.setDefaultEncoding("utf-8");
//		return messageSource;
//	}

}
