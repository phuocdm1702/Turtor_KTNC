package com.example.turtor_ktnc_buoi1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XepLoaiHocLucTest {
    XepLoaiHocLuc hocLuc = new XepLoaiHocLuc();
    @Test
    public void testXepLoaiHocLuc_95(){
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLucs(9.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXepLoaiHocLuc_85(){
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLucs(8.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXepLoaiHocLuc_75(){
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLucs(7.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXepLoaiHocLuc_6(){
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLucs(6);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXepLoaiHocLuc_3(){
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLucs(3);
        Assertions.assertEquals(exp, act);
    }

    //điểm TB 15
//    @Test
//    public void testHLEx_min(){
//        Assertions.assertThrows(IllegalArgumentException.class () -> hocLuc.xepLoaiHocLucs(15))
//    }
}