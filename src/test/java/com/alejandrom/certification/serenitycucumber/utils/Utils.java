package com.alejandrom.certification.serenitycucumber.utils;

public class Utils {

    public static int validateIndex(int index, int minIndexValue, int maxIndexValue) {

        if(maxIndexValue <= minIndexValue){
            return 0;
        }

        if(index < minIndexValue){
            return 0;
        }

        if(index > maxIndexValue){
            return maxIndexValue;
        }

        return index;
    }
}
