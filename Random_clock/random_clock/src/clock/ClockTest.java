package clock;

public class ClockTest {
//	private String name;
//	private int second;
//	private int minute;
//	private int hour;
//	private int day;
	
			// second = 60�� �Ǹ� minute���� 1�� �Ѿ
			// minute�� 60�� �Ǹ� hour�� 1�� �Ѿ
			// hour�� 24�� �Ǹ� day�� 1�� �Ѿ
			// day�� 365�� �Ǹ� year�� 1�� �Ѿ	
	

	public static void main(String[] args) {
		Clock check = new Clock();
		
		int rdsec = (int)(Math.random()*500);
		int rdmin = (int)(Math.random()*500);
		int rdhour = (int)(Math.random()*500);
		
		int nsec = 0;
		int nmin = 0;
		int nhour = 0;
		int nday = 0;
		
		
		if (rdsec % 60 != 0) { //sec ������ minute���� �ѱ�� ������sec �״��
			nmin = rdsec / 60;
			nsec = rdsec % 60;
		} else if (rdsec % 60 == 0) {
			nmin = rdsec / 60;
		}
		
		
	
		if (rdmin % 60 != 0) {//min ������ hour���� �ѱ�� ������min �״��
			nhour = rdmin / 60;
			nmin = rdmin % 60;
		} else if (rdmin % 60 == 0) {
			nhour = rdmin / 60;
		}
		
		
		if (rdhour % 24 != 0) { //hour ������ day���� �ѱ�� ������hour �״��
			nday = rdhour / 24;
			rdhour = rdhour % 24;
		} else if (rdhour % 24 == 0) {
			nday = rdhour / 24;
		}
		
		System.out.println(nday + "��° " + nhour + "�ð� " + nmin + "�� " + nsec + "��");

		

	}

}