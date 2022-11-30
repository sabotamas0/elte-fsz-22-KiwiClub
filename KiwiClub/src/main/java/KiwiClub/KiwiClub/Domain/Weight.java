package KiwiClub.KiwiClub.Domain;

public class Weight {

	private int avgWeight;
	private int yourKiwisWeight;
	
	public Weight() {
		
	}
	
	public Weight(int yourKiwisWeight) {
		this.yourKiwisWeight = yourKiwisWeight;
	}

	public int getAvgWeight() {
		return avgWeight;
	}
	public void setAvgWeight(int avgWeight) {
		this.avgWeight = avgWeight;
	}
	public int getYourKiwisWeight() {
		return yourKiwisWeight;
	}
	
	
	
}
