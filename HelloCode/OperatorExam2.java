
public class OperatorExam2 {

/*	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
		i += 10;
		System.out.println(i);
		System.out.println(i -= 5);  
	}	*/
	public static void calculate(int a, int b) {
		
		boolean c = a > b;
		boolean d = a == b;
		boolean e = a != b;
		
		System.out.println(a+"은(는) "+b+"보다 큽니까? "+  c);
		System.out.println(a+"은(는) "+b+"와(과) 같습니까? "+d);
		System.out.println(a+"은(는) "+b+"와(과) 다릅니까? "+e);
				
	}
	public static void main(String[] args) {
		//0~10 사이 값을 랜덤하게 변수 a와 b에 넣어줍니다.
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		new OperatorExam2().calculate(a,b);
	}
}
