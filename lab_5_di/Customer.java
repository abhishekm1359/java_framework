package di.constructor;

public class Customer {
	
	Customer(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Customer(int id){
		this.id = id;
	}
	
	Customer(String name){
		this.name=name;
	}

	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("Id is :"+id+" name is :"+name);
	}
	
}
