package com.example.dunk.rockpaperscissors;

import com.example.dunk.rockpaperscissors.enums.SelectionType;


class Game {

    private String[] computerChoice =  new String[]{"ROCK", "PAPER", "SCISSORS"};


    public String playGame(SelectionType playerPlay){
        String computerPlay = computerChoice[(int) (Math.random() * computerChoice.length)];

        if (playerPlay.toString().equals(computerPlay))
        {return "DRAW";}

        else if (playerPlay.getLosingHand().equals(computerPlay))
        {return "YOU WIN";}

        else
            return "COMPUTER WINS WITH " + computerPlay;
    }
}
