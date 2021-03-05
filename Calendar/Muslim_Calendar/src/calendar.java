
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Date and Time
 * @problem How to get month name of given date?
 * 
 */
public class calendar {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter date in dd/MM/yyyy format :");
			String date = input.next();
			// If Date is valid, converting String to Date
			Date mydate = getValidDate(date);
			if (mydate != null) {
				// Creating Calendar class instance.
				Calendar calendar = Calendar.getInstance();
				// Converting Date to Calendar.
				calendar.setTime(mydate);
				// 0 -> January, 11- December
				int month = calendar.get(Calendar.MONTH);
				String monthName = getMonthName(month);
				System.out.println("Month : " + monthName);
				String montHijrah = getMonthHijrah(month);
				System.out.println("Month : " + montHijrah);
			} else {
				System.out.println("Date is invalid.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static Date getValidDate(String date) {

		Date mydate = null;
		if (isValidDateFormat(date)) {
			/*
			 * d -> Day of month 
			 * M -> Month of year 
			 * y -> Year
			 */
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			/*
			 * By default setLenient() is true. We should make it false for
			 * strict date validations.
			 * 
			 * If setLenient() is true - It accepts all dates. If setLenient()
			 * is false - It accepts only valid dates.
			 */
			dateFormat.setLenient(false);
			try {
				mydate = dateFormat.parse(date);
			} catch (ParseException e) {
				mydate = null;
			}
		}
		return mydate;
	}

	private static String getMonthName(int month) {

		String monthName = null;
		switch (month) {
		case 0:
			monthName = "January";
			break;
		case 1:
			monthName = "February";
			break;
		case 2:
			monthName = "March";
			break;
		case 3:
			monthName = "April";
			break;
		case 4:
			monthName = "May";
			break;
		case 5:
			monthName = "June";
			break;
		case 6:
			monthName = "July";
			break;
		case 7:
			monthName = "August";
			break;
		case 8:
			monthName = "September";
			break;
		case 9:
			monthName = "October";
			break;
		case 10:
			monthName = "November";
			break;
		case 11:
			monthName = "December";
			break;
		}

		return monthName;
	}

	private static String getMonthHijrah(int month) {

		String monthName = null;
		switch (month) {
		case 0:
			monthName = "Muharram";
			break;
		case 1:
			monthName = "Safar";
			break;
		case 2:
			monthName = "Rabi Al-Awwal";
			break;
		case 3:
			monthName = "Rabi Al-Thani";
			break;
		case 4:
			monthName = "J Al-Awwal";
			break;
		case 5:
			monthName = "J Al-Thani";
			break;
		case 6:
			monthName = "Rajab";
			break;
		case 7:
			monthName = "Shaban";
			break;
		case 8:
			monthName = "Ramadan";
			break;
		case 9:
			monthName = "Shawwal";
			break;
		case 10:
			monthName = "Dhul Qadah";
			break;
		case 11:
			monthName = "Dhul Hijjah";
			break;
		}

		return monthName;
	}
	private static boolean isValidDateFormat(String date) {

		/*
		 * Regular Expression that matches String with format dd/MM/yyyy. 
		 * dd -> 01-31 
		 * MM -> 01-12 
		 * yyyy -> 4 digit number
		 */
		String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
		boolean result = false;
		if (date.matches(pattern)) {
			result = true;
		}
		return result;
	}
	
	private void HijrahConvert() {
		HijrahDate hijrah;
	}
}