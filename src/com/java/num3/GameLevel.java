package com.java.num3;

public class GameLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 빨리 달림");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 회전");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***고급자 레벨입니다.***");
	}
	
	

}
