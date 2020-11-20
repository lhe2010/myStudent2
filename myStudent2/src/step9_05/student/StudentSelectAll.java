package step9_05.student;

import java.util.HashMap;
import java.util.Map;
//Service : 데이터 변경 로직
public class StudentSelectAll {
	
	// Service가 갖는 DAO 멤버변수는 private
	private StudentDAO studentDAO;
	
	StudentSelectAll(StudentDAO studentDAO){
		this.studentDAO = studentDAO;
	}
	
	// 내가 처음에 짠 메소드 (+ DAO.selectAll())
//	public void selectAll() {
//		System.out.println(studentDAO.selectAll());
//	}
	
	// 수정한 메소드
	public void selectAll() {
		HashMap<String, StudentVO> hmap = studentDAO.getStudentDB();
		
		for (String id : hmap.keySet()) {
			System.out.println(hmap.get(id));
		}
	}
	
}
