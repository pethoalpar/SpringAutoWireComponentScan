package com.pethoalpar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by petho on 2017-07-16.
 */
public class Main {

    public static void main(String [] args){

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);
        person.printPerson();
    }
}
