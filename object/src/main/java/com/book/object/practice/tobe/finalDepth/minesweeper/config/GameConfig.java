package com.book.object.practice.tobe.finalDepth.minesweeper.config;

import com.book.object.practice.tobe.finalDepth.minesweeper.gamelevel.GameLevel;
import com.book.object.practice.tobe.finalDepth.minesweeper.io.InputHandler;
import com.book.object.practice.tobe.finalDepth.minesweeper.io.OutputHandler;

public class GameConfig {

    private final GameLevel gameLevel;
    private final InputHandler inputHandler;
    private final OutputHandler outputHandler;

    public GameConfig(GameLevel gameLevel, InputHandler inputHandler, OutputHandler outputHandler) {
        this.gameLevel = gameLevel;
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public OutputHandler getOutputHandler() {
        return outputHandler;
    }

}
