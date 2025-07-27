package com.book.object.practice.tobe.finalDepth.minesweeper.io.sign;

import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshot;

public interface CellSignProvidable {

    boolean supports(CellSnapshot cellSnapshot);

    String provide(CellSnapshot cellSnapshot);

}
