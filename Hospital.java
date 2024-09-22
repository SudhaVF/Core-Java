//Non-Primitive Array

public class Hospital
{
	private String patientName;
	private String diseaseType;
	private double bill;
	
	public Hospital(String patientName,String diseaseType,double bill){
		this.patientName=patientName;
		this.diseaseType=diseaseType;
		this.bill=bill;
	}
	String getDetails(){
		return this.patientName + " " + this.diseaseType + " " + this.bill;
	}
	
	public static void main(String[] args){
		
		Hospital h1 = new Hospital("Sudha", "Dengue", 10000);
		Hospital h2 = new Hospital("Rekha", "Corona", 50000);
		Hospital h3 = new Hospital("Prajakta", "Dengue", 10000);
		Hospital h4 = new Hospital("Sukanya", "Cancer", 100000);
		Hospital h5 = new Hospital("Soubhagya", "allergy", 5000);
		
	
		Hospital [] ar = new Hospital[5];
		ar[0] = h1;
		ar[1] = h2;
		ar[2] = h3;
		ar[3] = h4;
		ar[4] = h5;
		
		//diseaseType is dengue
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].diseaseType.equals("Dengue"))
			{
				System.out.println(ar[i].getDetails());
			}
		}
		
		//total bill more than 5000
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].bill>5000)
			{
				System.out.println(ar[i].getDetails());
			}
		}
	}
}
	