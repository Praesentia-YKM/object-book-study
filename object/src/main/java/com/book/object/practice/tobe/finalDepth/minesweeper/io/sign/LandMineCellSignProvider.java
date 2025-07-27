package com.book.object.practice.tobe.finalDepth.minesweeper.io.sign;


import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshot;
import com.book.object.practice.tobe.finalDepth.minesweeper.board.cell.CellSnapshotStatus;

public class LandMineCellSignProvider implements CellSignProvidable {

    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.LAND_MINE);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return LAND_MINE_SIGN;
    }

}
