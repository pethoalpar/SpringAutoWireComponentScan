package com.pethoalpar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by petho on 2017-07-16.
 */
@Component
public class Person {

    @Autowired
    private Location location;

    public void printPerson(){
        System.out.println("Name:Alpar age:42 location:"+location.getLocation());
    }
}
