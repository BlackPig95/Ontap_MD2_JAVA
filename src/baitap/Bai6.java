package baitap;

import java.util.Scanner;

public class Bai6
{
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai6();
    }

    //Bài 6: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập vào một giá trị (findNumber), in ra
    //chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber
    public static void bai6()
    {
        System.out.println("Nhập số phần tử muốn có trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] bai6Array = new int[n];
        for (int i = 0; i < bai6Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai6Array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập giá trị muốn tìm");
        int findNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < bai6Array.length; i++)
        {
            if (bai6Array[i] == findNumber)
                System.out.print("Index: " + i + " ");
            System.out.println("Số trùng khớp: " + bai6Array[i]);
        }
    }
}
