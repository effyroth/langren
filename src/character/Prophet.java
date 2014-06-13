package character;

import skill.Check;
import model.Villagers;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:35:46
 * 类说明
 */

public class Prophet extends Villagers {
	public Prophet(String name, int uid){
		super(name, uid);
		this.identity = "prophet";
		this.skill = new Check();
	}
}
