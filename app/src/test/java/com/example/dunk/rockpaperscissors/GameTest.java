package com.example.dunk.rockpaperscissors;

import com.example.dunk.rockpaperscissors.enums.SelectionType;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canPlayGame(){
        assertEquals("you win", game.playGame(SelectionType.PAPER));
    }
}
