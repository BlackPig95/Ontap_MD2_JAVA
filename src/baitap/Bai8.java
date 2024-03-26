package baitap;

import java.util.Scanner;

public class Bai8
{
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai8();
    }

    //Bài 8: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số phần
    //tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
    //phần tử có chỉ số updateIndex
    public static void bai8()
    {
        System.out.println("Nhập số phần tử muốn có trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] bai8Array = new int[n];
        for (int i = 0; i < bai8Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai8Array[i] = Integer.parseInt(scanner.nextLine());
        }
        int updateIndex = 0;
        while (true)
        {
            System.out.println("Nhập vị trí muốn thay đổi");
            updateIndex = Integer.parseInt(scanner.nextLine());
            if (updateIndex < 0 || updateIndex > n - 1)
            {
                System.out.println("Vui lòng nhập chỉ mục trong phạm vi của mảng");
            } else break;
        }
        System.out.println("Nhập giá trị muốn thay đổi");
        int updateValue = Integer.parseInt(scanner.nextLine());
        bai8Array[updateIndex] = updateValue;
        for (int i : bai8Array)
            System.out.print(i + " ");
    }
}
