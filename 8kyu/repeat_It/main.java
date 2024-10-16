public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {
        //var
        String addString= "";
        String stringToShow = "";

        int loopAcumulator = 0;

        //fvar

        //code
        if (toRepeat instanceof String & n > 0){
            do{
                loopAcumulator++;
                addString = addString + toRepeat;
                stringToShow = addString;
            }
            while(loopAcumulator < n);
        }else if(n == 0){
            stringToShow = "";
        }else{
            stringToShow = "Not a string";
        }
        return stringToShow;
        //fcode
    }

}