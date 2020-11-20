package step9_05.student;


// Value Object : 데이터의 폼,형식,모델
public class StudentVO {
	
	private String id;
	private int num;
	private String name;
	
	public StudentVO (String id, int num, String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("id = %s / num = %d / name = %s", id, num, name);
	}
}
