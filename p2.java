import java.util.Scanner;

public class p2 {
    public static String UserIDGeneration(String input1, String input2, int input3, int input4 )
                {
                    String str="",small="",large="",s="";
                    String pin=String.valueOf(input3); StringBuilder pin_r=new StringBuilder();
                    pin_r.append(pin); pin_r.reverse();
                    if(input1.length()<input2.length())
                    {
                        small=input1;
                        large=input2;
                    }
                    else if(input2.length()<input1.length()){
                        small=input2;
                        large=input1;
                    }
                    else if(input1.length()==input2.length()){
                        if(input1.compareTo(input2)>0){
                            small=input2;
                            large=input1;
                        }
                        else{
                            small=input1;
                            large=input2;
                        }
                    }
                    str+=small.charAt(0)+large+pin.charAt(input4-1)+pin_r.charAt(input4-1);
                    System.out.println(str);
                    for(int i=0;i<str.length();i++){
                        if(Character.isLowerCase(str.charAt(i))){ 
                            s+=Character.toUpperCase(str.charAt(i));
                        }
                        else
                            s+=Character.toLowerCase(str.charAt(i));
                    }
                    return s;
                }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine(), input2=sc.nextLine();
        int pin=sc.nextInt(),n=sc.nextInt();
        sc.close();;
        System.out.println(UserIDGeneration(input1,input2,pin,n));
    }
}
