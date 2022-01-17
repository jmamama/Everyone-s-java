import java.util.Scanner;
public class DoWhileExam {

	public static void main(String[] args) {
	/*	int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			value = scan.nextInt();
			System.out.println("입력받은 값:"+value);
		}while(value !=10);
		System.out.println("반복문 종료!!");    */

		
		Scanner scan = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		do {
			value = scan.nextInt();
			sum += value;
			System.out.println(value);
		}while(value < 100);
			System.out.println("sum :" +sum);
		
	}

}
