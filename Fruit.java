public class Fruit
{
	String fruitName;
	double price;
	int quantity;
	
	public Fruit(String n,double p,int q)
	{
		this.fruitName=n;
		this.price=p;
		this.quantity=q;
	}
	public String toString(){
		return this.fruitName + " " + this.price + " " + this.quantity;
	}
	public static void main(String[] args)
	{
		Fruit f1=new Fruit("Apple",150,4);
		Fruit f2=new Fruit("Orange",100,5);
		Fruit f3=new Fruit("Pineapple",70,1);
		Fruit f4=new Fruit("Guava",80,3);
		Fruit f5=new Fruit("Banana",50,12);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
	}
}
		
		
	