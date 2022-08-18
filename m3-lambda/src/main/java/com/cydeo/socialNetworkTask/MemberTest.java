package com.cydeo.socialNetworkTask;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1 = new Person("naran", 37, Gender.MALE, "naran@gmail.com");
        Person p2 = new Person("dorothy", 20, Gender.FEMALE, "d@gmail.com");
        Person p3 = new Person("memo", 45, Gender.MALE,"mehmet@gmail.com");
        Person p4 = new Person("mike", 55, Gender.MALE, "mike@gmail.com");




    }

    public static void print (List<Person> personList, CheckMembers checkMembers){

        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if(checkMembers.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }




}
