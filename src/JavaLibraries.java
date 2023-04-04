import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaLibraries {
	
	public static void main(String[] args) {
	
		GregorianCalendar calendar =new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)-1);
		System.out.println(calendar.getTime());
		GregorianCalendar birthday =new GregorianCalendar(1976,11,5);
		Date birthDate = birthday.getTime();
		System.out.println(birthday);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String cleanDate = sdf.format(birthDate);
		System.out.println(cleanDate);
		LocalDateTime theDateAndTime = LocalDateTime.now();
		LocalDate smeDate = LocalDate.of(2001, 9, 13);
		LocalTime smeTime = LocalTime.from(theDateAndTime);
		System.out.println(theDateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
		System.out.println(smeDate);
		System.out.println(smeTime);
		
		LocalDate bDay =LocalDate.of(2001, 9, 13);
		LocalDate tDay =LocalDate.now();
		System.out.println(Period.between(tDay, bDay));
		
				
	}

}
