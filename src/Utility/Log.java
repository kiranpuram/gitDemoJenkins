package Utility;

/*import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;*/
import org.apache.log4j.Logger;

public class Log {
	
	private static Logger log = Logger.getLogger(Log.class.getName());
	
	
	public static void startTestCase(String testCaseName)
	{
		log.info("The Test Case****===>>>" + testCaseName + "<<<===**** Has Started");
	}
	
	public static void endTestCase(String testCaseName)
	{
		log.info("The Test Case****===>>>" + testCaseName + "<<<=== ****Has Ended");
	}
	
	public static void infoLog(String msg)
	{
		log.info(msg);
	}
	
	public static void warnLog(String msg)
	{
		log.warn(msg);
	}
	public static void errorLog(String msg)
	{
		log.error(msg);
	}
	public static void debugLog(String msg)
	{
		log.debug(msg);
	}
	public static void fatalLog(String msg)
	{
		log.fatal(msg);
	}
	
	

}
