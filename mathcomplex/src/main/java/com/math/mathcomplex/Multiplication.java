package com.math.mathcomplex;

import com.math.mathcommons.Addition;

public class Multiplication {

    public static int multiple(int a,int b){
        Addition addition=new Addition();
        int result=0;
        for(int i=0;i<b;i++){
            result+=addition.add(a,a);
        }
        return result;
    }
    public static void main(String[] args){
        Multiplication multiplication=new Multiplication();

        System.out.println("Square of Two: ");
        System.out.println(multiplication.multiple(2,2));
    }
}
