public class Kata {
    public static String rps(String p1, String p2) {
        // your code
        String result = "";

        if(p1 == p2){
            result = "Draw!";
        }else if(p1 == "scissors" && p2 == "rock" || p1 == "rock" && p2 == "paper" || p1 == "paper" && p2 == "scissors"){
            result = "Player 2 won!";
            // System.out.println("Gana player2");
        }else if(p1 == "rock" && p2 == "scissors" || p1 == "scissors" && p2 == "paper" || p1 == "paper" && p2 == "rock"){
            result = "Player 1 won!";
        }
        return result;
    }
}