
public class SingleFamilyHome extends Residential {
	
	private boolean garage;
	
	public SingleFamilyHome() {
		this.garage = false;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, 
			String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, 
			boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, 
				numBathrooms, laundryRoom);
		this.garage = garage;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw stub SingleFamilyHome");
	}
	
	@Override
	public String displayData() {
		return super.displayData() + "\nGarage: " + (garage ? "Y" : "N");
	}
	
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + 
	numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress=" +
				completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + 
	occupancyGroup + ", subgroup=" + subgroup + "]";
	}
}
