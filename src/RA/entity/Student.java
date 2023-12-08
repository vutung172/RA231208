package RA.entity;

import RA.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentID;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;

    public Student() {
    }

    public Student(String studentID, String studentName, int age, float diemToan, float diemLy, float diemHoa, float diemTB) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTB = diemTB;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID: ");
        studentID = sc.nextLine();
        System.out.println("Nhập vào học và tên sinh viên: ");
        studentName = sc.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào điểm Toán: ");
        diemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào điểm Lý: ");
        diemLy = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào điểm Hóa: ");
        diemHoa = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("%5s %15s %8s %8s %8s %8s %8s %8s \n ",studentID,studentName,age,diemToan,diemLy,diemHoa,diemTB,check()?"pass":"fail");
    }

    public float calTB(){
        return diemTB = (diemToan+diemLy+diemHoa)/3;
    }

    public boolean check(){
        if (diemTB > MARK_PASS) {
            return true;
        } else {return false;}
    }


}
