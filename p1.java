import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p1 {
    public static String StringDigitCheck(String input1, int input2){
        String sum="ZERO";
        int sum1=0;
        for(int i=0;i<input1.length();i++){
            if(Character.isDigit(input1.charAt(i))){
                sum1+=Integer.parseInt(String.valueOf(input1.charAt(i)));
                sum=String.valueOf(sum1);
            }                
        }
        return sum;
    }
    public static String checkpalindrome(String input1,int input2){
        String word="",str="";
        int flag=0;
        for(int i=0;i<input1.length();i++){
            flag=0;
            if((input1.charAt(i)>='a' && input1.charAt(i)<='z' )|| (input1.charAt(i)>='A' && input1.charAt(i)<='Z')){
                word+=input1.charAt(i);
                flag=1;
            }
        }
        if(flag==1)
            str=isPalindrome(word);
        else
            str="UNKNOWN";
        return str;
    }
    public static String isPalindrome(String str)
    {
        String ans = "NP";
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = "P";
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        Pattern p = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher m = p.matcher(input1);
        boolean b = m.find();
        if(input1.length()==0){
            System.out.println("EMPTY");
        }
        else if(b){
            System.out.println("INVALID");
        }    
        if(input1.length()!=0 && !b){
        int input2=Math.abs(sc.nextInt()), flag=0;
            for(int i=2;i<Math.sqrt(input2);i++){
                int k=(int) Math.pow(i,2);
                flag=0;
                if(input2%k==0){
                    flag=1;
                    break;
                }
            }
        if(flag==0)
            System.out.println(""+StringDigitCheck(input1,input2));    
        else
            System.out.println(""+checkpalindrome(input1,input2)); 

        sc.close();
        }
        }
    }    

