package BASICS;

public class basicSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int sum=0;
        for (int i=0; i<= arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}
