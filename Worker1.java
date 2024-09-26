//Serialization
import java.io.File;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Worker1{
	String name;
	int id;
	int sal;
	Worker1(String name,int id,int sal){
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String toString(){
		return "Name:"+name+",id:"+id+",sal:"+sal+"," ;
	}
	public static void main(String[] args)throws IOException
	{
		String path="C:\\Users\\Sudha\\Desktop\\Beasant\\sudha.txt";
		File f=new File(path);
		
		Worker1 w1 = new Worker1("Sudha",101,25000);
		Worker1 w2 = new Worker1("Rekha",102,28000);
		Worker1 w3 = new Worker1("Prajakta",103,35000);
		Worker1 w4 = new Worker1("Soubhagya",104,40000);
		Worker1 w5 = new Worker1("Sukanya",105,38000);
		
		Worker1 ar[] = {w1,w2,w3,w4,w5};
		
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		for(int i=0; i<ar.length; i++){
			oo.writeObject(ar[i]);
			oo.flush();
		}
	}
}