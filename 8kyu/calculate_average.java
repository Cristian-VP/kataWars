public class Kata{
    public static double find_average(int[] array){
        double sum = 0;
        for(int i = 1; i <= array.length; i++){
            sum = sum + array[i-1];
        }
        return sum/array.length;
    }
}