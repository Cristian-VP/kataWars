public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        String myAge = "You are %d year%s old.";
        String myFutureBorn = "You will be born in %d year%s.";
        String beingBorn = "You were born this very year!";
        String philipYears = "";
        int howYearsHave;

        if(yearTo < birth){
            howYearsHave = birth - yearTo;
            philipYears = String.format(myFutureBorn, howYearsHave , howYearsHave == 1 ? "" : "s"  );

        }else if(yearTo > birth){
            howYearsHave = yearTo - birth;
            philipYears = String.format(myAge, howYearsHave, howYearsHave == 1 ? "" : "s");
        }else if(birth == yearTo){
            philipYears = beingBorn;
        }

        return philipYears;
    }
}