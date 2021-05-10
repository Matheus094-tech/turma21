package Exemplos;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class dataTeste {

	public static void main(String[] args) {
		
		
		LocalDate datas = java.time.LocalDate.now();
		Instant   hora = java.time.Instant.now();
		System.out.println(datas);
		System.out.println(hora);
		Calendar.getInstance();
		GregorianCalendar.getInstance();
		System.out.println(Calendar.DATE);
        System.out.println(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(GregorianCalendar.getInstance());
		

	}

}
