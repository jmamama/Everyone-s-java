import java.util.Scanner;
public class DoWhileExam {

	public static void main(String[] args) {
	/*	int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			value = scan.nextInt();
			System.out.println("�Է¹��� ��:"+value);
		}while(value !=10);
		System.out.println("�ݺ��� ����!!");    */

		
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
