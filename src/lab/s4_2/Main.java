package lab.s4_2;

public class Main {
    public static void main(String[] args){
        SinhVien s1 = new SinhVien();
        s1.setId(1);
        s1.setFullName("Lê đức quân");
        s1.setTel("0987654091");
        s1.setAddress("521 nguyen trai");

        SinhVien s2= new SinhVien();
        s2.setId(2);
        s2.setFullName("ngô hồng phong");
        s2.setTel("123389789");
        s2.setAddress("20 nguyen phuc lai");

        LopHoc lh = new LopHoc();
        lh.setId(1);
        lh.setName("T2009M");
        lh.setRoom("A8");
        lh.addStudent(s1);
        lh.addStudent(s2);
        lh.printStudents();
    }
}
