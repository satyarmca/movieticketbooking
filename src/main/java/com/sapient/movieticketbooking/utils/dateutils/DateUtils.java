package com.sapient.movieticketbooking.utils.dateutils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	public static Date stringToDate(String sourceDate) {
		Date parsedDate = null;
		try {
			parsedDate = (Date) formatter.parse(sourceDate);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception:" + e);
		}
		return parsedDate;
	}
	
	public static String dateToString(Date sourceDate) {
		String formattedDate = null;
		try {
			formattedDate =  formatter.format(sourceDate);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception:" + e);
		}
		return formattedDate;
	}

}
