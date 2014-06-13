package model;

import game.Game;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:31:34
 * 类说明
 */

public abstract class Werewolves extends Character {

	public Werewolves(String name, int uid) {
		super(name, uid);
		this.group = "werewolves";
		this.identity = "werewolf";
		this.skill = null;
	}

	public void action(Game context){
		this.kill(context);
	}

	public void kill(Game context){
		int id = 5;
		Character player = context.playermap.get(id);
		player.killed = true;
		System.out.println(this.name + " kill " + player.name);
	}
}
