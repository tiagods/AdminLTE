package com.plkrhone.sisrh;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
@Controller
public class SisrhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisrhApplication.class, args);
	}
	@Bean
	public LocaleResolver localResolver() {
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "admin/index";
	}
}
