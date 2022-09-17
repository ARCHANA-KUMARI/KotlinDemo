package com.example.kotlindemo.oops.sealed

/**
 * @Author: Archana Kumari
 * @Date: 17-09-2022
 */
sealed class CtorSealedDemo{
    private constructor(){}
    // Default protected
    protected constructor(i : Int){
        print(" with  protected I am in secondary ctor" + i)
    }

    private constructor(name : String){
        print(" with  private I am in secondary ctor" + name)
    }

    // Error if public : Constructor must be private or protected in sealed class
   /* public constructor(status : Boolean){
        print(" with  public I am in secondary ctor" + status)
    }*/

}

