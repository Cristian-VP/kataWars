public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        //your code here :)
        String[] howMuch = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};

        if(nb_petals < 6){
            return howMuch[(nb_petals-1)];
        }else {
            int acc = 0;
            int petalo = 0;
            do {
                //System.out.println(i);
                acc++;
                if(petalo > 5){
                    petalo = 1;
                }else{
                    petalo++;
                }
                //System.out.println("Valor how"+(f-1));
            }
            while (acc < nb_petals);
            //System.out.println("Valor how"+(f-1));
            return howMuch[(petalo-1)];
        }
    }
}