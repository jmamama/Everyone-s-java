/*
public class ArrayWithFor {

	public static void main(String[] args) {
		int[] iarray = new int[100];
		
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		}
		
		int sum = 0;
		for(int i = 0; i< iarray.length; i++) {
			sum = sum +iarray[i];
		}
		System.out.println(sum);
	}

}                                  */

/*     //ex1
public class ArrayWithFor {
	public int[] fill100() {
		int[] array = new int[100];
		
		for(int i = 0; i <100; i++) {
			array[i] = i+1;
		}
		return array;
	}
	public static void main(String[] args) {
		ArrayWithFor exam = new ArrayWithFor();
		int[] arr2 = exam.fill100();
		int errCount = 0;
		
		for (int i = 0; i <100; i++) {
			if (arr2[i] != i+1) {
				System.out.println("array["+i+"]의 값이 틀립니다.");
				errCount++;
			}
		}
		if(errCount == 0)
			System.out.println("정답입니다.");
	}
}                    */   


public class ArrayWithFor {
	public int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i< array.length; i++ ) {
			sum += array[i]; 
		}			
			return sum;
		}
		public static void main(String[]args) {
			int[]testArr = new int[4];
			String str = "";
			int rightResult = 0;
			for(int i = 0; i < 4; i++) {
				testArr[i] = (int)(Math.random()*100);
				rightResult = 0;
				str+=(testArr[i]+",");
			}
			str=str.substring(0,str.length()-1);
			
			ArrayWithFor exam = new ArrayWithFor();
			int Answer = exam.sum(testArr);
			if (Answer==rightResult) {
				System.out.println("정답입니다.");
			} else {
				System.out.println(str+"를 더한 sum의 값이 틀립니다.");
			}
	}
}
