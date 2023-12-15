import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;  
class LocalTimeExample { 
	public static void main(String[] args) {  
System.out.println(ZonedDateTime.now());                              // Output: 2016-11-21T12:13:28.960+05:30[Asia/Calcutta]
System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Athens")));    // Output: 2016-11-21T08:43:28.960+02:00[Europe/Athens]

	}
}  
// The while loop will run for 1 second
