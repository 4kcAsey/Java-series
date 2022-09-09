import java.util.Scanner;

public class day5 {
    static int SumOfNonPrimeIndex(int intput1[], int intput2)
        {
            int sum=0,flag=0;
            for(int i=0;i<intput2;i++)
            {   
                flag=0;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1 || i==1 || i==0)
                {
                    sum=sum+intput1[i];
                }
            }
            return sum;
        }
 public static void main(String args[])
    {
        System.out.println(Math.sqrt(20));
        Scanner sc=new Scanner(System.in);
       
        int intput2=sc.nextInt();
        int[] intput1=new int[intput2];
        
        for(int i=0;i<intput2;i++){
            intput1[i]=sc.nextInt();
        }
        System.out.println("The sum is " +SumOfNonPrimeIndex(intput1,intput2));
        sc.close();
    }
}