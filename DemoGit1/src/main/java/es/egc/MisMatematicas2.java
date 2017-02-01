package es.egc;
import org.apache.log4j.*; 
/**
 * Multiplica2
 * Divide2
 * Suma2
 * RaizCuadrada
 * Resta2
 */
public class MisMatematicas2 
{
	static Logger log=Logger.getLogger(MisMatematicas.class); 
	
	public static double divide2(double c, double b){
		double result= c/b;
		log.info("Returning "+c+"/"+b+"="+result);
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
	
	public static double raizCuadrada(double a){
		double result = Math.sqrt(a);
		log.info("Returning Squrt("+a+") =" result);
	}
	
	public static double resta2(double a, double b){
		double result = a-b
		log.info("Returning" +a+ "-" +b+"=" result);
		return result;
	}
}
