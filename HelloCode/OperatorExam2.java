
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
		
		System.out.println(a+"��(��) "+b+"���� Ů�ϱ�? "+  c);
		System.out.println(a+"��(��) "+b+"��(��) �����ϱ�? "+d);
		System.out.println(a+"��(��) "+b+"��(��) �ٸ��ϱ�? "+e);
				
	}
	public static void main(String[] args) {
		//0~10 ���� ���� �����ϰ� ���� a�� b�� �־��ݴϴ�.
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		new OperatorExam2().calculate(a,b);
	}
}
