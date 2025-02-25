package com.example.turtor_ktnc_buoi2.De2_phan_1;

public class ThuongTrungThuNhanVien {

    public String soNamLamViec(double soNam){
        if(soNam < 0){
            throw  new IllegalArgumentException("Số năm không được < 0!");
        }
        if(soNam < 3){
            return "Thưởng 3 triệu";
        } else if (soNam <= 6) {
            return "Thưởng 10 triệu";
        } else if (soNam <= 10) {
            return "Thưởng 20 triệu";
        } else {
            return "Thưởng 40 triệu";
        }
    }
}
