import java.util.Scanner;

public class day6 {
    static String[] StringEncoder(String[] intput1, int intput2)
    {
        String temp="", ans="";
        int k=0;
        String answer[]=new String[intput1.length];
        for(int i=0;i<intput1.length;i++){
            k=0;
            temp=""; ans="";
            String word=intput1[i];
            temp=""+word.charAt(0)+word.charAt(word.length()/2)+word.charAt(word.length()-1);
            while(k<=intput2){
                ans+=temp;
                k++;
            }
            answer[i]=ans;
        }
        return answer;
    }
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String intput1[]=new String[n];
        for(int i=0;i<n;i++){
            intput1[i]=sc.next();
        }
        int intput2=sc.nextInt();
        sc.close();
        String temp[]=StringEncoder(intput1,intput2);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }

}
