package com.cydeo.OrangeTask;

import java.util.*;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, com.cydeo.OrangeTask.Color.GREEN));
        inventory.add(new Orange(100, com.cydeo.OrangeTask.Color.RED));
        inventory.add(new Orange(200, com.cydeo.OrangeTask.Color.GREEN));
        inventory.add(new Orange(50, Color.RED));



    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){
        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }


}
