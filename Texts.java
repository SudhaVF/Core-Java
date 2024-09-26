import java.io.File;
public class Texts{
	public static void main(String[] args)
	{
		String path="C:\\Users\\Sudha\\Desktop\\Beasant\\sudha.txt";
		File f = new File(path);
		System.out.println(f.exists());
	}
}
