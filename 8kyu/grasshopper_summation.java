public class GrassHopper {

    public static int summation(int n) {
        int accum = n;
        int sumTotal = 0;
        int substract = n;
        for(int i=0; i < n; i++){
            sumTotal = accum + (substract-1);
            accum = sumTotal;
            substract--;
        }
        return sumTotal;
    }
}