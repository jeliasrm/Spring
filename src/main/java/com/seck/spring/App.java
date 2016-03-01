package com.seck.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seck.beans.AppConfig;
import com.seck.beans.Mundo;

public class App 
{
    public static void main( String[] args )
    {
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/seck/xml/beans.xml");
    	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	Mundo m = (Mundo) appContext.getBean("mundo");
    	
    	System.out.println(m.getSaludo());
    	
    	((ConfigurableApplicationContext) appContext).close();
    	
    }
}
