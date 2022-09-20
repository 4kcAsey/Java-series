import java.util.Scanner;

public class Q6 {
    static Scanner s=new Scanner(System.in);
    public static int op(int N, int Q){
        int result=0;
        int[] A=new int[N];
        for(int i=0;i<Q;i++){
            int opt=s.nextInt(), X=s.nextInt();
            switch(opt){
                case 1:
                    A[X]=2*A[X]+1;
                    break;
                case 2:
                    A[X]=(int)Math.floor(X);
                    break;
                case 3:
                    int Y=s.nextInt();
                    result=sum(A,X,Y);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        return result;
    }
    public static int sum(int[] a,int x,int y) {
        int su=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=y && a[i]>=x)
                su+=a[i];
        }
        return su;
    }
    public static void main(String args[]) {
        int N=s.nextInt(), Q=s.nextInt();
        System.out.println(op(N,Q));
    }
}
