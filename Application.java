/**
 * This Application class tests the Wizard class and its methods
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 2
 * CS131
 */

public class Application
{
	/*
	 * general main method
	 */
	public static void main(String[] args)
	{	
	Wizard w = new Wizard("wizardman"); //instantiates a Wizard object
	
	//sets key and health values and prints out original values
	w.setKey(7);
	w.setHealth(11);
	System.out.println(w.toString());
	
	/* 
	 * tests what happens with methods if the key passed in matches
	 * the wizard's key or does not
	 */
	w.takeDamage(2);//should subtract from health
	w.lock(7);//matches
	w.takeDamage(1);//should subtract from health
	System.out.println(w.toString());
	w.unlock(6);//does NOT match
	w.takeDamage(1);//should NOT subtract from health
	System.out.println(w.toString());
	w.unlock(7);//matches
	w.takeDamage(1);//should NOT subtract from health
	System.out.println(w.toString());
	w.lock(6);//does NOT match
	w.takeDamage(1);//should subtract from health
	System.out.println(w.toString());
	
	}//end main
}//end class
