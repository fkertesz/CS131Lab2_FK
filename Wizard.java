/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley, Fanni Kertesz
 * @version 1.0
 * Lab 2
 * CS131
 *
 */
public class Wizard implements Lockable
{
	
	private String name;
	private int health;
	private int key;
	private boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard()
	{
		name = "";
		health = 0;
		key = 0;
		locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name)
	{
		this.name = name;
		health = 0;
		key = 0;
		locked = false;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power)
	{
		if(!this.isLocked())
		health -= power;
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName()
	{
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth()
	{
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health)
	{
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey()
	{
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
	/*
	 * setter for key which can only happen if the key value is greater than
	 * 0 and the key has not been set yet
	 * @param key value to be set
	 */
	public void setKey(int key)
	{
		if((key > 0)&&(this.key == 0))
			this.key = key;
	}//end setKey
	
	/*
	 * potential key value is passed in and if that key value matches
	 * the set key value, the wizard is locked; otherwise it doesn't lock
	 * @param key value
	 */
	public void lock(int key)
	{
		if(key == this.key)
			locked = true;
	}//end lock
	
	/*
	 * potential key value is passed in and if that key value matches
	 * the set key value, the wizard is unlocked; otherwise it doesn't unlock
	 * @param key value
	 */
	public void unlock(int key)
	{
		if(key == this.key)
			locked = false;
	}//end unlock
	
	/*
	 * checks if the wizard is locked
	 * @return
	 */
	public boolean isLocked()
	{
		return locked;
	}//end isLocked
	
}//end class
