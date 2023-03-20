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
public class HinhTron extends Hinh {
    private float r;
    private double pi=3.14;

    public HinhTron(float r, double dienTich) {
        super(dienTich);
        this.r = r;
    }
    
    @Override
    public void dienTich(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        float R = myObj.nextFloat();
        float dt=(float) (pi*R*R);
        System.out.println("Dien tich hinh tron la: "+dt);
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    
}