
/* public class LogicalOperaatorExam {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);  //����
		
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);  //����
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);  //��Ÿ�� ����
		
		System.out.println(!b1);
		System.out.println(!b2);  //�� ���� ������
		
		int score = 88;
		if(score >= 70 && score <= 100) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		
		

	}

} */

/* public class LogicalOperatorExam{                            /����1
	public boolean isAgeDiscountable(int age) {
		boolean isDiscount = false;
		if(age <= 19 || age >= 60) {
			isDiscount = true;
		} else {
			isDiscount = false;
		}
		return isDiscount;
	}
	public static void main(String[]args) {
		LogicalOperatorExam exam = new LogicalOperatorExam();
		System.out.println(exam.isAgeDiscountable(15));
		System.out.println(exam.isAgeDiscountable(27));
		System.out.println(exam.isAgeDiscountable(61));
		
	}
} */

public class LogicalOperatorExam{
	public boolean isAgeTwenties(int age) {
		boolean isTwenties = false;
		if(age >= 20 && age <= 29 ) {
			isTwenties = true;
		} else {
			isTwenties = false;
		}
		return isTwenties;
	}
public static void main(String[]args) {
	LogicalOperatorExam exam = new LogicalOperatorExam();
	System.out.println(exam.isAgeTwenties(19));
	System.out.println(exam.isAgeTwenties(25));
	System.out.println(exam.isAgeTwenties(30));
}
}

