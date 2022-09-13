import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Q1 {
    public static int createPIN(int input1, int input2, int input3){
        int[] arr=new int[]{input1,input2,input3};
        Vector<Integer> v=new Vector<Integer>();
        for(int i=0;i<3;i++){
            int temp=arr[i];
            while(temp!=0){
                int n=temp%10;
                v.add(n);
                temp/=10;
            }
        }
        int min=Collections.min(v);
        int max=Collections.max(v);
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<v.size();i++){
                if(m.containsKey(v.get(i)))
                {
                    m.put(v.get(i), m.get(v.get(i)) + 1);
                }
                else{
                    m.put(v.get(i), 1);
                }
        }
        int min_c=Integer.MAX_VALUE, max_c=Integer.MIN_VALUE;
        int min_k=Integer.MAX_VALUE, max_k=Integer.MIN_VALUE;
        String pin="";
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            min_c=Math.min(min_c, e.getValue());
            max_c=Math.max(max_c, e.getValue());
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(min_c==e.getValue())
                min_k=Math.min(min_k, e.getKey());
            if(max_c==e.getValue())
                max_k=Math.max(max_k, e.getKey());
        }
        pin=""+min+max+min_k+max_k;
        return Integer.valueOf(pin);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt(),input2=sc.nextInt(), input3=sc.nextInt();
        sc.close();
        int pin=createPIN(input1, input2, input3);
        System.out.println("the pin is "+pin);
    }
}