package com.example.kotlindemo.javaCode;

import com.example.kotlindemo.functionDemo.MethodInSameClassKt;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        System.out.println("Max is from Kotlin method " + MethodInSameClassKt.max(10,12));
    }
}
