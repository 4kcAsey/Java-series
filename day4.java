import java.util.Scanner;

public class day4 {
    public static void sumA(int arr[],int x){
        int sum=0,max=0;
        for(int i=0;i<x;i++){
            max=Math.max(max, arr[i]);
        }
        for(int i=0;i<x;i++){
            if(arr[i]!=max){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum is " + sum);
    }
    public static void a_max(int arr[],int x){
        int m=0,flag=0, sum=0;
        int[] temp= new int[x];
        for(int i=0;i<x;i++){
            flag=0;
            int k=arr[i]/2;
            for(int j=2;j<k;j++){
                if(arr[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                temp[i]=arr[i];
                m=Math.max(m, arr[i]);
            }
        }  
        for(int i=0;i<x;i++)
        {
            if(temp[i]!=m){
                sum=sum+temp[i];
            }
        }
        System.out.println("sum is " +sum);
    }
    public static int checkprime(int arr[],int x){
        int f=0;
        for(int i=0;i<x;i++){
            f=0;
            int k=arr[i]/2;
            for(int j=2;j<k;j++){
                if(arr[i]%j==0){
                    f=1;
                    break;
                }
            }
        }
        return f;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int input2=sc.nextInt();
    int[] input1=new int[input2];
    for(int i=0;i<input2;i++)
    {
        input1[i]=sc.nextInt();
    }
    int flag=checkprime(input1,input2);
    if(flag==0)
        a_max(input1,input2);
    else
        sumA(input1,input2);
    sc.close();
}
}
