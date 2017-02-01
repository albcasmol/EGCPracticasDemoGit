package es.egc;
import org.apache.log4j.*; 

/**
 * DIVISION
 *
 */
public class MisMatematicas2 
{
	static Logger log=Logger.getLogger(MisMatematicas.class); 
	
	public static double divide2(double a, double b){
		double result= a/b;
		log.info("Returning "+a+"/"+b+"="+result);
		return result;
		
	}
	
	public static double multiplica2(double a, double b){
		double result= a*b;
		log.info("Returning "+a+"*"+b+"="+result);
		return result;
	}
	
	public static double suma2(double a, double b){
		double result = a+b
		log.info("Returning" +a+ "+" +b+"=" result);
		return result;
	}
	
	public static double resta2(double a, double b){
		double result = a-b
		log.info("Returning" +a+ "-" +b+"=" result);
		return result;
	}
}
