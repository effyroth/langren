package character;

import skill.Shoot;
import model.Villagers;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-10 下午03:10:02
 * 类说明
 */

public class Hunter extends Villagers {

	public Hunter(String name, int uid) {
		super(name, uid);
		this.identity = "hunter";
		this.skill = new Shoot();
	}

}
