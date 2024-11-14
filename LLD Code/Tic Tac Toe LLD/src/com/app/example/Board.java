package com.app.example;

import java.util.List;

public class Board {
	Piece[][] board;
	private final int boardSize;

	public Board(int boardSize) {
		this.boardSize = boardSize;
		board = new Piece[boardSize][boardSize];
	}

}
