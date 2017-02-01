package es.egc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Test1
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test1( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Test1.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( new MisMatematicas().divide(2,2) == 1 );
    }
	
	public void testApp1(){
		assertTrue( new MisMatematicas().multiplica(2,2) == 4);
	}
	
	public void testApp2(){
		assertTrue( new MisMatematicas().suma(2,3) == 5);
	}
	
	public void testApp3(){
		assertTrue( new MisMatematicas().resta(2,2) == 0);
	}
	
}
