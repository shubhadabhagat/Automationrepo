package functions;

public class Patients {

	public static void main(String[] args) {
		Hospital Hospital1=new Hospital();
		Hospital1.hospitalName="Noble";
		Hospital1.docName="Sharma";
		Hospital1.patientType="Stomach Problem";
		Hospital1.NumOfDocs=13;
		Hospital1.NumOfBeds=20;
		Hospital1.speciality="General Practitioner";
		Hospital1.treatment();
		Hospital1.capacity();
		
		Hospital Hospital2=new Hospital();
		Hospital2.hospitalName="Columbia Asia";
		Hospital2.docName="Mahatre";
		Hospital2.patientType="Gynac Problem";
		Hospital2.NumOfDocs=15;
		Hospital2.NumOfBeds=25;
		Hospital2.speciality="Gynaecologist";
		Hospital2.treatment();
		Hospital2.capacity();
		
		Hospital Hospital3= new Hospital("Bone Injury","Mehta","Orthopedic",10,5,"Sancheti");
		Hospital3.treatment();
		Hospital3.capacity();

	}

}
