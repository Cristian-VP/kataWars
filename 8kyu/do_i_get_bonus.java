public class Kata{
    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!
        String howMuch = "\u00A3%d";
        return (bonus) ? String.format(howMuch, salary*10) : String.format(howMuch, salary);
    }
}