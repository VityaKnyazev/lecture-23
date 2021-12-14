package by.itacademy.javaenterprise.knyazev.aop;

import org.aspectj.lang.annotation.Pointcut;

public class AbstractAspect {
	@Pointcut("execution(public String by.itacademy.javaenterprise.knyazev.components.Transformer.transform())")
	void transformWithOneArgument() {
	};
	
	@Pointcut("execution(public String by.itacademy.javaenterprise.knyazev.components.Transformer.transform(String, String, boolean))")
	void transformWithThreeArguments() {
	};
}
