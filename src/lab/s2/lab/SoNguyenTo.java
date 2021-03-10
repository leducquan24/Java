package lab.s2.lab;

public class SoNguyenTo {
    public int a;

    public SoNguyenTo(){
        setA(2);
    }
    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        for (int i=2;i<=x/2;i++){
            if (x%i=0) return false;
        }
        return true
    }

    public void timSoNguyenToTiepTheo(){
        for (int i=a+1;true;i++){
            // kiem tra xem coi i co phai là số nguyên tố hay không
            if (isSoNguyenTo(i)){
                setA(i);
                return;
            }
        }
    }
    public int getA(){
        return
    }

    public void setA(int a){
        if (SoNguyenTo(a))
            this.a = a;
        System.out.println("khong set");
    }
}
