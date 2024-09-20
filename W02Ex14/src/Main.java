import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Variables
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số: ");//output
        int n = nhap.nextInt();//input
        int sum=0;
        if (n%2==0)//process
        {
            for (int i=1; i <= n; i++)
            {
                sum+=i;
            }
            System.out.println("Tổng của số:" +n+", " + "là:" +sum);//output

        }
        else
        {
            for (int i=2; i <= n; i+=2)
            {
                sum+=i;
            }
            System.out.println("Tổng của số:" +n+", " + "là:" +sum);//output
        }
    };
}