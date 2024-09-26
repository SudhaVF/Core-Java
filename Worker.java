import java.io.File;
import java.io.FileWriter;
class Worker{
	String name;
	int id;
	int sal;
	Worker(String name,int id,int sal){
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String toString(){
		return "Name:"+name+",id:"+id+",sal:"+sal+"," ;
	}
	public static void main(String[] args)throws Exception{
		String path = "C:\\Users\\Sudha\\Desktop\\Beasant\\sudha.txt";
		File f = new File(path);
		Worker w1 = new Worker("Sudha",101,25000);
		Worker w2 = new Worker("Rekha",102,28000);
		Worker w3 = new Worker("Prajakta",103,35000);
		Worker w4 = new Worker("Soubhagya",104,40000);
		Worker w5 = new Worker("Sukanya",105,38000);
		
		Worker ar[] = {w1,w2,w3,w4,w5};
		FileWriter fw = new FileWriter(f);
		for(int i=0; i<ar.length; i++){
			fw.write(ar[i]+"");
			fw.flush();
		}
	}
}