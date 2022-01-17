
public class OperatorExam {

	public static void main(String[] args) {
		
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);   //-5
		System.out.println(i2);   //-5
		System.out.println(i3);   //5
		
		int i4 = ++i3;  // int i4 = (i3 = i3 + 1)
		System.out.println(i4);  //6
		System.out.println(i3);  //6
		
		int i5 = i3++;  // int i5 = i3; i3 = i3+1;
		System.out.println(i5);  //6
		System.out.println(i3);  //7
		
		int i6 = --i3;
		System.out.println(i6);
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		
		System.out.println(i/ (double) j);
		System.out.println(i % j);
		
		
		int a = 7;
		int b = 3;
		
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a%b;
		
		System.out.println("a와 b의 합 : " + c);
		System.out.println("a와 b의 차 : " + d);
		System.out.println("a와 b의 곱 : "+ e);
		System.out.println("a를 b로 나눈 나머지 : " + f);
		
		
		
		

	}

}
