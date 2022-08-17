package com.cydeo.OrangeTask;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Orange {

    private int weight;
    private Color color;

}
/*
Write a prettyPrintApple method that takes aList of Oranges, 
and that can be parameterized with multiple ways 
to generate a String output from an orange.

public static void prettyPrintOrange(List<Orange> inventory, ???){
            for(Orange orange : inventory){
            String output = ???.???(orange);
            System.out.println(output); 
    }
}
Sample Output :
A Light GREEN orange 
A Heavy RED orange 
A Light GREEN orange
Sample Output :
An orange of 80g 
An orange of 155g 
An orange of 120g
 */
