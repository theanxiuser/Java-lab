/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodoverloading;

/**
 *
 * @author bishal
 */
public class FindArea {
    double area(double l, double b){
        return l*b;
    }
    
    double area(double r){
        return 3.14*r*r;
    }
}
