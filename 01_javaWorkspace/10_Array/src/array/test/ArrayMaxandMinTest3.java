package array.test;

public class ArrayMaxandMinTest3 {

	public static void main(String[] args) {

		int[] scores = { 79, 88, 91, 44, 99, 55, 96 };

		int min = scores[0];// 배열의 첫번째값으로 기본값을 초기화한다...79
		int max = scores[0];

		/*
		 * for(int i=0; i<scores.length; i++) { if(scores[i]>max) max = scores[i]; }
		 */

		// Advanced for..."뭐가 어디에서 도는가"
		for (int score : scores) {
			if (score < min)
				min = score;
			if (score > max)
				max = score;
		}

		System.out.println("최대값" + max);
	}

}
