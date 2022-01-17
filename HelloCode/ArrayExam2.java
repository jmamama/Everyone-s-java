
public class ArrayExam2 {

	public static void main(String[] args) {
		
/*		int [][] array4 = new int[3][4];
		array4[0][1] = 10;
		
		int [][] array5 = new int[3][];
		array5[0] = new int[1];
		array5[0] = new int[2];
		array5[0] = new int[3];
		array5[0][0] = 10;
		
		int[][] array6 = {{1},{1,2},{1,2,3}};
		System.out.println(array6[2][2]);   */
		
		int[][] array = {{1},{1,2},{1,2,3},{1,2,3,4}};
		for(int i = 0; i < array.length; i++) {
			System.out.println((i+1)+ "번째 줄을 출력합니다>");
			for(int j = 0; j< array[i].length; j++) { 
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}
