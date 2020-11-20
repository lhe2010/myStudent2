package step9_05.student;

//Service : 데이터 변경 로직
public class StudentSelect {
	
	// Service가 갖는 DAO 멤버변수는 private
	private StudentDAO studentDAO;
	
	public StudentSelect(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	};
	
	public boolean checkID(String id) {
		StudentVO vo = studentDAO.getStudentDB().get(id);
		return vo != null ? true : false ;
		// 있으면 true, 없으면 false
	}

	public StudentVO select(String id) {
		if(checkID(id))
			return studentDAO.select(id); // 객체를 반환하고 찍는 것은 메인에서 진행
		else
			System.out.println("존재하지 않는 아이디");
			// 없는 아이디. 가입가능. 조회불가
		return null; //******
	}
	
}