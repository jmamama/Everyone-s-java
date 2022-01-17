
/*public class IfExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
	//	if(x < y) {                                           //if문 예제
	//		System.out.println("x는 y보다 작습니다. ");
			
	//	if( x > y ) {
	//		System.out.println("x는 y보다 작습니다. ");
			
		if( x > y ) {
			System.out.println("x는 y보다 큽니다. ");
			System.out.println("test 1");
		}	
		if( x > y ) 
			System.out.println("x는 y보다 큽니다. ");
			System.out.println("test 2");
			
		if(x == y) {                                         //if-else문
			System.out.println("x는 y와 같습니다.");
		} else {
			System.out.println("x는 y와 다릅니다.");          
		}
		
		
		if(x == y) {                                         //if-else if-else문
			System.out.println("x는 y와 같습니다.");
		} else if(x > y){
			System.out.println("x는 y보다 큽니다.");
		} else {
			System.out.println("x는 y와 다릅니다.");
		}  
		int vaule = 6;
		
		if(vaule % 3 ==0) {
			System.out.println(vaule+"는(은) 3의 배수입니다.");
		}
		}

	} */

public class IfExam{
	public int IfTest(int value) {				
		int ret=0;
		if(value % 3 == 0) {
			ret = 3;
			
		} else if(value % 4 == 0) {
			ret = 4;
		}	
		return ret;	
	}	
		public static void main(String[]args) {
			IfExam exam = new IfExam();
			System.out.println(exam. IfTest(6));
			System.out.println(exam. IfTest(8));
	}
}

