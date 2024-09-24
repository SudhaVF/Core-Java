import java.util.TreeSet;

public class Person implements Comparable <Person>
{
	String name;
	Integer sal;
	Integer age;
	public Person(String name,Integer sal,Integer age){
		super();
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getSal(){
		return sal;
	}
	public void setSal(Integer sal){
		this.sal = sal;
	}
	public int getAge(){
		return age;
	}
	public void setAge(Integer age){
		this.age = age;
	}
	public String toString() {
		return "Person[name="+name+",sal="+sal+",age="+age+"]";
	}

	public int compareTo(Person o){
		return this.name.compareTo(o.name);
	}
	public static void main(String[] args){
		Person p1 = new Person("Sudha",10000,22);
		Person p2 = new Person("Rekha",50000,25);
		Person p3 = new Person("Sukanya",25000,23);
		Person p4 = new Person("Soubhagya",30000,27);
		Person p5 = new Person("Prajakta",10000,22);
		
		TreeSet <Person> t = new TreeSet<>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		t.add(p5);
		
		for(Person p:t){
		
		System.out.println(p);
		}
	}
}
		
		