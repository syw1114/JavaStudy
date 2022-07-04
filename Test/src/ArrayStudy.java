import java.util.Random;
import java.util.Scanner;

public class ArrayStudy {
	// --- 배열 a의 최대값을 구해서 반환 --- //
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	// --- 배열 a의 요소에서 key와 일치하는 가장 선두의 요소를 선형탐색 --- //
	static int Search(int[] a, int key) {
		for(int i =0; i<a.length; i++) 
			if(a[i] == key)
				return i;
		return -1;
	}
	
	// --- 두 배열 a,b 의 모든 요소는 같은가? --- //
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
	}
	
	// --- 다차원 배열의 전달 --- //
	// --- 행렬 x와 y의 합을 z에 대입 --- //
	static void addMatrix(int[][] x, int[][] y, int[][] z) {
		for(int i = 0; i < x.length; i++)
			for(int j =0; j< x[i].length; j++){
				z[i][j] = x[i][j] + y[i][j];
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] a; int형을 구성요소형으로 하는 배열의 선언
		 * new int[5] int형을 구성요소형으로 하는 구성요소가 5개인 배열 본체를 생
		 * a = new int[5] a는 구성요소 수 5인 배열ㅇ르 참조(a에 대입)
		 * int[] a = new int[5]; a는 구성요소 수 5인 배열을 참조(a의 초기화)
		 * 
		 */
		
		/*
		 * 
		 * int[] a = new int[5]; 배열의 선언
		 * 
		 * a[1] = 37; a[1]에 37을 대입.
		 * a[2] = 51;
		 * a[3] = a[1] * 2; a[3]에 74를 대입
		 * 
		 */
		
		//요소 수의 취득.
		/*
		 * int[] a = new int[5]; 
		 * for(int i = 0; i<a.length; i++)
		 * a[i] = i + 1; 
		 * 
		 * for(int i =0; i<a.length; i++)
		 * 
		 * 배열 변수명.length  이것은 배열의 요소 수를 취득하기 위한 식.  또는 배열의 길이.
		 */
		
		//배열 요소의 순서를 역순으로 바꿔서 표시해보기.
		/*
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소수 :");
		int[] a = new int[scanner.nextInt()];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = 10 + rand.nextInt(90);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		for(int i = 0; i<a.length / 2 ; i++) {
			int t = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = t;
		}
		System.out.println("반대로 바꾸었습니다.");
		for(int i = 0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		 */
		
		//문자열의 배열
		//String[] hands = {"가위","바위","보"};
		
		//final한 배열  //값을 변경할 수 없게 되는 배열a가 참조할 곳. 배열의 각 요소의 값은 변경할 수 없습니다.
		//final int[] a = new int[5];
		/*
		 * a[0] = 10; //OK
		 * a = null; //에러
		 * a = new int[10]; //에
		 */
		
		//다차원 배열
		/*
		 * int[][] x;
		 * int [] x[];
		 * int x[][];
		 * 
		 * 본체생성과 동시에 실행
		 * int[][] x = new int[2][4]; -> 2는 행 4는 열
		 * 
		 * 3차원 배열
		 * long[][][] y = new long[2][3][4];
		 */
		
		//최대값을 구하는 메소드
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원 수는? : ");
		int person = scanner.nextInt();
		
		int[] height = new int[person];
		int[] weight = new int[person];
		
		System.out.println(person + "명의 신장과 체주을 입력하시오.");

		for(int i = 0; i < person; i++) {
			System.out.print((i+1) + "번의 신장 : ");
			height[i] = scanner.nextInt();
			System.out.print((i+1) + "번의 체중 : ");
			weight[i] = scanner.nextInt();
		}
		
		System.out.println("가장 키가 큰 사람의 신장 : " + maxOf(height) + "cm");
		System.out.println("가장 뚱뚱한 사람의 체중 : " + maxOf(weight) + "kg");
		
		
	}
}
