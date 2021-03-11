package lab.s6;

public class Main {
    public static void main(String[] args){
        PhoneBook pd = new PhoneBook();
        pd.insertPhone("Quan","0123456789");
        pd.insertPhone("An","0123546798");
        pd.insertPhone("Diep","012345559");
        pd.insertPhone("Hung","648236448");
        System.out.println("Danh sach cua ban dau:");
        pd.print();
        pd.sort();
        System.out.println("Danh sach da duoc sap xep theo thu tu:");
    }
}
