package step9_05.student;

// Service : 데이터 변경 로직
public class StudentInsert {
	
	// Service가 갖는 DAO 멤버변수는 private
	private StudentDAO studentDAO;
	
	StudentInsert(StudentDAO studentDAO){
		this.studentDAO = studentDAO;
	}
	
	public boolean checkID(String id) {
		StudentVO vo = studentDAO.getStudentDB().get(id);
		return vo != null ? true : false ;
		// 있으면 true, 없으면 false
	}

	public void insert(StudentVO vo) {
		if(checkID(vo.getId())) 
			System.out.println("이미 있는 아이디 입니다. ");
		else 
			studentDAO.insert(vo);
	}	
	
}
