public class Kata {
    public static int snail(int column, int day, int night) {
        int days = 0;
        int distanceAccumulate  = 0;

        while(distanceAccumulate < column){
            days++;
            distanceAccumulate += day;
            if(distanceAccumulate < column){
                distanceAccumulate += -night;
            }
        }
        return (day >= column) ? 1 : days ;
    }
}