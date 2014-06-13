package character;

import skill.Check;
import skill.Protect;
import model.Villagers;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:35:46
 * 类说明
 */

public class Guard extends Villagers {
	public Guard(String name, int uid){
		super(name, uid);
		this.identity = "guard";
		this.skill = new Protect();
	}
}
