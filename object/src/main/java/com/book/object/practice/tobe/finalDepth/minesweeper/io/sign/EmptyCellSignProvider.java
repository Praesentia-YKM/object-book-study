package com.book.object.practice.tobe.finalDepth.minesweeper.io.sign;


import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshot;
import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshotStatus;

public class EmptyCellSignProvider implements CellSignProvidable {

    private static final String EMPTY_SIGN = "■";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.EMPTY);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return EMPTY_SIGN;
    }

}
