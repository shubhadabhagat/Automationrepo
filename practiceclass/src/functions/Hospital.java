package functions;

public class Hospital {
	 String hospitalName;
	 String docName;
	 String speciality;
	 int NumOfBeds;
	 int NumOfDocs;
	 String patientType;
	public void treatment() {
		System.out.println("Patients with "+ patientType +" will be treated by doctor "+ docName +" with speciality in "+ speciality +"");
	}
public void capacity() {
	System.out.println("Hospital "+hospitalName+" has +NumOfBeds+ and +NumOfDocs+ doctors");
	

}
	
	  public Hospital() {
	  
	  } public Hospital(String patientType,String docName,String speciality,int
	  NumOfBeds,int NumOfDocs,String hospitalName) { this.patientType=patientType;
	  this.docName=docName; this.speciality=speciality; this.NumOfBeds= NumOfBeds;
	  this.NumOfDocs=NumOfDocs; this.hospitalName=hospitalName; }
	 
}
