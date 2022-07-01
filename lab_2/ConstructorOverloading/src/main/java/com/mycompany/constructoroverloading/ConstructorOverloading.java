/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.constructoroverloading;

/**
 *
 * @author bishal
 */

class Rectangle{
     int l ,b;
     
    Rectangle(){
        System.out.println("Using default const.");
        l = 4;
        b = 6;
    }
    
    Rectangle(int a, int b){
        System.out.println("Using parameterized const.");
        l = a;
        this.b = b;
    }
    
    int getArea(){
        return l*b;
    }
    
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area = "+ r1.getArea());
        
        Rectangle r2 = new Rectangle(4, 4);
        System.out.println("Area = "+ r2.getArea());
    }
}
