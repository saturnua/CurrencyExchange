package Curency;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayData {

	static public String todayDate(){
		Date date = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		return format1.format(date);
	}
}
