package com.example.turtor_ktnc_buoi2.De2_phan_3;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> listNhanVien = new ArrayList<>();

//    public void addNhanVien(NhanVien nhanVien){
//        listNhanVien.add(nhanVien);
//    }

    public String addNhanVien(NhanVien nhanVien){
        if(nhanVien.getCodeEmployee().startsWith("NV")) {
            listNhanVien.add(nhanVien);
            return "Thêm nhân viên thành công!";
        }else {
            return "Thêm mã nhân viên nhân viên phải bắt đầu bằng NV!";
        }
    }

    public List<NhanVien> timTheoTenNV(String FirstName){
        if (FirstName == null || FirstName.isEmpty()){
            throw new IllegalArgumentException("Tên Nhân viên không được để trống!");
        }
       List<NhanVien> ketQua = new ArrayList<>();
       for(NhanVien nv : listNhanVien){
           if(nv.getFirstName().equalsIgnoreCase(FirstName)){
               ketQua.add(nv);
           }
       }
       return ketQua;
    }
}
