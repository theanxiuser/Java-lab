/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singleinhtester;

/**
 *
 * @author bishal
 */
public class SingleInhTester {

    public static void main(String[] args) {
        Inherited obj = new Inherited();
        obj.setValue(4, 12);
        
        System.out.println("Sum of base and drived = "+ obj.sum());
    }
}
