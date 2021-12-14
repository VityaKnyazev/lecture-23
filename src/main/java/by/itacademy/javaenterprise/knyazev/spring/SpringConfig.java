package by.itacademy.javaenterprise.knyazev.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"by.itacademy.javaenterprise.knyazev.aop", "by.itacademy.javaenterprise.knyazev.components"})
public class SpringConfig {}