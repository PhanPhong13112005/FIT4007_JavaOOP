import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập:");
        Scanner input = new Scanner(System.in);//variables
        Scanner inputNumber = new Scanner(System.in);//variables
        int n = input.nextInt();//input
        System.out.println("Số thứ 1: ");
        int nhap = inputNumber.nextInt();
        int min =  nhap;
        int max =  nhap;
        for (int i = 2; i<=n; i++ )
        {
            System.out.println("Số thứ "+ i + ": ");
            nhap = inputNumber.nextInt();//input
            if (nhap < min)
            {
                min = nhap;
            }
            else if (nhap > max)
            {
                max = nhap;
            }
        }
        System.out.println("Min: " + min);//output
        System.out.println("Max: " + max);//output
    }
}