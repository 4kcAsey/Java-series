import java.util.Scanner;
import java.util.Vector;

public class p3 {
    public static String PassCodeGen(int input1[], int input2)
                {
                    int SR=0,SNR=0,RE=0;
                    String Result="";
                    int[] freq=new int[input2];
                    Vector<Integer> temp=new Vector<Integer>();
                    for(int i=0;i<input2;i++){
                        freq[i]=0;
                        for(int j=0;j<input2;j++){
                            if(input1[i]==input1[j]){
                                freq[i]++;
                            }
                        }
                        if(freq[i]>1){
                            temp.add(input1[i]);
                            SR+=i;
                        }
                        if(freq[i]==1){
                            SNR+=i;
                        }
                    }
                    int N=0;
                    if(SR>9){
                        while(SR!=0){
                            int n=SR%10;
                            N+=n;
                            SR=SR/10;
                        }
                        SR=N;
                    }
                    if(SNR>9){
                        while(SNR!=0){
                            int n=SNR%10;
                            N+=n;
                            SNR=SNR/10;
                        }
                        SNR=N;
                    }
                    System.out.println(SR);
                    System.out.println(N);
                    System.out.println(SNR);
                    //System.out.println(temp.lastElement());
                    if(SR==0){
                        RE=0;

                    }
                    else{
                        RE=temp.lastElement();
                        if(RE<0){
                            RE=(int) Math.pow(RE, 2);
                        }
                    }
                    Result=""+SR+SNR+RE;
                    return Result;
                }
                public static void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int[] input1=new int[n];
                    for(int i=0;i<n;i++){
                        input1[i]=sc.nextInt();
                    }

                    sc.close();
                    System.out.println(PassCodeGen(input1,n));
                }

}
