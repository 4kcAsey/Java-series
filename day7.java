import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class day7 {
    static void CheckStable(int intput1, int intput2, int input3,int input4, int input5)
    {
        int[] arr=new int[]{intput1,intput2,input3,input4,input5};
        Vector<Integer> a=new Vector<Integer>();
        Vector<Integer> b=new Vector<Integer>();
        for(int i=0;i<5;i++){
            int flag=0;
            HashMap<Character,Integer> d=new HashMap<Character,Integer>();
            char[] str=numarr(arr[i]);
            for(int j = 0; j < str.length; j++){
                if(d.containsKey(str[j]))
                {
                    d.put(str[j], d.get(str[j]) + 1);
                }
                else{
                d.put(str[j], 1);
                }
            }
            Collection c = (Collection)d.values();
            Iterator<?> iterator = c.iterator();
            int temp = (Integer) iterator.next();
            while (iterator.hasNext())
            {
                if ((int) iterator.next() != temp) {
                    flag=1;
                }
            }
            if(flag==0)
                a.add(arr[i]);
            else
                b.add(arr[i]);
        }
        System.out.println("Stable nos. -");
        for(int i=0;i<a.size();i++){
            System.out.print(" "+a.get(i));
        }
        System.out.println("\nUnstable nos. -");
        for(int i=0;i<b.size();i++){
            System.out.print(" "+b.get(i));
        }
        int min = Collections.min(a);
        int max = Collections.max(a);
        int Code=max-min;
        System.out.println("\nThe code is - "+Code);
    }
    static char[] numarr(int arr){
        String str = Integer.toString(arr);
		char[] r = new char[str.length()];
		
		// Insert characters of the string into char array
		for (int i = 0; i < str.length(); i++) {
			r[i] = str.charAt(i);
		}
        return r;
    }
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int intput1=sc.nextInt(),intput2=sc.nextInt(),input3=sc.nextInt(),input4=sc.nextInt(),input5=sc.nextInt();
        sc.close();
        CheckStable(intput1,intput2,input3,input4,input5);
    }
}