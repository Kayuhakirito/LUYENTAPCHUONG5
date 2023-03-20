/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author kayuh
 */
public class cxnt extends cx {

    private int st;
    private int skmdd;

    public cxnt(int st, int skmdd, int msc, String Httx, int sx, int dt) {
        super(msc, Httx, sx, dt);
        this.st = st;
        this.skmdd = skmdd;
    }
    
    @Override
    public void tdt(){
        System.out.println("Tong doanh thu chuyen xe noi thanh la: 100.000 ");
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public int getSkmdd() {
        return skmdd;
    }

    public void setSkmdd(int skmdd) {
        this.skmdd = skmdd;
    }
    
}
