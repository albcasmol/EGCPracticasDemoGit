package es.egc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Test2
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test2( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Test2.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( new MisMatematicas2().multiplica(4,2) == 8 );
    }
	
	public void testApp1(){
		assertTrue( new MisMatematicas2().divide(2.0,2.0) == 1.0);
	}
	
	public void testApp2(){
		assertTrue(new MisMatematicas2().suma(2.0,2.0) == 4.0);
	}
	
	public void testApp3(){
		assertTrue(new MisMatematicas2().resta(2.0,1.0) == 1.0);
	}
}
