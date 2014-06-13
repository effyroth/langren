package model;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午05:32:06
 * 类说明
 */

public abstract class Villagers extends Character {

	public Villagers(String name, int uid) {
		super(name, uid);
		this.group = "villagers";
	}

}
