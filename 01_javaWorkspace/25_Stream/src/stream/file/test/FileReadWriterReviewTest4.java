package stream.file.test;
/*
 * hope.txt������ ���ڵ����͸� �о ===FileReader Character�迭 ���
 * ���� ����� result.txt ���Ϸ� ���� �����͸� ��� ---FileWriter Character�迭 ���
 * ::
 * ��ũ�� �ڵ� �ۼ� ����
 * 1. �Է�, ��� ��Ʈ���� �Ѳ����� ����
 * 
 * 2. �ݺ��� �ȿ��� �����͸� ���� �� �о
 * 
 * 3. �ݺ��� �ȿ��� �о���� �����͸� sink�������� ���� �� ���
 * --> ���� �����͸� ����� ���� �о���̴� ���� ������� �ʰ�,
 *     ��������ŭ ��Ƶξ��ٰ� �Ѳ����� ����ϴ� ������ ���δ�.
 *     1) auto flush ��� -- flush()
 *     2) �ڿ��� ���� �� �� �ȿ� �ִ� �����͸� �Ѳ����� ��� == close()
 *     
 */
class FileReaderWriterReview{
	FileReadWriterReview(){
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
	    Printwriter pw =  new PriniWriter("result.txt")
	}
}
public class FileReadWriterReviewTest4 {

	public static void main(String[] args) {
		new FileReadWriterReview();
		// TODO Auto-generated method stub

	}

}
