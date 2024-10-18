public class Numbers
{
    public static double TwoDecimalPlaces(double number)
    {

        double toRound = number * 100;
        double result = Math.round(toRound);

        return result/100;
    }
}