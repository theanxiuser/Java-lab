/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodoverloading;

/**
 *
 * @author bishal
 */
public class MethodOverloading {

    public static void main(String[] args) {
        FindArea a = new FindArea();
        
        System.out.println("Area of rectangle = "+ a.area(4, 2));
        
        System.out.println("Area of circle = "+ a.area(5));
    }
}
