package demo.s9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DemoDateTime {
    public static void main(String[] args){
//        LocalDate ld = LocalDate.now();
//        System.out.println("Hom nay :"+ld);
//        System.out.println("Ngay mai:"+ld.plusDays(1));
//        System.out.println("Ngay kia:"+ld.plusDays(2));
//        System.out.println("Ngay nay nam sau:"+ld.plusYears(1));
//        System.out.println("Ngay nay tuan sau"+ld.plusWeeks(1));
//        System.out.println("Hom nay la ngay thu:"+ld.getDayOfYear() +"cau nam");
//        System.out.println("Hom nay la ngay thu:"+ld.getDayOfMonth() + "cau thang");
//        System.out.println("Dang la thang:"+ld.getMonthValue());
//        System.out.println("Dang la thang:"+ld.getMonth());
//        System.out.println("Dang la thu:"+ld.getDayOfWeek());
//
//        LocalDate ld2 = LocalDate.parse("1999-10-12");
//        int ngay = ld2.getDayOfMonth();
//        int thang = ld2.getMonthValue();
//        if(ngay == ld.getDayOfMonth() && thang == ld.getMonthValue()){
//            System.out.println("Happy birthday!");
//        }
//        LocalDate ld3= LocalDate.of(2000,3,16);
//        int ngay2 = ld3.getDayOfMonth();
//        int thang2 = ld3.getMonthValue();
//        if (ngay2 == ld.getDayOfMonth() && thang2 == ld.getMonthValue()){
//            System.out.println("Happy birhtday");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao nam muon kiem tra:");
//        int y = sc.nextInt();
//        LocalDate nn = LocalDate.of(y,12,31);
//        if (nn.getDayOfYear()== 366){
//            System.out.println("Day la nam nhuan");
//        }
//        LocalDate nn2 = LocalDate.of(y,2,28);
//        if (nn2.plusDays(1).getDayOfMonth() == 29){
//            System.out.println("Day la nam nhuan");
//        }
        LocalDateTime t = LocalDateTime.now();
        System.out.println("ngay luc nay:"+t);
        System.out.println("Ngay mai vao luc nay:"+t.plusDays(1));
        System.out.println("Mot luc nua:"+t.plusMinutes(15));
        System.out.println("mot tieng nua:"+t.plusHours(1));
        System.out.println("mot teo nua:"+t.plusSeconds(10));
        System.out.println("mot teo nua:"+t.plusNanos(99));

        LocalDateTime t2 = LocalDateTime.of(2021,3,6,11,30,15,55);
    }
}
