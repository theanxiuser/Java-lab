/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multilvlinhtester;

/**
 *
 * @author bishal
 */
class BaseCls{
    protected int a;
    
    BaseCls(){
        System.out.println("There is a father");
    }
    BaseCls(int a){
        this.a = a;
    }
}

class Intermediate extends BaseCls{
    protected int b;
    
    Intermediate(){
        System.out.println("...of all father, that");
    }
    Intermediate(int p, int q){
        super(p);
        b = q;
    }
    
}

public class IhaveExtended extends Intermediate{
    private int c;
    
    IhaveExtended(){
        System.out.println("...we called Grandfather!!");
    }
    IhaveExtended(int p, int q, int r){
        super(p, q);
        c = r;
    }
    
    int sumofAll(){
        return(a+b+c);
    }
}
