package es.egc;
import org.apache.log4j.*; 

/**
 * DIVISION
 *
 */
public class MisMatematicas2 
{
	static Logger log=Logger.getLogger(MisMatematicas.class); 
	
	public static int divide2(int a, int b){
		int result= a/b;
		log.info("Returning "+a+"/"+b+"="+result);
		return result;
		
	}
	
	public static int multiplica2(int a, int b){
		int result= a*b;
		log.info("Returning "+a+"*"+b+"="+result);
		return result;
	}
	
	public static int suma2(int a, int b){
		int result = a+b
		log.info("Returning" +a+ "+" +b+"=" result);
		return result;
	}
	
	public static int resta2(int a, int b){
		int result = a-b
		log.info("Returning" +a+ "-" +b+"=" result);
		return result;
	}
}
