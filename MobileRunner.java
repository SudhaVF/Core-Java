class Mobile
{
	private String brand;
	private int price;
	private int warranty;
	
	public void setBrand(String b)
	{
		this.brand=b;
	}
	public void setPrice(int p)
	{
		if(p>20000 && p<30000)
		{
			this.price=p;
		}
		else{
			System.out.println("Invalid Price");
		}
	}
	public void setWarranty(int w)
	{
		if(w>2)
		{
			this.warranty=w;
		}
		else{
			System.out.println("Invalid Warranty");
		}
	}
	public String getBrand()
	{
		return this.brand;
	}
	public int getPrice()
	{
		return this.price;
	}
	public int getWarranty()
	{
		return this.warranty;
	}
}
public class MobileRunner
{
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile();
		m1.setBrand("BMW");
		System.out.println(m1.getBrand());
		
		m1.setPrice(25000);
		System.out.println(m1.getPrice());
		
		m1.setWarranty(3);
		System.out.println(m1.getWarranty());
	}
}