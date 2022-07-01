/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleinhtester;

/**
 *
 * @author bishal
 */
class InheritMe {
    protected int b;
    
    InheritMe(){
        System.out.println("Hi, I am base class");
    }
    
}

class Inherited extends InheritMe{
    int c;
    Inherited(){
        System.out.println("I am child class");
    }
    
    void setValue(int p, int q){
        b = p;
        c = q;
    }
    
    int sum(){
        return b+c;
    }
}