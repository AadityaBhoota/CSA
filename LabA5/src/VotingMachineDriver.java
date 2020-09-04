 
public class VotingMachineDriver {
	public static void main(String[] args) {
		VotingMachine m = new VotingMachine(1, 3, 4);
		System.out.println("Democrats: " + m.getDemocratVotes());
		System.out.println("Republicans: " + m.getRepublicanVotes());
		System.out.println("Independent: " + m.getIndependentVotes());
		m.printStats();
	}
}