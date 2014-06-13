package stage;

import game.Game;

import java.util.Map;

import model.Stage;
import model.Character;
import model.Werewolves;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午06:03:49
 * 类说明
 */

public class Night extends Stage {

	public Night() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Game context){
		System.out.println("天黑请闭眼");
		if(context.turn == 1){
			this.cupidAction(context);
			this.loversAction(context);
		}
		this.guardAction(context);
		this.prophetAction(context);
		this.werewolvesAction(context);
		this.witchAction(context);
		this.otherAction();
	}

	public void prophetAction(Game context){
		System.out.println("预言家请睁眼...");
		for(Character character : context.playermap.values()){
			if(character.identity.equals("prophet")){
				character.skill.launch(context);
			}
		}
	}

	public void guardAction(Game context){
		System.out.println("守护请睁眼...");
		for(Character character : context.playermap.values()){
			if(character.identity.equals("guard")){
				character.skill.launch(context);
			}
		}
	}

	public void witchAction(Game context){
		System.out.println("女巫请睁眼...");
//		for(Character character : context.playermap.values()){
//			if(character.killed == true){
//				character.showName();
//			}
//		}
		for(Character character : context.playermap.values()){
			if(character.identity.equals("witch")){
				character.skill.launch(context);
			}
		}
	}

	public void cupidAction(Game context){
		System.out.println("丘比特请睁眼...");
		for(Character character : context.playermap.values()){
			if(character.identity.equals("cupid")){
				character.skill.launch(context);
			}
		}
	}

	public void loversAction(Game context){
		System.out.println("情侣请睁眼...");
		for(Character character : context.playermap.values()){
			if(character.islovers == true){
				character.showIdentity();
			}
		}
	}

	public void werewolvesAction(Game context){
		System.out.println("狼人请睁眼...");
		for(Werewolves werewolves : context.werewolvesmap.values()){
			werewolves.action(context);
		}
	}

	public void otherAction(){
		System.out.println("other Action...");
	}
}
