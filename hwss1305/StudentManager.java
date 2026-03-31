package hwss1305;

import java.util.ArrayList;

public class StudentManager implements Manage<Student>{
    ArrayList<Student> list = new ArrayList<Student>();
    @Override
    public void add(Student item) {
        list.add(item);
    }

    @Override
    public void display() {
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void displayTK(String name) {
        System.out.println("Danh sách sinh viên có tên " + name + ":");
        for (Student item : list) {
            if (item.getName().toLowerCase().contains(name)) {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public void displayXS() {
        System.out.println("===== Danh sách sinh viên xếp loại xuất sắc =====");
        boolean isExist = false;
        for (Student item : list) {
            if (item.getGpa() >= 8.5) {
                System.out.println(item.toString());
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên đạt loại xuất sắc nào!");
        }
    }

    @Override
    public void displayG() {
        System.out.println("===== Danh sách sinh viên xếp loại giỏi =====");
        boolean isExist = false;
        for (Student item : list) {
            if (item.getGpa() >= 7.0 && item.getGpa() < 8.5) {
                System.out.println(item.toString());
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên đạt loại giỏi nào!");
        }
    }

    @Override
    public void displayK() {
        System.out.println("===== Danh sách sinh viên xếp loại khá =====");
        boolean isExist = false;
        for (Student item : list) {
            if (item.getGpa() >= 5.5 && item.getGpa() < 7.0) {
                System.out.println(item.toString());
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên đạt loại khá nào!");
        }
    }

    @Override
    public void displayTBY() {
        System.out.println("===== Danh sách sinh viên xếp loại trung bình / yếu =====");
        boolean isExist = false;
        for (Student item : list) {
            if (item.getGpa() < 5.5) {
                System.out.println(item.toString());
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên đạt loại trung bình / yếu nào!");
        }
    }
}
