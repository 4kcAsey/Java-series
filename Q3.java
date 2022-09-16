public class Q3 {
    public static int indexEqualsValueSearch(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr=new int[]{-1,0,3,6};
        System.out.println(indexEqualsValueSearch(arr));
    }
}
