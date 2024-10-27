import java.util.Arrays;
public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        long resultMaxProduct = 1;
        int substractionTotalNumbers = numbers.length - sub_size;
        for(int i = numbers.length-1 ; i >= substractionTotalNumbers ; i-- ){
            long productNumber = numbers[i];
            resultMaxProduct *= productNumber;
        }

        return resultMaxProduct; // Do your magic!
    }
}