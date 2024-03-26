package baitap;

import java.util.Scanner;

public class Bai1
{
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai1();
    }

    //Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần
    //tử từ bàn phím và in ra giá trị các phần tử của mảng
    public static void bai1()
    {
        int[] bai1Array = new int[5];
        for (int i = 0; i < bai1Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai1Array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i : bai1Array)
            System.out.print(i + " ");
    }
}
