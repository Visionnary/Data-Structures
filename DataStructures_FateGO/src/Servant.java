
/**
 * @author Daniel Yuan
 * Creates a servant where the user will input the parameters
 * 
 * @param Name - name of the servant
 * 
 * @param Class - class of the servant
 * 
 * @param Rank - rank of the servant
 * 
 * @param NP - noble phantasm of the servant
 * 
 *@returns The servant and its paramters
 */
public class Servant {
	protected String Name;
	protected String Class;
	protected String Rank;
	protected String NP;
	/**
	 * This method instantiates the strings: Name, Class, Rank, and NP
	 * 
	 * @param Name - name of the servant
	 * 
	 * @param Class - class of the servant
	 * 
	 * @param Rank - rank of the servant
	 * 
	 * @param NP - noble phantasm of the servant
	 */
	public Servant(String Name, String Class, String Rank, String NP)
	{
		this.Name = Name;
		this.Class = Class;
		this.Rank = Rank;
		this.NP = NP;
	}

	/**
	 * @returns The parameters of the servant as comma separated values
	 */
	public String toCsv(){
		return "Name: " + this.Name + ", " +  "Class: " + this.Class +  ", " + " Rank: " + this.Rank + ", " + " Noble Phantasm: " + this.NP;
	}

	/**
	 * @return the name
	 */
	protected String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		Name = name;
	}

	/**
	 * @param class1 the class to set
	 */
	protected void setClass(String class1) {
		Class = class1;
	}

	/**
	 * @return the rank
	 */
	protected String getRank() {
		return Rank;
	}

	/**
	 * @param rank the rank to set
	 */
	protected void setRank(String rank) {
		Rank = rank;
	}

	/**
	 * @return the nP
	 */
	protected String getNP() {
		return NP;
	}

	/**
	 * @param nP the nP to set
	 */
	protected void setNP(String nP) {
		NP = nP;
	}
}