package RA.Program;

import RA.entity.Student;
import RA.itf.IStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("********************************MENU***************************");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Tính điểm trung bình sinh viên");
            System.out.println("3. Xét điểm qua cho xinh viên");
            System.out.println("4. Hiển thị thông tin sinh viên");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Số lượng sinh viên muốn nhập thông tin:");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= n; i++) {
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                    }
                    break;
                case 2:
                    for (Student st:list){
                        st.calTB();
                    }
                    break;
                case 3:
                    for (Student st:list){
                        st.check();
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sinh viên:");
                    System.out.printf("%5s %20s %5s %10s %10s %10s %10s %10s \n", "Mã SV", "Họ và tên", "Tuổi", "Toán", "Lý", "Hóa","Điểm TB","Xếp loại" );
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (Student student : list) {
                        if (student != null) {
                            student.displayData();
                            System.out.println("____________________________________________________________________");
                        }
                    }
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không phù hợp");
            }
        } while (true);
    }
}
