package step9_05.student;

public class StudentDelete {

	// Service가 갖는 DAO 멤버변수는 private
	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO dao) {
		this.studentDAO = dao;
	}

	public void delete(String id) {
		studentDAO.delete(id);		
	}
}
