package character;

import model.Villagers;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:18:56
 * 类说明
 */

public class Villager extends Villagers {

	public Villager(String name, int uid){
		super(name, uid);
		this.identity = "villager";
		this.skill = null;
	}

}
