package stream.data.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/*1.��Ʈ�� ����
 * 2, while�� �ȿ��� �о���̰�
 * 3, �ַܼ� ����Ѵ�.
*/
public class DataOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = null;
		try {
	         dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
		     int data = 0;
		
	
			while((data = dis.readInt())!=-1) {
				data = dis.readInt();
				System.out.println(data);
			}
		}catch(EOFException e) {
			
		}
         catch(IOException e) {
			
		}
		finally {
			try {
			dis.close();
			} catch(IOException e) {
				
			}
		}
	
	}

}
