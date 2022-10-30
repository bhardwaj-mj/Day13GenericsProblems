package com.bridgelabz;

public class FindMaximum {
    Float maximum(Float[] floatArray){
        Float max =0.0F;
        for (int i=0;i<floatArray.length-1;i++){
            if (floatArray[i].compareTo(floatArray[i+1])==1){
                max=floatArray[i];
            }else {
                max=floatArray[i+1];
            }
        }
        return max;
    }
}
