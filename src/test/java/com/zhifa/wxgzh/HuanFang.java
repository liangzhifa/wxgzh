package com.zhifa.wxgzh;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HuanFang {
    public static void main(String[] args) {
        int[][] huanFang = new int[4][4];
        //初始化幻方数据
        huanFang[0][0] = 4;
        huanFang[0][1] = 5;
        huanFang[1][2] = 7;
        huanFang[2][0] = 15;
        huanFang[2][1] = 10;
        huanFang[3][2] = 12;
        huanFang[3][3] = 13;
        //剩下的1-16数字
        Set<Integer> remain = new TreeSet<Integer>();
        remain.add(1);
        remain.add(2);
        remain.add(3);
        remain.add(6);
        remain.add(8);
        remain.add(9);
        remain.add(11);
        remain.add(14);
        remain.add(16);
        //遍历这个二维数组，填入数据
        for (int i = 0; i < huanFang.length; i++) {
            for (int j = 0; j < huanFang[0].length; j++) {
                if (huanFang[i][j] == 0) {//=0就是没初值

                }


            }
        }

    }
}
