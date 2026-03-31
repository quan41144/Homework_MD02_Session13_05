package hwss1305;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        int index = 0;
        while (true) {
            System.out.println("================ MENU ================");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Phân loại sinh viên theo GPA");
            System.out.println("0. Thoát chương trình");
            System.out.println("======================================");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên cần nhập vào (Tối thiểu 5 sinh viên): ");
                    int n;
                    do {
                        n = Integer.parseInt(sc.nextLine());
                        if (n < 5) {
                            System.out.println("Tối thiểu 5 sinh viên!");
                        }
                        else {
                            for (int i = 0; i < n; i++) {
                                System.out.println("Sinh viên thứ " + (i + 1) + ": ");
                                System.out.print("name: ");
                                String name = sc.nextLine();
                                System.out.print("GPA: ");
                                double gpa = Double.parseDouble(sc.nextLine());
                                manager.add(new Student(++index, name, gpa));
                            }
                        }
                    }while (n < 5);
                    break;
                case 2:
                    System.out.println("================== DANH SÁCH SINH VIÊN =================");
                    manager.display();
                    break;
                case 3:
                    System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
                    String name = sc.nextLine();
                    boolean isExist = false;
                    for (Student student : manager.list) {
                        if (student.getName().toLowerCase().contains(name)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Sinh viên có tên " + name + " không tồn tại!");
                        break;
                    }
                    manager.displayTK(name);
                    break;
                case 4:
                    manager.displayXS();
                    manager.displayG();
                    manager.displayK();
                    manager.displayTBY();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
