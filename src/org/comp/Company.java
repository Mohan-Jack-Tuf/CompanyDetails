package org.comp;

public class Company extends Client {

	public void companyName() {
System.out.println("Company Name is GreenTech");
}
  public static void main(String[] args) {
	Company c = new Company();
	c.companyName();
	c.clientName();
	
}
}
