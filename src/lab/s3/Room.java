package lab.s3;

public class Room {
    public static void main(String[] args()){
        Room r = new Room();
        r.setName("Phong so 1");
        r.setPosition("Tang 2");
        r.addUser("Phạm Thị Ngọc Diệp");
        r.addUser("Bùi Tiến Dũng");
        r.addUser("Lê Đức Quân");
        r.removeUser(2);
        for(String s: r.users){ // foreach
            System.out.println(s);
        }
    }
}
