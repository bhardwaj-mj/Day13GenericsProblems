package com.bridgelabz;

public class FindMaximumMain {
    public static void main(String[] args) {
        Float[] floatArray = {25.5F,50.5F,20.2F};
        FindMaximum findMaximum=new FindMaximum();
        Float maximumNumber=findMaximum.maximum(floatArray);
        System.out.println("Maximum number among three numbers is => " +maximumNumber);
    }
}
