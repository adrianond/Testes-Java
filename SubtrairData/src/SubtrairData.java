import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SubtrairData {
	
	public static void main(String[] args) {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy");
		GregorianCalendar c =  new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, -10);
		String data = s.format(c.getTime());
		
		System.out.println(c.getTime());
		System.out.println(data);
	}

}
