package game;

import java.util.HashMap;
import java.util.Map;

import character.Cupid;
import character.Guard;
import character.Hunter;
import character.Prophet;
import character.Villager;
import character.Werewolf;
import character.Witch;

import model.Character;
import model.Stage;
import model.Werewolves;
import stage.DayTime;
import stage.Night;


/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-9 上午11:25:53
 * 类说明
 */

public class Game {

	public Stage night = new Night();
	public Stage daytime = new DayTime();

	public Map<Integer, Character> playermap;
	public Map<Integer, Werewolves> werewolvesmap;

	public int turn;

	public Game() {
		this.turn = 1;
		this.playermap = new HashMap<Integer, Character>();
		this.werewolvesmap = new HashMap<Integer, Werewolves>();
//		String getPlayer(1 = "player1";
//		String getPlayer(2 = "player2";
//		String getPlayer(3 = "player3";
//		String getPlayer(4 = "player4";
//		String getPlayer(5 = "player5";
//		String getPlayer(6 = "player6";
//		String getPlayer(7 = "player7";
//		String getPlayer(8 = "player8";
		int uid = 1;
		Villager player1 = new Villager(getPlayer(1), uid++);
		Werewolf player2 = new Werewolf(getPlayer(2), uid++);
		Prophet player3 = new Prophet(getPlayer(3), uid++);
		Hunter player4 = new Hunter(getPlayer(4), uid++);
		Cupid player5 = new Cupid(getPlayer(5), uid++);
		Werewolf player6 = new Werewolf(getPlayer(6), uid++);
		Guard player7 = new Guard(getPlayer(7), uid++);
		Witch player8 = new Witch(getPlayer(8), uid++);
		this.playermap.put(player1.uid, player1);
		this.playermap.put(player2.uid, player2);
		this.playermap.put(player3.uid, player3);
		this.playermap.put(player4.uid, player4);
		this.playermap.put(player5.uid, player5);
		this.playermap.put(player6.uid, player6);
		this.playermap.put(player7.uid, player7);
		this.playermap.put(player8.uid, player8);
		this.werewolvesmap.put(player2.uid, player2);
		this.werewolvesmap.put(player6.uid, player6);
	}

	public void start(){
		this.showPlayers();
		this.night.start(this);
//		this.daytime.start(this);
	}

	public void showPlayers(){
		for (Character character : this.playermap.values()) {
			character.showIdentity();
		}
	}

	public String getPlayer(int i){
		return "player" + i;
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}
