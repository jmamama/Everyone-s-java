
public class ForEachExam {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		for(int i = 0; i < iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		for(int value:iarr) {
			System.out.println(value);
		}
		
		int [] array2 = {1,5,3,6,7};
		for(int value:array2) {
			System.out.println(value);
		}

	}

}
