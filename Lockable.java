/**
 * This interface is implemented in class Wizard
 * to create a wizard for a D&D type game.
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 2
 * CS131
 *
 */
public interface Lockable
{
	//collection of abstract methods
	
	public void setKey(int key);
	
	public void lock(int key);
	
	public void unlock(int key);
	
	public boolean isLocked();
}//end interface
