/*
public class ArrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		
		array1[0] = 50;  //�迭 array1�� 0�� �ε����� 50�̶�� ���� ����ϴ�.
		array1[10] = 100;   //�迭 array1�� 10�� �ε����� 100�̶�� ���� ����ϴ�.
		
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
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}
}
