/*                                               //짝수만의 합
public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i<=100; i++) {
			if(i % 2 != 0) {
				continue;
			}                    
			total = total + i;
		}
			System.out.println(total);
	}

}  */

/*                                               // 50까지의 합
public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i<=100; i++) {
			total = total +i;
			if(i == 50) {
				break;
			}
		}
		System.out.println(total);
	}
}	     */

public class ForExam{
	public static void main(String[] args) {
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
