package com.book.object.practice.tobe.finalDepth.minesweeper.io;


import com.book.object.practice.tobe.finalDepth.minesweeper.board.GameBoard;
import com.book.object.practice.tobe.finalDepth.minesweeper.exception.GameException;

public interface OutputHandler {

    void showGameStartComments();

    void showBoard(GameBoard board);

    void showGameWinningComment();

    void showGameLosingComment();

    void showCommentForSelectingCell();

    void showCommentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);

}
