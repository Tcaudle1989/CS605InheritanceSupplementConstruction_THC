
public class Residential extends Building{
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, 
			String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, 
			boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing code for Residential");
		}
	
	@Override
	public String displayData() {
		return super.displayData() + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " 
				+ numBathrooms + "\nLaundry Room: " + (laundryRoom ? "Y" : "N");
	}
	
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms +
				", laundryRoom=" + laundryRoom + ", projectName=" + projectName + 
				", completeAddress=" + completeAddress + ", totalSquareFeet=" + 
				totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" +
				subgroup + "]";
	}
	
	
}
