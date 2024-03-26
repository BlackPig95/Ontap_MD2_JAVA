package baitap;

import java.util.Scanner;

public class Bai3
{
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai3();
    }

    //Bài 3: Nhập vào số dòng và cột của mảng 2 chiều (row * col), khai báo và
    //nhập giá trị các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử
    //mảng theo ma trận
    public static void bai3()
    {
        System.out.println("Nhập số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] bai3Array = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.printf("Nhập phần tử thuộc dòng %d, cột %d \n", i, j);
                bai3Array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int[] rows : bai3Array)
        {
            for (int number : rows)
            {
                System.out.printf("%-4d", number);
            }
            System.out.println();
        }
    }
}
