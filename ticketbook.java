
import java.util.*;

public class ticketbook{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a [][][]=new int[n][n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    a[i][j][k]=sc.nextInt();
        System.out.println("Welcome to Sathyam Cinemas Enjoy your Snaks!");
        System.out.println("Enter Your Screen No:");
        int scr=sc.nextInt();
        System.out.println("ENTER THE ROW NO:");
        int row=sc .nextInt();
        System.out.println("ENTER THE SEAT NO");
        int seat=sc.nextInt();
        System.out.println("Rate:"+a[scr-1][row-1][seat-1]);




    }

}

