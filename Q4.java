import java.util.Arrays;

public class Q4 {
    public static int[] arrayOfArrayProducts (int[] arr){
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=p(i,arr);
        }
        return result;
    }
    public static int p(int i, int[] arr){
        int pro=1;
        for(int j=0;j<arr.length;j++){
            if(i==j)
                continue;
            pro*=arr[j];
        }
        return pro;

    }
    public static void main(String[] args) {
        int[] arr1 = {8, 10, 2};
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr1)));
        int[] arr2 = {2, 7, 3, 4};
        System.out.println(Arrays.toString(arrayOfArrayProducts(arr2)));
    }
}
