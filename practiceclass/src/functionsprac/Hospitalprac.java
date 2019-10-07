package functionsprac;

public class Hospitalprac {
	public String patientType;
	public String doctorName;
	public String speciality;
	public int numofbeds;
	public int numofdoc;
	public String hospitalname;

	public void treatment() {
		System.out.println("A patient with " + patientType + " will go to " + speciality + " doctor " + doctorName
				+ " for treatment");
	}

	public void capacity() {
		System.out.println(hospitalname + " Hospital has " + numofbeds + " beds and " + numofdoc + " doctors");
	}

	public Hospitalprac() 
	{

	}

	public Hospitalprac(String patientType, String doctorName, String speciality, int numofbeds, int numofdoc,
			String hospitalname)
	{
		this.patientType = patientType;
		this.doctorName=doctorName;
		this.speciality=speciality;
		this.numofbeds=numofbeds;
		this.numofdoc=numofdoc;
		this.hospitalname=hospitalname;

	}

}
