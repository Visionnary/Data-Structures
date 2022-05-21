/**
 * 
 * @author Daniel Yuan
 * Identifies the type of servant by looking at the class
 * 
 * @param Type - The type of servant
 * 
 * @returns The servant's type
 *
 */
public class Identify extends Servant{
	protected String Type;
	/**
	 * This method inherits the strings: Name, Class, Rank, and NP from the Servant class
	 * 
	 * @param Name - name of the servant
	 * 
	 * @param Class - class of the servant
	 * 
	 * @param Rank - rank of the servant
	 * 
	 * @param NP - noble phantasm of the servant
	 */
	public Identify(String Name, String Class, String Rank, String NP)  
	{
		super(Name, Class, Rank, NP);
	}
	/**
	 * @returns The type of servant that the user has created as a string
	 */
	public String toString()
	{
		if(Class.contentEquals("Berserker")  || Class.contentEquals("Ruler") || Class.contentEquals("Avenger")
				|| Class.contentEquals("Shielder") || Class.contentEquals("Alter Ego")
				|| Class.contentEquals("Moon Cancer") || Class.contentEquals("Foreigner") || Class.contentEquals("Pretender")
				|| Class.contentEquals("Beast"))
		{
			Type = "Extra"; 
			return Class + "s are a " + Type + " type servant";
		}
		else if(Class.contentEquals("Saber") || Class.contentEquals("Lancer") || Class.contentEquals("Archer"))
		{
			Type = "Knight";
			return Class + "s are a " + Type + " type servant";
		}
		else if(Class.contentEquals("Caster") || Class.contentEquals("Assassin") || Class.contentEquals("Rider"))
		{
			Type = "Cavalry";
			return Class + "s are a " + Type + " type servant";
		}
		else {
			return "Not a valid class";
		}

	}
	/**
	 * @return the type
	 */
	protected String getType() {
		return Type;
	}

	/**
	 * @param type the type to set
	 */
	protected void setType(String type) {
		Type = type;
	}
}

