/**
 * 
 * @author Aaditya Bhoota
 * period 3
 *
 */
public class RoachPopulation {
	private int population; // roach population

	/**
	 * constructor initializes the roach population
	 * @param init - initial roach population
	 */
	public RoachPopulation(int init){
		population = init;
	}
	/**
	 * roach population doubles each time the roaches breed
	 */
	public void breed(){
		population = population * 2;
	}
	
	/**
	 * roach population is reduced by 10% each time it is 
   	 * sprayed
	 */
	public void spray(){
		population -= (int) (population * 0.1);
	}
	
	/** 
	 * returns the current roach population
	 * @return number of roaches
	 */
	public int getRoaches(){
		return population;
	}
}