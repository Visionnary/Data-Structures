public class Identify extends Servant{
	protected String Type;
	public Identify(String Name, String Class, String Rank, String NP)  
	{
		super(Name, Class, Rank, NP);
	}

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

