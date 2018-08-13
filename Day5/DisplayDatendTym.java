package Day5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayDatendTym {

	public static void main(String[] args) {
		
		int day,month,year,second, minut,hour;
		
		GregorianCalendar date= new GregorianCalendar();
		
		
		day= date.get(Calendar.DAY_OF_MONTH);
		month=date.get(Calendar.MONTH);
		year=date.get(Calendar.YEAR);
		second=date.get(Calendar.SECOND);
		minut=date.get(Calendar.MINUTE);
		hour=date.get(Calendar.HOUR);
		
		System.out.println("current date is :"+day +"/" +(month+1) +"/" +year);
		System.out.println("current time is :"+hour +":" +minut +":" +second);
		
		
		
		
		

	}

}
