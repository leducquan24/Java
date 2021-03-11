package lab.s4_2;

import java.util.ArrayList;

public class LopHoc {
    int id;
    String name;
    String room;
    ArrayList<SinhVien> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public ArrayList<SinhVien> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<SinhVien> students) {
        this.students = students;
    }
}
