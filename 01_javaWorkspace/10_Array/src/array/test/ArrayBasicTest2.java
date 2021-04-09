package array.test;
/*
 * 배열 선언, 생성, 초기화
 * --> 이 방법을 더 많이 사용함
 * *배열의 특징
 * 1. 배열은 Re-sizing 할 수 없다.
 *    그런데, 처음 잡은 사이즈를 변경하게 되면
 *    새로운 배열이 하나 생성된다.
 *    
 *  2. 배열은 객체다
 *     new 키워드를 통해서 생성...Heap에 올라간다.
 *     하지만 Class Type이 존재하지 않는다.
 *     length라는 필드를 반드시 기억해야 한다.
 *     ㄴ배열안의 데이터의 갯수를 리턴하는 필드에 해당한다.
 *     
 *   3. 배열은 Re-sizing은 안되지만
 *   사이즈가 다른 배열의 데이터를 복사해 와서 사용할 수 는 있다.
 *   System.arraycopy()를 사용한다.  
 */
public class ArrayBasicTest2 {

	public static void main(String[] args) {
		
		int [] arr = {11,22,33};
		for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i]+" ");//11,22,33
			
			//44,55 값이 뒤늦게 생겨서 추가해야한다.
			arr = new int[5];
			arr[3] = 44;
			arr[4] = 55;
			System.out.println("\n==================\n");
			for(int i=0; i<arr.length; i++) 
				System.out.print(arr[i]+" ");//11,22,33
		System.out.println("\n=======arraycopy()============");
		int[] target = {1,2,3,4,5,6};
		int[] source = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(source,3,target, 0, 4);
		for(int i=0; i<target.length;i++) System.out.println(target[i]);
		}
	}
	


