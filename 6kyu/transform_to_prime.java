public class Solution
{
    public static int minimumNumber(int[] numbers)
    {
        int sumaNumbers = 0;
        for(int i = 0 ; i < numbers.length; i++ ){
            long currentIndx = numbers[i];
            sumaNumbers += currentIndx;
        }

        int accumulator = 1;
        int divisores = 0;
        int timesAdd = 0;

        while(!(accumulator > sumaNumbers)){
            if(sumaNumbers % accumulator == 0){
                divisores++;
            }
            accumulator++;
        }

        if(divisores != 2){
            while(divisores != 2){
                sumaNumbers ++;
                timesAdd++;

                accumulator = 1;
                divisores = 0;
                while(!(accumulator > sumaNumbers)){
                    if(sumaNumbers % accumulator == 0){
                        divisores++;
                    }
                    accumulator++;
                }
            }
        }

        return timesAdd; // Do your magic!
    }
}