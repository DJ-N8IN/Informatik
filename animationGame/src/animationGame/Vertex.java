package animationGame;

public class Vertex {

	// Attribute
		public double x;
		public double y;

	// Konstruktor
		public Vertex(double x, double y){
			
			this.x=x;
			this.y=y;
			
			}
		
	// Mainmethode	
		public static void main(String[] args) {
			
			String s1="hallo";
			String s2="HallO".toLowerCase();
			
			System.out.println(s1);
			System.out.println(s2);
			
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
		
			Vertex v1 = new Vertex(15,76);
			Vertex v2 = new Vertex(0,0);
			Vertex v3 = v1.skalarMult(2);
			
			System.out.println("v1.x= "+v1.x);
			System.out.println("v2.x= "+v2.x);
			System.out.println("v1= "+v1);
			System.out.println(v1.length());
			System.out.println(v2.length());
			System.out.println("v3 = "+v3);
			System.out.println(v3.length());
			System.out.println(v1.getX());
			System.out.println(v1.equals(v2));
			
			v2.setX(15);
			v2.setY(76);
			
			System.out.println(v1.equals(v2));
	 }
		
		public String toString() {return "("+x+", "+y+")" ;}
		
		public double length() {return Math.sqrt(x*x+y*y);}
		
		public Vertex skalarMult(double s){
			return new Vertex (x*s, y*s);}
		
		public Vertex add(Vertex v){
			return new Vertex (x+v.x, y+v.y);}
		
		public void addMod(Vertex v){x=x+v.x; y=v.y;}
		
		public void multMod(Vertex v){x=x*v.x; y=y*v.y;}
		
        public double setX(double x){return this.x=x;}
		
		public double setY(double y){return this.y=y;}
		
		public double getX() {return x;}
		
		public double getY() {return y;}
		
		public boolean equals(Object thatObject){
			if(thatObject instanceof Vertex){
				Vertex that = (Vertex)thatObject;
				return this.x==that.x && this.y==that.y;
				}
			
			return false;
			
		}
	}
