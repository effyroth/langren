package skill;

import game.Game;
import model.Character;
import model.Skill;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:54:44
 * 类说明
 */

public class Drug extends Skill {

	boolean poison = true;

	boolean medicine = true;

	public Drug() {

	}

	@Override
	public void launch(Game context) {
		// TODO Auto-generated method stub
		this.save(context);
		this.poison(context);
	}

	public void poison(Game context) {
		// TODO Auto-generated method stub
		int id = 1;
		Character player = context.playermap.get(id);
		player.poisoned = true;
		System.out.println("poison " + player.name);
	}

	public void save(Game context) {
		// TODO Auto-generated method stub
		Character player = null;
		for(Character character : context.playermap.values()){
			if(character.killed == true){
				player = character;
			}
		}
		player.saved = true;
		System.out.println("save " + player.name);
	}

}
