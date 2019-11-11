package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Part1 {
    int[][] data = new int[6][7];
    void Init() {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(10);
            }
        }
    }
    void Sort() {
        for (int[] line : data) {
            Arrays.sort(line);
        }
    }
    void Print() {
        for (int[] line : data) {
            System.out.println(Arrays.toString(line));
        }
    }
}
