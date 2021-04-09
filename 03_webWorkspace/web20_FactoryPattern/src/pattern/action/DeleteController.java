package pattern.action;

public class DeleteController implements Controller{

	@Override
	public String requestHandle() {
		System.out.println("Delete Controller..register logic...");
		/*
		 * 1. 폼값 받아서
		 * 2. vo객체 생성
		 * 3.DAO 리턴받아서
		 * 4. 비즈니스 로직 호출
		 * 5. 바인딩
		 * 6. PATH를 리턴
		 */
		return "delete_result.jsp";
	}

}
