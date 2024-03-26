package baitap;

import java.util.Scanner;

public class Bai2
{
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai2();
    }

    //Bài 2: Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá
    //trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị
    //trung bình cộng của các phần tử trong mảng
    public static void bai2()
    {
        System.out.println("Nhập số phần tử muốn có trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        double[] bai2Array = new double[n];
        double sum = 0;
        for (int i = 0; i < bai2Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai2Array[i] = Double.parseDouble(scanner.nextLine());
            sum += bai2Array[i];
        }
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng: " + (sum / n));
    }
}
