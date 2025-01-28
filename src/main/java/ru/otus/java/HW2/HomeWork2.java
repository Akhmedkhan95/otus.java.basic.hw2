package ru.otus.java.HW2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        printRepeat(5, "Учись!!!");
        sumArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        fillArray(5, new int[10]);
        fillArrayValue(3, new int[]{2, 3, 4, 5, 6, 7, 8, 9});
        comparison(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void printRepeat(int a, String string) {
        for (int i = 0; i < a; i++) {
            System.out.println(i + 1 + " " + string);
        }
    }

    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 5) {
                sum += arr[j];
            }

        }
        System.out.println("Сумма массива = " + sum);
    }

    public static void fillArray(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArrayValue(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void comparison(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumRight += arr[i];
        }
        if (sumLeft > sumRight) {
            System.out.println("Сумма левых чисел равна:" + sumLeft);
        } else if (sumLeft < sumRight) {
            System.out.println("Сумма правых числе равна:" + sumRight);
        }
    }
}

