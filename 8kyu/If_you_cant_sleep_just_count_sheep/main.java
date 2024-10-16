class Kata {
    public static String countingSheep(int num) {
        //Add your code here
        String murMur = "";
        String countSheeps = " sheep...";


        for(int i = 1; i <= num; i++){
            murMur = murMur + i + countSheeps;
        }
        return murMur;

    }
}