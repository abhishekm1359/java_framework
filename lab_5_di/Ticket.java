package di.constructor;

public class Ticket {
 int ticket_no;
 String city;
 int price;

// Ticket(int ticket_no , String city){
//	 this.city = city;
//	 this.ticket_no = ticket_no;
// }
// 
// Ticket(int ticket_no , String city , int price){
//	 this.city = city;
//	 this.price = price;
//	 this.ticket_no = ticket_no;
// }
 
public int getTicket_no() {
	return ticket_no;
}

public void setTicket_no(int ticket_no) {
	this.ticket_no = ticket_no;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public void display() {
	System.out.println("id is:"+ticket_no+"\ncity is : "+city+"\nprice is : "+price);
}
}
