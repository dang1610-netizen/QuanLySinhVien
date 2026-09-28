package quanlysinhvien;
import java.util.Scanner;
public class sinhvien {
    private String maSv,hoTen;
    private float diem;

    public sinhvien() {
    }

    public sinhvien(String maSv, String hoTen, float diem) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    public void nhap(Scanner sc)
    {
        System.out.print("Mã sinh viên: ");
        maSv=sc.nextLine();
        System.out.print("Họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Điểm: ");
        diem=sc.nextFloat();
    }
    
    
   
            
            
          
            
}
