package xiongcz.src.entiy;

public class User {
	private int no;
	private String name;
	private	String job;
	private float sal;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	@Override
	public String toString() {
		return "no:"+no+"\t"+
				"name:"+name+"\t"+
				"sal:"+sal;
	}
	
}
