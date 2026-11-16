package constructor;
public class overload {
	
		String col;
		String comp;
		float price;
		
		public overload() {
			this.col="red";
			this.comp="hp";
			this.price=10.0f;
		}
		
		public overload(String c,String co,float p) {
			this.col=c;
			this.comp=co;
			this.price=p;
		}
		
		public static void main(String[] args) {
			overload p1 = new overload();
			overload p2 = new overload("blue","dell",20.0f);
			
			System.out.println(p1.col);
			System.out.println(p1.comp);
			System.out.println(p1.price);
			
			System.out.println(p2.col);
			System.out.println(p2.comp);
			System.out.println(p2.price);
		}
	}
