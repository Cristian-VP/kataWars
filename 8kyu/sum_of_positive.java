public class Positive{
    public static int sum(int[] arr){
        int sumOfPositive = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                sumOfPositive = sumOfPositive + arr[i];
            }
        }
        return sumOfPositive;
    }
}