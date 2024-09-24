public class Product
{
	private String brand;
	private String category;
	private double price;
	
	public Product(String brand,String category,double price)
	{
		this.brand=brand;
		this.category=category;
		this.price=price;
	}
	String getDetails(){
		return this.brand + " " + this.category + " " + this.price;
	}
	public static void main(String[] args)
	{
		Product p1 = new Product("Sony", "Electronics", 50000);
		Product p2 = new Product("Puma", "Slippers", 500);
		Product p3 = new Product("Nykaa", "Lipstick", 200);
		
		Product [] ar = new Product[3];
		ar[0] = p1;
		ar[1] = p2;
		ar[2] = p3;
		for(int i= 0; i<ar.length; i++)
		{
			if(ar[i].brand == "Nykaa")
			{
				System.out.println(ar[i].getDetails());
			}
		}
	}
}
		
		
	