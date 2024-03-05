public class NhanVien {
    public int ten;
    public String chucVu;
    public int tuoi;
    public double luong;


    public NhanVien(String ten, String chucVu, int tuoi, double luong) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.tuoi = tuoi;
        this.luong = luong;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Lương: " + luong);
    }
}
