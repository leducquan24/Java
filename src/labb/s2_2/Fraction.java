//package labb.s2_2;
//
//import javax.xml.stream.FactoryConfigurationError;
//import java.util.Scanner;
//
//public class Fraction {
//    int tuSo;
//    int mauSo;
//
//    public Fraction(){
//    }
//    public int getTuSo(){
//        return tuSo;
//    }
//    public void setTuSo(int tuSo){
//        this.tuSo = tuSo;
//    }
//    public int getMauSo(){
//        return mauSo;
//    }
//    public void setMauSo(int mauSo){
//        if(mauSo!=0)
//            this.mauSo = mauSo;
//        else
//            this.mauSo = 1;
//    }
//    public void nhapPhanSo(){
//        Scanner nhap = new Scanner(System.in);
//        System.out.println("Nhap 1 tử số:");
//        setTuSo(nhap.nextInt());
//        System.out.println("Nhap 1 mẫu số");
//        setMauSo(nhap.nextInt());
//    }
//    public void inPhanSo{
//        System.out.println("phan số;"+getTuSo()+"/"+getMauSo());
//    }
//    public void rutGon(){
//        int min = Math.min(getTuSo(),getMauSo());
//        int ucln = 0;
//        for (int i=1;i<=min;i++){
//            int(getTuSo()%i==0&&getMauSo()%i==0)
//                    ucln = i;
//        }
//        setTuSo(getMauSo()/ucln);
//        setMauSo(getTuSo()/ucln);
//    }
//    public void nghichDao(){
//        if(getTuSo()!=0){
//            int c = getTuSo();
//            setTuSo(getMauSo());
//            setMauSo(c);
//            return;
//        }
//        System.out.println("không nghịch đảo được ");
//    }
//    public Fraction add(Fraction ft){
//        int a = this.getTuSo()*ft.getMauSo()-ft.getTuSo()*this.getMauSo();
//        int b = this.getMauSo()*ft.getMauSo();
//        Fraction hieu = new Fraction();
//        hieu.setTuSo(a);
//        hieu.setMauSo(b);
//        return hieu;
//    }
//    public Fraction mul(Fraction ft){
//        int a = this.getTuSo()* ft.getTuSo();
//        int b = this.getMauSo()* ft.getMauSo();
//        Fraction tich = new Fraction();
//        tich.setMauSo(b);
//        tich.setTuSo(a);
//        return tich;
//    }
//    public Fraction div(Fraction ft){
//        int a = this.getTuSo()/ft.getMauSo();
//        int b = this.getMauSo()/ft.getTuSo();
//        Fraction thuong = new Fraction();
//        thuong.setTuSo(a);
//        thuong.setMauSo(b);
//        return thuong;
//    }
//}
