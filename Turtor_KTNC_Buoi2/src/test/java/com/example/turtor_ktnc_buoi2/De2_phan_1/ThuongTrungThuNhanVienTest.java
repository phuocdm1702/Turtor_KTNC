package com.example.turtor_ktnc_buoi2.De2_phan_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThuongTrungThuNhanVienTest {
    ThuongTrungThuNhanVien nhanVien = new ThuongTrungThuNhanVien();

    @Test
    public void testSoNam_25() {
        String exp = "Thưởng 3 triệu";
        String act = nhanVien.soNamLamViec(2.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSoNam_5() {
        String exp = "Thưởng 10 triệu";
        String act = nhanVien.soNamLamViec(5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSoNam_8() {
        String exp = "Thưởng 20 triệu";
        String act = nhanVien.soNamLamViec(8);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSoNam_15() {
        String exp = "Thưởng 40 triệu";
        String act = nhanVien.soNamLamViec(15);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSoNam_Am_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVien.soNamLamViec(-1));
    }


}