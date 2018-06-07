package homeWork;

public class Student {
	private int sid;
	private String sname;
	private int score;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int sid, String sname, int score) {
		this.sid = sid;
		this.sname = sname;
		this.score = score;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", score=" + score + "]";
	}
	
	
	
	 


}
