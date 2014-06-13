package model;

/**
 * @author guzhen E-mail:effyroth@gmail.com
 * @version 创建时间：2013-8-8 下午04:54:21
 * 类说明
 */

public abstract class Character {

	public String group;

	public String identity;

	public int uid;

	public String name;

	public String status;

	public Skill skill = null;

	public boolean killed = false;

	public boolean beprotect = false;

	public boolean poisoned = false;

	public boolean saved = false;

	public boolean islovers = false;

	public Character(String name, int uid){
		this.name = name;
		this.uid = uid;
		this.status = "live";
	}

	public void speech(){
		System.out.println(this.name + " say something...");
	}

	public void die(){
		this.status = "die";
	}

	public void vote(){
		System.out.println(this.name + " vote someone...");
	}

	public void elect(){
		System.out.println(this.name + " elect someone...");
	}

	public void action(){

	}

	public void showIdentity(){
		System.out.println(this.uid + ":" + this.name + ":" + this.identity);
	}

	public void showName(){
		System.out.println(this.uid + ":" + this.name);
	}

	public void showGroup(){
		System.out.println(this.uid + ":" + this.name + ":" + this.group);
	}
}
