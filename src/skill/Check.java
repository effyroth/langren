package skill;

import game.Game;
import model.Character;
import model.Skill;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:54:44
 * 类说明
 */

public class Check extends Skill {

	public Check() {

	}

	@Override
	public void launch(Game context) {
		// TODO Auto-generated method stub
		int id = 5;
		Character player = context.playermap.get(id);
		player.showGroup();
		System.out.println("check " + player.name);
	}

}
