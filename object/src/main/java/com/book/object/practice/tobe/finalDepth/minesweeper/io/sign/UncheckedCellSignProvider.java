package com.book.object.practice.tobe.finalDepth.minesweeper.io.sign;


import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshot;
import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshotStatus;

public class UncheckedCellSignProvider implements CellSignProvidable {

    private static final String UNCHECKED_SIGN = "□";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.UNCHECKED);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return UNCHECKED_SIGN;
    }

}
