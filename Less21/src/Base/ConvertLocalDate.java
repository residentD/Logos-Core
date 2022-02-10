package Base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ConvertLocalDate {

	public static LocalDateTime getLocalDateTime(Date date) {

		LocalDateTime localDateTime = new java.sql.Timestamp(date.getTime()).toLocalDateTime();

		return localDateTime;

	}
	
	public static LocalDate getLocalDate(Date date) {

		LocalDateTime localDateTime = getLocalDateTime(date);
		LocalDate localDate = localDateTime.toLocalDate();
		return localDate;
	}
	
    public static LocalTime getLocalTime(Date date) {
		
		LocalDateTime localDateTime = getLocalDateTime(date);
		LocalTime localTime = localDateTime.toLocalTime();
		return localTime;
	}

}
