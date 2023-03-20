/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author kayuh
 */
public class HinhChuNhat extends Hinh {
    private float cd;
    private float cr;

    public HinhChuNhat(float cd, float cr, double dienTich) {
        super(dienTich);
        this.cd = cd;
        this.cr = cr;
    }
     
    @Override
    public void dienTich(){
       Scanner myObj = new Scanner(System.in);
       System.out.println("Nhap chieu dai: ");
       float Cd = myObj.nextFloat();
       System.out.println("Nhap chieu rong: ");
       float Cr = myObj.nextFloat();
       float dt=Cd*Cr;
       System.out.println("Dien tich hinh chu nhat la: "+dt);
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }
       
}