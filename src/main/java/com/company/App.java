package com.company;

import com.company.web.filter.AuthorizationFilter;
import com.company.web.interceptor.MyInterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class App implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

//    @Bean
//    public FilterRegistrationBean<AuthorizationFilter> authorizationFilter() {
//        FilterRegistrationBean<AuthorizationFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new AuthorizationFilter());
//        registrationBean.addUrlPatterns("/user/getAll");
//        registrationBean.setOrder(2);
//        return registrationBean;
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(myInterceptor())
//                .addPathPatterns("/**");
//    }
//
//    @Bean
//    public MyInterceptor myInterceptor() {
//        return new MyInterceptor();
//    }

}
