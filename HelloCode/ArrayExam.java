/*
public class ArrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		
		array1[0] = 50;  //배열 array1의 0번 인덱스에 50이라는 값을 담습니다.
		array1[10] = 100;   //배열 array1의 10번 인덱스에 100이라는 값을 담습니다.
		
		int[] array2 = new int[] {1,2,3,4};
		int[] array3 = {1,2,3,4};
		System.out.println(array3[3]);
		
		int value = array3[0];
		System.out.println(value);

	}

}                  */


public class ArrayExam{
	public int[] MakeArray() {
		int [] array = {1,2,3,4,5};
		
		return array;
	}
	public static void main(String[]args) {
		ArrayExam exam = new ArrayExam();
		int [] array = exam.MakeArray();
		if(array.length==5 &&
				array[0] ==1 &&
				array[1] ==2 &&
				array[2] ==3 &&
				array[3] ==4 &&
				array[4] ==5) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
	}
}
