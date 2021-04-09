package stream.file.test;
/*
 * hope.txt파일의 문자데이터를 읽어서 ===FileReader Character계열 사용
 * 다은 경로의 result.txt 파일로 문자 데이터를 출력 ---FileWriter Character계열 사용
 * ::
 * 스크림 코드 작성 패턴
 * 1. 입력, 출력 스트림을 한꺼번에 생성
 * 
 * 2. 반복문 안에서 데이터를 전부 다 읽어서
 * 
 * 3. 반복문 안에서 읽어들인 데이터를 sink방향으로 전부 다 출력
 * --> 문자 데이터를 출력할 떄는 읽어들이는 족족 출력하지 않고,
 *     일정량만큼 모아두었다가 한꺼번에 출력하는 패턴을 보인다.
 *     1) auto flush 기능 -- flush()
 *     2) 자원을 닫을 때 그 안에 있는 데이터를 한꺼번에 출력 == close()
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
