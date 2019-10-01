package functions;

public class Hospital {

	public String patientType;
	public String doctorName;
	public String speciality;
	public int numOfBeds;
	public int numOfDoctors;
	public String hospitalName;

	public void treatment() {
		System.out.println("Patients with " + patientType + " will be sent to " + speciality + " doctor " + doctorName);
	}

	public void capacity() {
		System.out.println(hospitalName + " hospital has " + numOfBeds + " beds and " + numOfDoctors + " doctors");
	}
	//Default Constructor
	  public Hospital() {
	  
	  }
	 
	//Parameterised Constructor
	public Hospital(String patientType,String doctorName,String speciality,int numOfBeds,int numOfDoctors,String hospitalName)
	{
		this.patientType=patientType;
		this.doctorName=doctorName;
		this.speciality=speciality;
		this.numOfBeds=numOfBeds;
		this.numOfDoctors=numOfDoctors;
		this.hospitalName=hospitalName;
	}
	
}
