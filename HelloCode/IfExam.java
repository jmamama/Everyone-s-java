
/*public class IfExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
	//	if(x < y) {                                           //if�� ����
	//		System.out.println("x�� y���� �۽��ϴ�. ");
			
	//	if( x > y ) {
	//		System.out.println("x�� y���� �۽��ϴ�. ");
			
		if( x > y ) {
			System.out.println("x�� y���� Ů�ϴ�. ");
			System.out.println("test 1");
		}	
		if( x > y ) 
			System.out.println("x�� y���� Ů�ϴ�. ");
			System.out.println("test 2");
			
		if(x == y) {                                         //if-else��
			System.out.println("x�� y�� �����ϴ�.");
		} else {
			System.out.println("x�� y�� �ٸ��ϴ�.");          
		}
		
		
		if(x == y) {                                         //if-else if-else��
			System.out.println("x�� y�� �����ϴ�.");
		} else if(x > y){
			System.out.println("x�� y���� Ů�ϴ�.");
		} else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}  
		int vaule = 6;
		
		if(vaule % 3 ==0) {
			System.out.println(vaule+"��(��) 3�� ����Դϴ�.");
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

