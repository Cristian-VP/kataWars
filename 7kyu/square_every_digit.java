public class SquareDigit {

    public int squareDigits(int n) {
        String numToString = String.valueOf(n);
        String squareNumbers = "";


        for(int i = 0; i < numToString.length(); i++){
            int actualIndex = Character.getNumericValue(numToString.charAt(i));
            int squareNumber = actualIndex*actualIndex;
            squareNumbers += ""+squareNumber;
        }

        return Integer.parseInt(squareNumbers); // TODO Implement me
    }
}