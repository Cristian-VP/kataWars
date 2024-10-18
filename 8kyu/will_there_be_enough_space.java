public class Bob {
    public static int enough(int cap, int on, int wait){
        int realCap = cap - on;
        int ableTo ;
        if(realCap >= wait){
            ableTo = 0;
        }else{
            ableTo = wait - realCap;
        }
        return ableTo;
    }
}