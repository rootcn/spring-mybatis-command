package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger log = LoggerFactory.getLogger(App.class);
    	
    	log.debug("ha ha.");
    	
        System.out.println( "Hello World!" );
    }
}
