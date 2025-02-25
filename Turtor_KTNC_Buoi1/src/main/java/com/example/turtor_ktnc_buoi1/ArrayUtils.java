package com.example.turtor_ktnc_buoi1;

import java.util.Arrays;

public class ArrayUtils {
        public int findMax(int[] arrayNumber){
            if(arrayNumber == null || arrayNumber.length == 0){
                throw new IllegalArgumentException("Không được rỗng");
            }

            //c1: gán giá trị dầu tiên là max -> so sánh từng phần tử với max => max mới
            //c2: sử dungj thuật toán sắp xếp, sắp xếp theo chiều tăng/giẳm
            Arrays.sort(arrayNumber);
            int max = arrayNumber[arrayNumber.length-1];
            int index =- arrayNumber.length-1;
            System.out.println("Giá trị lớn nhất là:" + max + " và giá trị thứ"+index);
            return max;
        }
}
