package pattern.action;

public class DeleteController implements Controller{

	@Override
	public String requestHandle() {
		System.out.println("Delete Controller..register logic...");
		/*
		 * 1. ���� �޾Ƽ�
		 * 2. vo��ü ����
		 * 3.DAO ���Ϲ޾Ƽ�
		 * 4. ����Ͻ� ���� ȣ��
		 * 5. ���ε�
		 * 6. PATH�� ����
		 */
		return "delete_result.jsp";
	}

}
