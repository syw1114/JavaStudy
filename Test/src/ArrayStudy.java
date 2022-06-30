import java.util.Random;
import java.util.Scanner;

public class ArrayStudy {

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
	}
}
