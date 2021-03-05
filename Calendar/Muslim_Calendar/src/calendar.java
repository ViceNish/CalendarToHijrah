import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //HH:mm:ss"); 
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)); 
		   
		   
		   
		   String[] monthName = {"January", "February",
	                "March", "April", "May", "June", "July",
	                "August", "September", "October", "November",
	                "December"};

	        Calendar cal = Calendar.getInstance();
	        String month = monthName[cal.get(Calendar.MONTH)];

	        System.out.println("Month name: " + month);
		   
		   
		// March 20th 2018
		  // LocalDate dt = LocalDate.of(dtf.format(now));
//
		   // convert to hijrah
		   HijrahDate hijrahDate = HijrahDate.from(now);

		   // format to MM/DD/YYYY
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		   String formatted = formatter.format(hijrahDate); // 07/03/1439
		   System.out.println(formatted);
		   
		   
		   String[] monthNameI = {"January", "February",
	                "March", "April", "May", "June", "July",
	                "August", "September", "October", "November",
	                "December"};

	        Calendar calI = Calendar.getInstance();
	        String monthI = monthName[cal.get(Calendar.MONTH)];

	        System.out.println("Month name: " + monthI);
	}

}
