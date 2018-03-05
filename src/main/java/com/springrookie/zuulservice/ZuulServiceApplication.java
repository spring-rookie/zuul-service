package com.springrookie.zuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableAutoConfiguration(exclude = {
  DataSourceAutoConfiguration.class,
  HibernateJpaAutoConfiguration.class
}) // run spring boot without DB support
@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApplication {
  public static void main(final String[] args) {
    SpringApplication.run(ZuulServiceApplication.class, args);
  }
}
