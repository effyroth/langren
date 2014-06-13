package stage;

import game.Game;

import java.util.Map;

import model.Character;
import model.Stage;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午06:03:49
 * 类说明
 */

public class DayTime extends Stage {

	public DayTime() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Game context) {
		this.speech(context);
		if(context.turn == 1){
			this.elect(context);
		}
		this.vote(context);
		context.turn++;

	}

	public void speech(Game context){
		System.out.println("speech phase...");
		for(Character character : context.playermap.values()){
			character.speech();
		}
	}

	public void elect(Game context){
		System.out.println("elect phase...");
		for(Character character : context.playermap.values()){
			character.elect();
		}
	}

	public void vote(Game context){
		System.out.println("vote phase...");
		for(Character character : context.playermap.values()){
			character.vote();
		}
	}




}
