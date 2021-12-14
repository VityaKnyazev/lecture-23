package by.itacademy.javaenterprise.knyazev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.itacademy.javaenterprise.knyazev.components.Transformer;
import by.itacademy.javaenterprise.knyazev.spring.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Transformer transformer = context.getBean(Transformer.class);
        transformer.setPassword("Kolobok");
        transformer.transform();
        transformer.transform("11F5", "FULL", true);
        context.close();
    }
}
