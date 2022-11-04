/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet11prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class Bus2 {
    public int penumpang;
    public int maxPenumpang;
    
    //konstruktor
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang Melebihi Kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang    : " + penumpang);
        System.out.println("Penumpang Maks Seharusnya : " + maxPenumpang);
    }
}