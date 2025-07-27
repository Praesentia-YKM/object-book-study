package com.book.object.practice.tobe.finalDepth.minesweeper.io.sign;


import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshot;
import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshotStatus;

public class NumberCellSignProvider implements CellSignProvidable {

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.NUMBER);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return String.valueOf(cellSnapshot.getNearbyLandMineCount());
    }

}
