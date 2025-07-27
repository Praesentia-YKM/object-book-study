package com.book.object.practice.tobe.finalDepth;


import com.book.object.practice.tobe.finalDepth.minesweeper.Minesweeper;
import com.book.object.practice.tobe.finalDepth.minesweeper.config.GameConfig;
import com.book.object.practice.tobe.finalDepth.minesweeper.gamelevel.Beginner;
import com.book.object.practice.tobe.finalDepth.minesweeper.io.ConsoleInputHandler;
import com.book.object.practice.tobe.finalDepth.minesweeper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
            new Beginner(),
            new ConsoleInputHandler(),
            new ConsoleOutputHandler()
        );

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

}
