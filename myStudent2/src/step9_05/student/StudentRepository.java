package step9_05.student;

import java.util.HashMap;

// 웹에서 DB부분을 담당 ( 데이터가 저장되는 장소 )
public class StudentRepository {

	private static HashMap<String, StudentVO> studentDB = new HashMap<String, StudentVO>();

	public static HashMap<String, StudentVO> getStudentDB() {
		return studentDB;
	}

	public static void setStudentDB(HashMap<String, StudentVO> studentDB) {
		StudentRepository.studentDB = studentDB;
	}
}
