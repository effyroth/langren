package skill;

import game.Game;
import model.Skill;
import model.Character;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:54:44
 * 类说明
 */

public class Match extends Skill {

	public Match() {

	}

	@Override
	public void launch(Game context) {
		// TODO Auto-generated method stub
		int lovers1id = 1;
		int lovers2id = 2;
		Character lovers1 = context.playermap.get(lovers1id);
		lovers1.islovers = true;
		Character lovers2 = context.playermap.get(lovers2id);
		lovers2.islovers = true;
		System.out.println("match " + lovers1.name + " and " + lovers2.name + " ...");
	}

}
