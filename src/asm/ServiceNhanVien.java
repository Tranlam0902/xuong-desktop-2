/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ServiceNhanVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> ArrNV = new ArrayList<>();
    public void nhapTT(){
        do {            
            NhanVien nV = new NhanVien();
            nV.nhap();
            ArrNV.add(nV);
            System.out.println("ban co muon nhap tiep hay khong");
            if(sc.nextLine().equalsIgnoreCase("n")){
                break;
            }
        } while (true);
    }
    public void xuatTT(){
        for (NhanVien nv : ArrNV) {
            nv.xuat();
        }
    }
    public void timKiemNhanVien(){ 
       String searchMa;
        System.out.println("moi nhap ma can tim");
        searchMa = sc.nextLine();
        for (NhanVien nv : ArrNV) {
            if(nv.getMa().contains(searchMa))
                nv.xuat();
        }
}
    public void xoaTT(){
    String searchMa;
        System.out.println("moi nhap ma can xoa");
        searchMa = sc.nextLine();
        for(int i = 0;i < ArrNV.size();i++){
           if(ArrNV.get(i).getMa().contains(searchMa)){
               ArrNV.remove(i);
               System.out.println("da xoa thanh cong");
           }
               
        }
    }
    public void capNhat(){
       String searchMa;
        System.out.println("cap nhat ma: ");
        searchMa = sc.nextLine();
        for (NhanVien nv : ArrNV) {
            if(nv.getMa().contains(searchMa))
                nv.nhap();
        }
}
    public void timTheoLuong(){
       double luongMax,luongMin,hVi;
        do {            
            try {
                System.out.println("moi nhap luong max: ");
                luongMax = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                luongMax = -1;
                System.out.println("luong phai lon hon 0");
                continue;
            }
          if(luongMax < 0){
              System.out.println("gia phai lon hon 0");
          }
        } while (luongMax < 0);
        do {            
            try {
                System.out.println("moi nhap luong min: ");
                luongMin = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                luongMin = -1;
                System.out.println("luong phai lon hon 0");
                continue;
            }
   if(luongMin < 0 ){
       System.out.println("luong phai lon hon 0");
   }
        } while (luongMin < 0);
   if(luongMax<luongMin){
       hVi = luongMax;
       luongMax = luongMin;
       luongMin = hVi;
   }
        for (NhanVien nv : ArrNV) {
            if(nv.getLuong()>=luongMin&&nv.getLuong()<=luongMax){
                nv.xuat();
            }
        }
       
    }
    public void xapXepTheoThuNhap(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
              if(o1.getLuong()>o2.getLuong()){
                  return 1;
              } else if(o1.getLuong()<o2.getLuong()){
                  return -1;
              }else {
                  return 0;
              }
            }
        };
        Collections.sort(ArrNV, comp);
    }
    public void luongCaoNhat(){
     Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
              if(o1.getLuong()>o2.getLuong()){
                  return 1;
              } else if(o1.getLuong()<o2.getLuong()){
                  return -1;
              }else {
                  return 0;
              }
            }
        };
        Collections.sort(ArrNV, comp);
        Collections.reverse(ArrNV);
        if (ArrNV.size() > 5) {
            for (int i = 0;i < 5; i++ ){
                ArrNV.get(i).xuat();
            }
        } else {
            for (NhanVien nv : ArrNV) {
                nv.xuat();
            }
        }
    }
    public void xapXepHoTen(){
        
    }
}