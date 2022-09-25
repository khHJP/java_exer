package member.model.vo;

public class Vip {

	private String name;
	private String grade; 
	private int point;
	
	public Vip() {

	}

	public Vip(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	// 이자포인트 getter
		public double getInterest() {
			return (this.point * 0.1);
		}
	
}
