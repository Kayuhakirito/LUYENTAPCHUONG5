/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author kayuh
 */
public class cxngt extends cx {
    
    private String nd;
    private int sndd;

    public cxngt(String nd, int sndd, int msc, String Httx, int sx, int dt) {
        super(msc, Httx, sx, dt);
        this.nd = nd;
        this.sndd = sndd;
    }
    
    @Override
    public void tdt(){
        System.out.println("Tong doanh thu chuyen xe ngoai thanh la: 95.000 ");
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public int getSndd() {
        return sndd;
    }

    public void setSndd(int sndd) {
        this.sndd = sndd;
    }
    
}