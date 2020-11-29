import org.apache.log4j.*;

public class TestApp {
	
private static Logger log= Logger.getLogger(TestApp.class);
	
public static void main(String[] args) {

//create layout
Layout layout = new SimpleLayout();

//create appender+link layout
Appender app = new ConsoleAppender(layout);

//link appender with logger

log.addAppender(app);

log.info("From info");	
log.debug("From debug");
log.warn("From fatal");
log.error("From error");
log.fatal("From debug");

	
	
}
	

}
