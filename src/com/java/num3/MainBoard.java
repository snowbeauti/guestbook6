package com.java.num3;

public class MainBoard {

	public static void main(String[] args) {
	Player player = new Player();
	player.play(1);
	
	AdvancedLevel aplayer = new AdvancedLevel();
	player.upgradeLevel(aplayer);
	player.play(2);
	
	GameLevel gplayer = new GameLevel();
	player.upgradeLevel(gplayer);
	player.play(3);

}
}