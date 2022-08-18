package com.cydeo.OrangeTask;

import java.util.*;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, com.cydeo.OrangeTask.Color.YELLOW));
        inventory.add(new Orange(100, com.cydeo.OrangeTask.Color.ORANGE));
        inventory.add(new Orange(200, com.cydeo.OrangeTask.Color.YELLOW));
        inventory.add(new Orange(50, Color.ORANGE));


        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + " is yellow.";
        prettyPrintOrange(inventory, orangeLambda);

        System.out.println("-------------");

        OrangeFormatter fancyFormatter = orange -> {
            String weight = orange.getWeight() >200 ? "Heavy" : "Light";
            return  "A " + weight + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(inventory, fancyFormatter);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){
        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }


}
