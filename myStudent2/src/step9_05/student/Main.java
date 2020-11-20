// 2020-11-20 금 1교시 15:22-16:17 아예 다 지우고 처음부터 시작
// 16:17-16:32 이전에 한 코드랑 비교해보고 수정.
package step9_05.student;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		StudentSelect selectService = controller.getStSelect();
		Scanner scan = new Scanner(System.in);
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				// 추가
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("NUM : ");
				int num = scan.nextInt();
				System.out.print("NAME : ");
				String name = scan.next();

				StudentInsert insertService = controller.getStInsert();
				insertService.insert(new StudentVO(id, num, name));
				
			} else if (selectMenu == 2) {
				System.out.print("ID : ");
				String id = scan.next();
				
				if(selectService.checkID(id)) {
					System.out.print("NUM : ");
					int num = scan.nextInt();
					System.out.print("NAME : ");
					String name = scan.next();
					StudentUpdate updateService = controller.getStUpdate();
					updateService.update(id, new StudentVO(id,num, name));
				} else {
					System.out.println("존재하지 않는 아이디");
				}
				
			} else if (selectMenu == 3) {
				System.out.print("ID : ");
				String id = scan.next();
				if(selectService.checkID(id)) {
					StudentDelete deleteService = controller.getStDelete();
					deleteService.delete(id);
				} else {
					System.out.println("존재하지 않는 아이디");
				}
				
			} else if (selectMenu == 4) {
				System.out.print("ID : ");
				String id = scan.next();
				StudentVO vo = selectService.select(id);
				if(vo != null)
					System.out.println(vo);
				
			} else if (selectMenu == 5) {
				StudentSelectAll selectAllService = controller.getStSelectAll();
				selectAllService.selectAll();
				
			} else if (selectMenu == 6) {
				System.out.println("종료");
				scan.close();
				break;
			}
		}
	}
}
