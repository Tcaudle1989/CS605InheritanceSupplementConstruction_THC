
public class Apartment extends Residential{
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, 
			String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom,
			int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, 
				subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw stub Apartment");
	}
	
	@Override
	public String displayData() {
		return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits + 
				"\nAverage Unit Size: " + avgUnitSize + "\nParking Available: " + 
				(parkingAvailable ? "Y" : "N");
	}
	
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize + 
				", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + 
				", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom + 
				", projectName=" + projectName + ", completeAddress=" + completeAddress + 
				", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + 
				", subgroup=" + subgroup + "]";
	}

}
