package day3;

public class OfflineTraining extends Training {
	private String venueDetails;
	public OfflineTraining() {
		// TODO Auto-generated constructor stub
	}

	public OfflineTraining(String moduleName, int duration, String venuDetails) {
		super(moduleName, duration);
		this.venueDetails = venuDetails;
		
		// TODO Auto-generated constructor stub
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
	
	@Override//Asks compiler to check whether overriding is correct or not
	public void conductTraining() {
		System.out.println("Conducting the training at : " + venueDetails);
	}
	@Override
	public String getDetails() {
		String trainingDetails = super.getDetails();//Invoking 'getDetails()' from super class: Training
		String allTrainingDetails = trainingDetails + ", " + venueDetails;
		return allTrainingDetails;
	}

}
