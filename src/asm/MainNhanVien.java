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
public class MainNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceNhanVien nVien = new ServiceNhanVien();
        int chon;
        do { 
               System.out.println("========MENU========");
        System.out.println("1.nhap danh sach sinh vien");
        System.out.println("2.xuat danh sach sinh vien");
        System.out.println("3.tim va hien thi danh sach");
        System.out.println("4.xoa nhan vien theo ma");
        System.out.println("5.cap nhat nhan vien theo ma");
        System.out.println("6.tim nhan vien theo khoang luong");
        System.out.println("7.sap xep nhan vien theo ho ten");
        System.out.println("8.sap xep nhan vien theo thu nhap");
        System.out.println("9.xuat 5 sinh vien co thu nhap cao nhat");
        System.out.println("========MENU========");
            System.out.println("nhap vao lua chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nVien.nhapTT();
                    break;
                     case 2:
                    nVien.xuatTT();
                    break;
                     case 3:
                   nVien.timKiemNhanVien();
                    break;
                     case 4:
                    nVien.xoaTT();
                    break;
                     case 5:
                    nVien.capNhat();
                    break;
                     case 6:
                    nVien.timTheoLuong();
                    break;
                     case 7:
                    
                    break;
                     case 8:
                    nVien.xapXepTheoThuNhap();
                    nVien.xuatTT();
                    break;
                     case 9:
                    nVien.luongCaoNhat();
                    break;
                     case 0:
                         System.exit(0);
                    break;                   
                default:
                    System.out.println("moi ban nhap lai");
            }
        } while (true);
    }
  
}
