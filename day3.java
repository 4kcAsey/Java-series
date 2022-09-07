import java.util.*;
public class day3 {
    public static int M(int n){
        int term=0, small=9, large=0;
        while(n!=0){
            int a=n%10;
            small=Math.min(a, small);
            large=Math.max(a, large);
            n=n/10;
        }
        term=(small*large);
        return term;
    }
    public static int GeneratePin(int intput1, int intput2, int intput3, int intput4)
    {
        if((intput1>=1000 && intput1<=9999) && (intput2>=1000 && intput2<=9999) && (intput3>=1000 && intput3<=9999) && intput4>=0 )
            return ((M(intput1)+M(intput2)+M(intput3))-intput4);
        else {   
            return -999;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int intput1=sc.nextInt(),intput2=sc.nextInt(),intput3=sc.nextInt(),intput4=sc.nextInt();
        int pin=GeneratePin(intput1,intput2,intput3,intput4);
        if(pin!=-999){
            System.out.println("The PIN is " + pin);
        }
        else
            System.out.println("Incorrect Data");
        sc.close();
    }
}
