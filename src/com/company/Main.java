package com.company;

public class Main {

    public static void main(String[] args) {
        double[] num = new double[15];
        num[0] = 1.0;
        num[1] = 2.6;
        num[2] = -3.8;
        num[3] = 6.7;
        num[4] = 6.9;
        num[5] = 6.8;
        num[6] = 8.7;
        num[7] = 10.2;
        num[8] = 100.2;
        num[9] = 9.5;
        num[10] = 11.5;
        num[11] = 4.8;
        num[12] = 12.3;
        num[13] = 11.1;
        num[14] = 9.0;

        for (int i = 0; i < num.length; i++) {
            continue;


        }

        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Сумма = " + sum);
        double average = sum / num.length;
        System.out.println("Среднее арифметическое = " + average);

    }
}
