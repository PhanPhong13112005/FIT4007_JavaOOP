import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int n = nhap.nextInt();//input
        int sum=0;
        for (int i=1; i <= n; i++)//process
        {
            sum+=i;
        }
        System.out.println("Tổng của số:" +n+", " + "là:" + sum);//output
    };
}