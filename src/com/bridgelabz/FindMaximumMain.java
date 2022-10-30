package com.bridgelabz;

public class FindMaximumMain {
    public static void main(String[] args) {
        Integer[] intArray = {30,50,20};
        FindMaximum findMaximum=new FindMaximum();
        Integer maximumNumber=findMaximum.maximum(intArray);
        System.out.println("Maximum number among three numbers is => " +maximumNumber);
    }
}
