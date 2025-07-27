package com.book.object.practice.tobe.finalDepth.minesweeper.io;


import com.book.object.practice.tobe.finalDepth.minesweeper.board.position.CellPosition;
import com.book.object.practice.tobe.finalDepth.minesweeper.user.UserAction;

public interface InputHandler {

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();

}
