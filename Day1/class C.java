package multi;


	public class C implements A,B {

		public void java() {
			System.out.println("learning java");
		}
		
		public void content() {
			System.out.println("content");
		}
		
		public static void main(String[] args) {
			C c = new C();
			c.java();
			c.content();
		}
	}

