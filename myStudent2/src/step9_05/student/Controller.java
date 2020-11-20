package step9_05.student;

// Controller : 페이지 이동 기능
public class Controller {
	
	private StudentDAO dao;
	private StudentSelect 		stSelect;
	private StudentSelectAll 	stSelectAll;
	private StudentInsert 		stInsert;
	private StudentUpdate 		stUpdate;
	private StudentDelete 		stDelete;
	
	public Controller() {
		dao = new StudentDAO();
		stSelect = new StudentSelect(dao);  
		stSelectAll = new StudentSelectAll(dao);
		stInsert = new StudentInsert(dao);
		stUpdate = new StudentUpdate(dao);     
		stDelete = new StudentDelete(dao);     
	}
	public StudentDAO getDao() {
		return dao;
	}
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}
	public StudentSelect getStSelect() {
		return stSelect;
	}
	public void setStSelect(StudentSelect stSelect) {
		this.stSelect = stSelect;
	}
	public StudentSelectAll getStSelectAll() {
		return stSelectAll;
	}
	public void setStSelectAll(StudentSelectAll stSelectAll) {
		this.stSelectAll = stSelectAll;
	}
	public StudentInsert getStInsert() {
		return stInsert;
	}
	public void setStInsert(StudentInsert stInsert) {
		this.stInsert = stInsert;
	}
	public StudentUpdate getStUpdate() {
		return stUpdate;
	}
	public void setStUpdate(StudentUpdate stUpdate) {
		this.stUpdate = stUpdate;
	}
	public StudentDelete getStDelete() {
		return stDelete;
	}
	public void setStDelete(StudentDelete stDelete) {
		this.stDelete = stDelete;
	}
	
}
