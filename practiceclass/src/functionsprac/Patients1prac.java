package functionsprac;

public class Patients1prac {
	public static void main(String[] args)
	{
		Hospitalprac hospital1=new Hospitalprac();
		hospital1.hospitalname="ColumbiaAsia";
			hospital1.patientType="Toothproblem";
			hospital1.speciality="Dentist";
			hospital1.numofbeds=30;
			hospital1.numofdoc=20;
			hospital1.doctorName="Dr.Jha";
			hospital1.treatment();
			hospital1.capacity();
			
			Hospitalprac hospital2=new Hospitalprac();
			hospital2.hospitalname="Sahyadri";
			hospital2.patientType="Bone injury";
			hospital2.speciality="Orthopedic";
			hospital2.numofbeds=50;
			hospital2.numofdoc=40;
			hospital2.doctorName="Dr.Deshmukh";
			hospital2.treatment();
			hospital2.capacity();
			
			Hospitalprac hospital3=new Hospitalprac();
			hospital3.treatment();
			hospital3.capacity();
	}

}
