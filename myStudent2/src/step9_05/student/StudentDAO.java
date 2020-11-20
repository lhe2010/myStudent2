package step9_05.student;

import java.util.HashMap;

// DAO (Data Access Object) : DB로부터 데이터를 input output하는 객체
public class StudentDAO {
	
	public HashMap<String, StudentVO> getStudentDB() {
		return StudentRepository.getStudentDB();
	}
	
	public StudentVO select(String id) {
		return getStudentDB().get(id);
	}
	
	public void insert(StudentVO vo) {
		getStudentDB().put(vo.getId(), vo);
	}
	
	// 내가 처음에 한 방법
//	public String selectAll() {
//		String result = "";
//		for (String id : getStudentDB().keySet()) {
//			result += getStudentDB().get(id)+"\n";
//		}		
//		return result;
//	}
	
	public void delete(String id) {
		getStudentDB().remove(id);
	}

	
	public void update(String id, StudentVO vo) {
		getStudentDB().put(id, vo);
	}
	
	

}
