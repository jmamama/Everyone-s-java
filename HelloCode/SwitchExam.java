/*
public class SwitchExam {

	public static void main(String[] args) {
		int value = 2;
		
		switch(value) {
			case 1:
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 3 :
				System.out.println("3");
				break;
			default:
				System.out.println("그 외 다른 숫자");
		}
		
		String str ="A";
		
		switch(str) {
			case "A" :
				System.out.println("A");
				break;
			case "B" :
				System.out.println("B");
				break;
			case "C" :
				System.out.println("C");
				break;
			default :
				System.out.println("그 외 다른 문자");
		}

	}

}   */

import java.util.Calendar;
public class SwitchExam{
	public static void main(String[] args) {
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		String season = "";
		
		switch(month) {
			case 12 : case 1 : case 2 :
				season = "겨울";
				break;
			case 3 : case 4 : case 5 :
				season = "봄";
				break;
			case 6 : case 7 : case 8 :
				season = "여름";
				break;
			case 9 : case 10 : case 11:
				season = "가을";
				break;					
		}	
		System.out.println("지금은 "+month+"월이고, "+season+"입니다.");
		}
	}

