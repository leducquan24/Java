package lab.s8_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (flag){
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Them SV");
            System.out.println("2. Sua thong tin SV");
            System.out.println("3. Xoa thong tin SV");
            System.out.println("4. Sap xep SV theo GPA");
            System.out.println("5. Sap xep SV theo ten");
            System.out.println("6. In ra danh sach");
            System.out.println("0. Exit");
            int c = sc.nextInt();
            if(c==0){
                flag = false;
            }else if (c == 1){
                System.out.println("Nhap id sv:");
                int id = sc.nextInt();
                System.out.println("Nhap ten sv:");
                String name = sc.next();
                System.out.println("Nhap tuoi:");
                int age = sc.nextInt();
                System.out.println("Nhap dia chi:");


            }
        }
    }
}
