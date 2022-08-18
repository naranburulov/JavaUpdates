package com.cydeo.OrangeTask;

@FunctionalInterface             //lambda can be used
public interface OrangeFormatter {
    String accept(Orange orange);   //because task requires String output (or to return String)

}
