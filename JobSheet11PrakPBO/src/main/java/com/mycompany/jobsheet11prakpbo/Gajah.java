/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet11prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class Gajah extends Hewan{
    //meng-overwrite method pada class Hewan
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");        
    }
    
    //meng-overwrite method pada class Hewan
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");        
    }
    
    public static void main(String args[]){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}