package com.bealdung.cxf.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.bealdung.cxf.rest.domain.Player;

public class PlayerService implements IPlayerService {

	@Override
	public Player getPlayerInfo(int playerId) {
		return new Player(1,"Sachin",33,75);
	}

	@Override
	public List<Player> getAllPlayers() {
		List<Player> players = new ArrayList<>();
		players.add(new Player(1,"Jason",30, 60));
		players.add(new Player(2,"Peter",40, 75));
		
		return players;
		
		
	}

}
