package com.xiongcz.entity;

public class User{
	private int id;
	private String name;
	private String job;
	private float sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public User(int id, String name, String job, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public User(){}
	
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+job+"\t"+sal;
	}
}
