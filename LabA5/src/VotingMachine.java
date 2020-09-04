/**
 * 
 * @author Aaditya Bhoota
 * period 3
 *
 */
public class VotingMachine {
	// Instance variables
	private int demoVotes;
	private int repubVotes;
	private int indepVotes;
	
	// Default constructor
	public VotingMachine() {
	}
	
	// Parameter constructor
	public VotingMachine(int d, int r, int i) {
		demoVotes = d;
		repubVotes = r;
		indepVotes = i;
	}
	
	// Getters
	public int getDemocratVotes() {
		return demoVotes;
	}
	public int getRepublicanVotes() {
		return repubVotes;
	}
	public int getIndependentVotes() {
		return indepVotes;
	}
	
	// Setters
	public void setDemocratVotes(int d) {
		demoVotes = d;
	}
	public void setRepublicanVotes(int r) {
		repubVotes = r;
	}
	public void setIndependentVotes(int i) {
		indepVotes = i;
	}
	
	// Method to add 1 vote for democrat, republican, or independent
	public void voteDemocrat() {
		demoVotes ++;
	}
	public void voteRepublican() {
		repubVotes ++;
	}
	public void voteIndependent() {
		indepVotes ++;
	}
	
	public void clear() {
		demoVotes = 0;
		repubVotes = 0;
		indepVotes = 0;
	}
	
	// Method to add any number of votes for democrat, republican, or independent
	public void voteDemocrat(int d) {
		demoVotes += d;
	}
	public void voteRepublican(int r) {
		repubVotes += r;
	}
	public void voteIndependent(int i) {
		indepVotes += i;
	}
	
	// Method to calculate total number of votes
	public int totalVotes() {
		return demoVotes + repubVotes + indepVotes;
	}
	
	// Methods to calculate percent votes for democrat, republican. or independent
	public double percentDemocrat() {
		return 100 * (double)(demoVotes)/totalVotes();
	}
	public double percentRepublican() {
		return 100 * (double)(repubVotes)/totalVotes();
	}
	public double percentIndependent() {
		return 100 * (double)(indepVotes)/totalVotes();
	}
	
	// Method to print results
	public void printStats() {
		System.out.println("Total Votes: " + totalVotes());
		System.out.println("Percent Democrat Votes: " + percentDemocrat());
		System.out.println("Percent Republican Votes: " + percentRepublican());
		System.out.println("Percent Independent Votes: " + percentIndependent());
	}
}
 