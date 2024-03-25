package com.company;

public class AltPairs {
    /**
     Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     altPairs("kitten") → "kien"
     altPairs("Chocolate") → "Chole"
     altPairs("CodingHorror") → "Congrr"
     altPairs("ya") → "ya"
     altPairs("y") → "y" */

    public String altPairs(String str) {
        String result = "";
        int pos  = 0;
        for(int i = 0; i < str.length()-2; i+=2) {
            result += str.substring(i, i+=2);
            pos = i;
        }
        if  ((str.length() - pos >= 3)){
            result += str.substring(pos+2);
        }

        if (str.length() <= 2){
            result += str.substring(pos);
        }
        return result;
    }

}
