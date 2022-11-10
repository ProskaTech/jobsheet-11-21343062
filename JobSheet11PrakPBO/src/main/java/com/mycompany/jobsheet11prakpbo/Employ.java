/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet11prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class Employ extends Person {
    private String noKaryawan;
    
    //konstruktor
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    //metode
    public void info(){
        System.out.println("NO.karyawan : " + this.noKaryawan);
        super.info();
    }
}