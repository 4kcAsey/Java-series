import java.util.Scanner;

class Q2 {
    public static int bracker_match(String str) {
        int open=0, close=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)=='(') {
                open++;
            }
            else{
                if(open>0)
                    open--;
                else if(str.charAt(i)==')') {
                    close++;
                }
            }
        }
        return open+close;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        System.out.println(bracker_match(str));
    }
}