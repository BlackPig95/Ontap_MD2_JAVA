package baitap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Bai5
{
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai5();
    }

    //Bài 5: Nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và
    //nhập giá trị các phần tử mảng 2 chiều số thực (row*col), in ra gia tri các
    //phần tử có giá trị chẵn và tính tổng các phần tử đó
    public static void bai5()
    {
        System.out.println("Nhập số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());
        double[][] bai5Array = new double[row][col];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.printf("Nhập phần tử thuộc dòng %d, cột %d \n", i, j);
                bai5Array[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        double sumDouble = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (bai5Array[i][j] % 2 == 0)
                {
                    System.out.println("Số chẵn: " + bai5Array[i][j]);
                    sumDouble += bai5Array[i][j];
                }
            }
        }
        System.out.println("Tổng của các phần tử chẵn trong mảng: " + sumDouble);
        System.out.println("Tổng các phần tử chẵn: " +
                Arrays.stream(bai5Array).flatMapToDouble(rows ->
                                Arrays.stream(rows)).filter(num -> num % 2 == 0).
                        reduce(0, (accumulator, num) -> accumulator + num));
//        System.out.println("Tổng các phần tử chẵn: " +
//                Arrays.stream(bai5Array).flatMapToDouble(Arrays::stream).filter(num -> num % 2 == 0).
//                        reduce(0, Double::sum));
    }
}
