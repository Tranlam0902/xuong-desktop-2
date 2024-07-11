/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVien {
    Scanner sc = new Scanner(System.in);
   private String ma;
   private String ten;
   private double luong;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public NhanVien(String ma, String ten, double luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }

    public NhanVien() {
    }
   public void nhap(){
       System.out.println("moi nhap ma nhan vien: ");
       ma = sc.nextLine();
       System.out.println("moi nhap ten nhan vien: ");
       ten = sc.nextLine();
       do {           
           try {
               System.out.println("moi nhap luong nhan vien: ");
               luong = Double.parseDouble(sc.nextLine());
           } catch (Exception e) {
               luong = -1;
               System.out.println("luong phai lon hon 0");
               continue;
           }
           if(luong < 0){
               System.out.println("luong phai lon hon 0");
           }
       } while (luong < 0);
   }
   public void xuat(){
       System.out.println("ma nhan vien: "+ma);
       System.out.println("ten nhan vien: "+ten);
       System.out.println("luong nhan vien: "+luong);
       
   }
}
