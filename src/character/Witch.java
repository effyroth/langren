package character;

import skill.Drug;
import skill.Match;
import skill.Shoot;
import model.Villagers;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-10 下午03:10:02
 * 类说明
 */

public class Witch extends Villagers {

	public Witch(String name, int uid) {
		super(name, uid);
		this.identity = "witch";
		this.skill = new Drug();
	}

}
