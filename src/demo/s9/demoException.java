//package demo.s9;
//
//import java.util.Scanner;
//
//public class demoExceptinon {
//    public static void main(String[] args){
//        int z=0;
//        try {
//            // code can chay ma co the xay ra ngoai le
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            if (y>5){
//                throw new ArithmeticException("Nhap so to qua roi");
//            }
//            x++;
//            y--;
//            z = x / y;
//            System.out.println("z = " + z);
//        }catch(ArithmeticException a){
//            System.out.println(a.getMessage());
//        }catch (Exception e){
//            //nhung viec se lam khi xay ra ngoai le
//            System.out.println("Nhap lai...");
//        }finally {
//            if (z==0)
//                System.out.println("z = "+ (z++));
//            else
//                System.out.println("z = "+z);
//        }
//    }
//}
