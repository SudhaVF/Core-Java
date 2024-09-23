public class Medicine
{
	String medicineName;
	double medicineCost;
	int medicineQuantity;
	 
	 public Medicine(String medicineName,double medicineCost,int medicineQuantity)
	 {
		 this.medicineName = medicineName;
		 this.medicineCost = medicineCost;
		 this.medicineQuantity=medicineQuantity;
	 }
	 public String toString(){
		 return this.medicineName + " " + this.medicineCost + " " + this.medicineQuantity;
	 }
	 public static void main(String[] args)
	 {
		 Medicine m1=new Medicine("Paracetamol",10,2);
		 Medicine m2=new Medicine("Diclofenac ",20,3);
		 Medicine m3=new Medicine("Dolo-650",18,2);
		 Medicine m4=new Medicine("Acelofenac",24,8);
		 Medicine m5=new Medicine("Aspirin",15,3);
		 
		 System.out.println(m1);
		 System.out.println(m2);
		 System.out.println(m3);
		 System.out.println(m4);
		 System.out.println(m5);
	 }
}

		 