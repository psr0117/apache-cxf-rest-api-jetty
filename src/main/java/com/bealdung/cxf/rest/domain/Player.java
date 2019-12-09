package com.bealdung.cxf.rest.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {

	private int playerId;
	private String name;
	private int age;
	private int score;

	public Player() {
		
	}
	
	public Player(int playerId, String name, int age, int score) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
