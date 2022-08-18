package com.cydeo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {

    private String make;
    private String model;

    public Car(String model) {
        this.model = model;
    }
}
