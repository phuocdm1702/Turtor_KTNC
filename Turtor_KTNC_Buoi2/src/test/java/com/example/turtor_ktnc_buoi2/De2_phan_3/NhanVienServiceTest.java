package com.example.turtor_ktnc_buoi2.De2_phan_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class NhanVienServiceTest {
    NhanVienService nhanVienService = new NhanVienService();

    //    @Test
//    public void test() {
//        NhanVien nv1 = new NhanVien(1, "NV1", "Manh", "Phuoc", "SV", 3000);
//        NhanVien nv2 = new NhanVien(2, "NV2", "Manh", "Phuoc", "SV", 3000);
//        nhanVienService.addNhanVien(nv1);
//        nhanVienService.addNhanVien(nv2);
//        Assertions.assertEquals(2, nhanVienService.timTheoTenNV("Manh").size());
//    }
    @Test
    public void testNhanVien() {
        NhanVien nv1 = new NhanVien(1, "NV1", "Manh", "Phuoc", "SV", 3000);
        String exp = "Thêm nhân viên thành công!";
        String act= nhanVienService.addNhanVien(nv1);
        Assertions.assertEquals(exp,act);
    }


    @Test
    public void testNhanVien_maNV(){
        NhanVien nv1 = new NhanVien(1, "N1", "Manh", "Phuoc", "SV", 3000);
        String exp = "Thêm mã nhân viên nhân viên phải bắt đầu bằng NV!";
        String act= nhanVienService.addNhanVien(nv1);
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void TestNV_exp(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.timTheoTenNV(null));
    }
}