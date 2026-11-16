package Pen;

public class pen1 {
	String col;
	String com;
	float price;

	public pen1(String color, String company, float priceData)
	{
		this.col = color;
		this.com = company;
		this.price = priceData;
	}
	public static void main(String[] args) {
		pen1 p1 = new pen1("red","cello",10.0f);
		System.out.println(p1.col);
		System.out.println(p1.com);
		System.out.println(p1.price);
	}
}
