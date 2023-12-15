package com.practice.java.ch02_Variables;

public class Array2D {
    public static void main(String[] args) {
        //1. 2차원 배열 정의
        int[][] grades = {
            {80, 95, 92, 70},   //Jane
            {70, 99, 75, 100}   //Mike
        };

        //2. 2차원 배열 요스 접근 (예, grades[0][i])
        double sumJane = 0;
        for (int i=0; i < grades[0].length; ++i){
            int grade = grades[0][i];
            sumJane += grade;
        };
    }
}
