/**
 * 
 * @author Daniel Yuan
 * Displays the servants attack value based on the type of servant
 * 
 * @param AttackValue - The attack value of the servant that will be displayed
 *
 *@returns The attack value of the servant 
 */
public class Attack extends Servant{
	protected double AttackValue;
	/**
	 * This method instantiates the double: AttackValue and inherits the strings Name, Class, Rank, and NP from the Servant class
	 * 
	 * @param Name - name of the servant
	 * 
	 * @param Class - class of the servant
	 * 
	 * @param Rank - rank of the servant
	 * 
	 * @param NP - noble phantasm of the servant
	 * 
	 * @param AttackValue - attack value of the servant
	 */
	public Attack(String Name, String Class, String Rank, String NP, double AttackValue)
	{
		super(Name, Class, Rank, NP);
		this.AttackValue = AttackValue;
	}
	/**
	 * @returns The attack value of the servant as a string
	 */
	public String toString()
	{
		if(Class.contentEquals("Berserker")  || Class.contentEquals("Ruler") || Class.contentEquals("Avenger")){
			AttackValue = 1.10*AttackValue;
			return Name + "'s attack value is " + this.AttackValue + " ";
		}
		else if(Class.contentEquals("Lancer")){
			AttackValue = 1.05*AttackValue;
			return Name + "'s attack value is " + this.AttackValue + " ";
		}
		else if(Class.contentEquals("Saber") || Class.contentEquals("Rider") || Class.contentEquals("Shielder") || Class.contentEquals("Alter Ego")
				|| Class.contentEquals("Moon Cancer") || Class.contentEquals("Foreigner") || Class.contentEquals("Pretender")
				|| Class.contentEquals("Beast")){
			AttackValue = 1.00*AttackValue;
			return Name + "'s attack value is " + this.AttackValue + " ";
		}
		else if(Class.contentEquals("Archer")){
			AttackValue = 0.95*AttackValue;
			return Name + "'s attack value is " + this.AttackValue + " ";
		}
		else if(Class.contentEquals("Caster") || Class.contentEquals("Assassin")){
			AttackValue = 0.90*AttackValue;
			return Name + "'s attack value is " + this.AttackValue + " ";
		}
		else {
			return Name + "'s attack value is " + this.AttackValue + " ";
		}
	}

	/**
	 * @return the attackValue
	 */
	protected double getAttackValue() {
		return AttackValue;
	}

	/**
	 * @param attackValue the attackValue to set
	 */
	protected void setAttackValue(double attackValue) {
		AttackValue = attackValue;
	}
}