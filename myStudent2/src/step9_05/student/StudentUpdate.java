package step9_05.student;

public class StudentUpdate {
	
	// Service가 갖는 DAO 멤버변수는 private
	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void update(String id, StudentVO vo) {
		studentDAO.update(id, vo);
	}

	// selectService.select안하고 여기서 처리해도됨
	// 그렇게 하면 get(id)!=null조건으로 분기
}
