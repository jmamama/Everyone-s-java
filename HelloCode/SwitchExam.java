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
				System.out.println("�� �� �ٸ� ����");
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
				System.out.println("�� �� �ٸ� ����");
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
				season = "�ܿ�";
				break;
			case 3 : case 4 : case 5 :
				season = "��";
				break;
			case 6 : case 7 : case 8 :
				season = "����";
				break;
			case 9 : case 10 : case 11:
				season = "����";
				break;					
		}	
		System.out.println("������ "+month+"���̰�, "+season+"�Դϴ�.");
		}
	}

