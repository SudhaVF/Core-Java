class College
{
	String name;
	String location;
	int noOfStudents;
	String branch;
	int fees;
	
	public static void main(String[] args)
	{
		College C1=new College();
		C1.name="HIT";
		C1.location="Nidasoshi";
		C1.noOfStudents=60;
		C1.branch="CSE";
		C1.fees=85000;
		
		College C2=new College();
		C2.name="AIT";
		C2.location="Belagavi";
		C2.noOfStudents=90;
		C2.branch="EEE";
		C2.fees=90000;
		
		College C3=new College();
		C3.name="KLE";
		C3.location="Chikkodi";
		C3.noOfStudents=120;
		C3.branch="ECE";
		C3.fees=95000;
		
		System.out.println(C1.name);
		System.out.println(C1.location);
		System.out.println(C1.noOfStudents);
		System.out.println(C1.branch);
		System.out.println(C1.fees);
		
		System.out.println(C2.name);
		System.out.println(C2.location);
		System.out.println(C2.noOfStudents);
		System.out.println(C2.branch);
		System.out.println(C2.fees);
		
		System.out.println(C3.name);
		System.out.println(C3.location);
		System.out.println(C3.noOfStudents);
		System.out.println(C3.branch);
		System.out.println(C3.fees);
	}
}
		
		