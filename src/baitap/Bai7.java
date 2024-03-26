package baitap;

import java.util.Scanner;

public class Bai7
{
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

    }

    //Bài 7: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập giá trị (addValue) và chỉ số chèn
    //phần tử vào mảng (addIndex), thực hiện thêm chèn giá trị addValue và chỉ
    //số addIndex của mảng
    public static void bai7()
    {
        System.out.println("Nhập số phần tử muốn có trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] bai7Array = new int[n];
        for (int i = 0; i < bai7Array.length; i++)
        {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            bai7Array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập giá trị muốn thêm");
        int addValue = Integer.parseInt(scanner.nextLine());
        int addIndex;
        //Nhập chỉ số index
        while (true)
        {
            System.out.println("Nhập vị trí muốn thêm");
            addIndex = Integer.parseInt(scanner.nextLine());
            if (addIndex < 0 || addIndex > n)
            {
                System.out.println("Vui lòng chọn vị trí chèn trong phạm vi số phần tử của mảng");
            } else break;
        }
        int[] newArray = new int[n + 1];//Tăng số phần tử thêm 1
        newArray = bai7Array.clone();//Primitive type nên thay đổi giá trị của element
        // trên array mới sẽ không ảnh hưởng array cũ
        //Bắt đầu từ phần tử cuối, shift element sang phải
        for (int i = n - 1; i > addIndex; i--)
        {
            newArray[i] = newArray[i - 1];
        }
        newArray[addIndex] = addValue;//Thêm giá trị vào vị trí mong muốn
        System.out.println("Array cũ");
        for (int i : bai7Array)
        {
            System.out.println(i + " ");
        }
        System.out.println("Array mới");
        for (int i : newArray)
        {
            System.out.print(i + " ");
        }
        //Cách 2:
//        for(int i = 0; i < newArray.length; i++)
//        {
//            if(i < addIndex)
//                newArray[i] = bai7Array[i];
//            else if(i>addIndex)
//                newArray[i] = bai7Array[i-1];
//            else newArray[i] = addValue;
//        }
    }
}
