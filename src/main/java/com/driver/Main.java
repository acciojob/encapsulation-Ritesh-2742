package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj = new RWOnly();
//        obj.name="ritesh";
//        'name' has private access in 'com.driver.RWOnly'
        obj.setName("Ritesh");
        System.out.println(obj.getName());
    }
}