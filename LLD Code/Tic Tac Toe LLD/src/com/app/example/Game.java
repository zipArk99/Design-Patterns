package com.app.example;

import java.util.List;

public class Game {
	private final List<Player> players;
	private final Board board;
	
	public Game(Board board,List<Player> players) {
		this.board = board;
		this.players = players;
	}

}
