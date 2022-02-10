import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Base.ClassDescript;
import Base.ConvertLocalDate;
import Base.Revolver;

public class Aplication {

	public static void main(String[] args) {
		
		ClassDescript.cFile(Revolver.class);
		Revolver revolver = new Revolver ("Smit", 50, LocalDate.now());
		ClassDescript.cFile(revolver.getClass());
		System.out.println("------------------");
		
		Date date = new GregorianCalendar(2020, Calendar.DECEMBER, 5, 6, 17).getTime();
		
		LocalTime localTime = ConvertLocalDate.getLocalTime(date);
		LocalDate localDate = ConvertLocalDate.getLocalDate(date);
		LocalDateTime localDateTime = ConvertLocalDate.getLocalDateTime(date);
		
		System.out.println("Date - " + date);
		System.out.println("Local Time - " + localTime);
		System.out.println("Local Date - " + localDate);
		System.out.println("Local Date Time - " + localTime);
		
	}
	
	
}
