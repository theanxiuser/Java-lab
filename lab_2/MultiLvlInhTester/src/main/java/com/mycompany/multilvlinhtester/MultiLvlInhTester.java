/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multilvlinhtester;

/**
 *
 * @author bishal
 */
public class MultiLvlInhTester {

    public static void main(String[] args) {
        IhaveExtended obj = new IhaveExtended();
        obj = new IhaveExtended(2, 4, 6);
        System.out.println("Sum of all father = "+ obj.sumofAll());
    }
}
