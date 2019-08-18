package edu.escuelaing.arem.ASE.app;


import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

    /**
     * Test 1
     * @throws IOException 
     * @throws FileNotFoundException 
     */
	
	@Test
	public void testCase1() throws FileNotFoundException, IOException {
		LinkedList list = new LinkedList(); 
		LinkedList list1 = new LinkedList(); 
		
		list=App.readData("prueba.txt");
		list1=App.readData("prueba1.txt");
		
		try {
			assertEquals(App.mean(list),60.32,2);
			assertEquals(App.standardDesviation(list),62.26,2);
			assertEquals(App.mean(list1),550.6,2);
			assertEquals(App.standardDesviation(list1),572.03,2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

    /**
     * Test 2
     * @throws IOException 
     * @throws FileNotFoundException 
     */
	@Test
    public void testApp() throws FileNotFoundException, IOException
    {
		LinkedList list = new LinkedList(); 
		
		list=App.readData("prueba.txt");
		
		// Print the LinkedList 
		list.printList(list); 
		System.out.println("Mean: " + App.mean(list));
		System.out.println("Standard desviation: " + App.standardDesviation(list));
		try {
			assertFalse(App.mean(list)==60);
			assertFalse(App.standardDesviation(list)==62.2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
    
    }
}
