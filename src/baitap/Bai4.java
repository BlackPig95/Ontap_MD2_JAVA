package baitap;

import java.util.Arrays;

public class Bai4
{
    public static void main(String[] args)
    {
        bai4();
    }

    //Bài 4: Nhập số phần tử và giá trị các phần tử của mảng một chiều số
    //nguyên. Tìm giá trị lớn nhất và nhỏ nhất trong mảng
    public static void bai4()
    {
        System.out.println("Nhập số phần tử muốn có trong mảng");
        int n = Integer.parseInt(Bai1.scanner.nextLine());
        int[] bai4Array = new int[n];
        for (int i = 0; i < bai4Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai4Array[i] = Integer.parseInt(Bai1.scanner.nextLine());
        }
        int min = bai4Array[0];
        int max = bai4Array[0];
        for (int num : bai4Array)
        {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        System.out.printf("Số lớn nhất trong mảng là %d, số nhỏ nhất trong mảng là %d\n", max, min);
//        System.out.println("Lớn nhất " + Arrays.stream(bai4Array).max().orElse(-1));
//        System.out.println("Nhỏ nhất " + Arrays.stream(bai4Array).min().orElseThrow());
    }
}
