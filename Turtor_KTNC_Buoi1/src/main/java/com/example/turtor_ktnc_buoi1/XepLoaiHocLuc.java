package com.example.turtor_ktnc_buoi1;

public class XepLoaiHocLuc {
    //Kết quả trả về là String
    public String xepLoaiHocLucs(double diemTB) {
        if (diemTB >= 9.0) {
            return "Xuất sắc";
        } else if (diemTB >= 7.0) {
            return "Giỏi";
        } else if (diemTB >= 6.0) {
            return "Khá";
        } else if (diemTB >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}
