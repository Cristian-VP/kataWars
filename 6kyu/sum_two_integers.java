public class Solution
{
    public static int add(int x, int y)
    {
        int operarXOR = x ^ y;
        int operarAND = x & y;
        int newX = 0;
        int newY = 0;
        while(operarAND != 0){
            newY = operarAND << 1;
            newX = operarXOR;
            operarXOR = newX ^ newY;
            operarAND = newX & newY;
        }

        System.out.println(x);
        System.out.println(y);
        System.out.println(operarXOR);

        return operarXOR; // Do your magic!
    }
}