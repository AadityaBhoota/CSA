/**
 * 
 * @author Aaditya Bhoota 
 * Period 3
 */
public class DNA_Analysis {
	//All syndromes and their DNA sequences declared as constants
	private static final String PICARD = "ACGTTCGAGATCGA";
	private static final String RIKER = "CGTAGATCATGACGA";
	private static final String TROI = "GTACCAGTACGATCAG";
	private static final String LAFORGE = "GATCGATGTGCAGACTAGCGAT";
	private static final String WORF = "ACTGGTCA";
	
	/**
	 * Checks if the given DNA sequence has the Picard's syndrome
	 * @param dna - DNA sequence
	 * @return true if the Picard's genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isPicard(String dna) {
		if (dna.indexOf(PICARD) >= 0) {
			return true;
		}
		return false;

	}
	/**
	 * Checks if the given DNA sequence has the Riker's syndrome
	 * @param dna - DNA sequence
	 * @return true if the Riker's genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isRiker(String dna) {
		if (dna.indexOf(RIKER) >= 0) {
			return true;
		}
		return false;

	}
	/**
	 * Checks if the given DNA sequence has the Troi syndrome
	 * @param dna - DNA sequence
	 * @return true if the Troi genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isTroi(String dna) {
		if (dna.indexOf(TROI) >= 0) {
			return true;
		}
		return false;

	}
	/**
	 * Checks if the given DNA sequence has the LaForge syndrome
	 * @param dna - DNA sequence
	 * @return true if the LaFprge genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isLaForge(String dna) {
		if (dna.substring(0,40).indexOf(LAFORGE) >= 0) {
			return true;
		}
		return false;


	}
	/**
	 * Checks if the given DNA sequence has the Worf syndrome
	 * @param dna - DNA sequence
	 * @return true if the Worf genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isWorf(String dna) {
		if (dna.substring(40, dna.length()).indexOf(WORF) >= 0) {
			return true;
		}
		return false;


	}
	/**
	 * Checks if the given DNA sequence has any mutation
	 * @param dna - DNA sequence
	 * @return true if there is no genetic mutation in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isHealthy(String dna) {
		return !(isPicard(dna) || isRiker(dna) || isTroi(dna) || isLaForge(dna) || isWorf(dna));

	}
	/**
	 * Returns a message with all the genetic mutations present in the dna sequence
	 * @param dna - DNA sequence
	 * @return - String containing all the genetic mutations if any is present, "Patient is healthy!" 
	 * 			message if the DNA sequence has no mutation
	 */
	public static String toString(String dna) {
		String s = "Patient \n";
		if (isHealthy(dna)) {
			s = "Patient is healthy!";
		}
		if (isPicard(dna)) {
			s += "  has Picard's Syndrome\n";
		}
		if (isRiker(dna)) {
			s += "  has Riker's Syndrome\n";
		}
		if (isTroi(dna)) {
			s += "  has Troi Syndrome\n";
		}
		if (isLaForge(dna)) {
			s += "  has LaForge Syndrome\n";
		}
		if (isWorf(dna)) {
			s += "  has Worf Syndrome\n";
		}
		return s;
	}
}