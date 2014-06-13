package skill;

import game.Game;
import model.Skill;
import model.Character;;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:54:44
 * 类说明
 */

public class Protect extends Skill {

	public Protect() {

	}

	@Override
	public void launch(Game context) {
		// TODO Auto-generated method stub
		int id = 5;
		Character player = context.playermap.get(id);
		player.beprotect = true;
		System.out.println("protect " + player.name + "...");
	}

}
