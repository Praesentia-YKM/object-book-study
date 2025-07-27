package com.book.object.practice.tobe.finalDepth.minesweeper.io.sign;

import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshot;
import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshotStatus;

public class FlagCellSignProvider implements CellSignProvidable {

    private static final String FLAG_SIGN = "⚑";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.FLAG);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return FLAG_SIGN;
    }

}
