package baitap;

import java.util.Scanner;

public class Bai9
{
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bai9();
    }

    //Bài 9: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
    //và thực hiện xóa phần tử trong mảng theo deleteIndex
    public static void bai9()
    {
        System.out.println("Nhập số phần tử muốn có trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] bai9Array = new int[n];
        for (int i = 0; i < bai9Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai9Array[i] = Integer.parseInt(scanner.nextLine());
        }
        int deleteIndex = 0;
        while (true)
        {
            System.out.println("Nhập vị trí muốn xóa");
            deleteIndex = Integer.parseInt(scanner.nextLine());
            if (deleteIndex < 0 || deleteIndex > n - 1)
            {
                System.out.println("Vui lòng nhập chỉ mục trong phạm vi của mảng");
            } else break;
        }
        for (int i = deleteIndex; i < n - 1; i++)
        {   //Shift element sang trái
            bai9Array[i] = bai9Array[i + 1];
        }
        int[] newArray = new int[n - 1];//Tạo mảng mới, giảm số phần tử đi 1
        for (int i = 0; i < n - 1; i++)//Copy các phần tử của mảng cũ sang mảng mới
        {
            newArray[i] = bai9Array[i];
            System.out.print(newArray[i] + " ");
        }
    }
}
