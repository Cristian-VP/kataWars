// Your code goes here. Good luck!
        int winner = 0;

        if(sticks %4==0){
            winner =sticks /4;
        }else if(sticks %4!=0){
            winner =sticks %4;
        }

        return winner;
