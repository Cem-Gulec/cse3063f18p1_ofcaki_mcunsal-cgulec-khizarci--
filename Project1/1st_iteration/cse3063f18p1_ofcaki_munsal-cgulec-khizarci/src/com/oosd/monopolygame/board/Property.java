package com.oosd.monopolygame.board;

public class Property implements BoardPart {
    @Override
    public void accept(BoardPartVisitor boardPartVisitor) {
        boardPartVisitor.visit(this);
    }
}
