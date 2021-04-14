import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class snippets {

//Converting int to String and Strings to int
    String a = String.valueOf(2);   //integer to numeric string
    int i = Integer.parseInt(a); //numeric string to an int


//Converting String to date in Java

        
    SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy" );
    private String myString;
    Date date = format.parse( myString );

    public snippets() throws ParseException {
    }


//Converting Java util.Date to sql.Date

    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());


}
