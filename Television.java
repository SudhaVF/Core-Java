public class Television
{
	String brand;
	double price;
	String quality;
	Television(String b,double p,String q){
		this.brand=b;
		this.price=p;
		this.quality=q;
	}
	public String toString(){
		return "Television(brand=" +brand+", price=" +price+", quality="+quality+")";
	}
	Television(Television t){
		this.brand=t.brand;
		this.price=t.price;
		this.quality=t.quality;
	}
	public static void main(String[] args)
	{
		Television t1=new Television("LG",25000,"Good");
		Television t2=new Television(t1);
		System.out.println(t1);
		System.out.println(t2);
	}
}

		
		
		
