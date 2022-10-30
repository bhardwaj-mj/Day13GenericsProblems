package com.bridgelabz;

public class FindMaximum {
    Integer maximum(Integer[] intArray){
        Integer max =0;
        for (int i=0;i<intArray.length-1;i++){
            if (intArray[i].compareTo(intArray[i+1])==1){
                max=intArray[i];
            }else {
                max=intArray[i+1];
            }
        }
        return max;
    }
}
