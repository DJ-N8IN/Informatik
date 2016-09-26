
public class HelloWorld {

	static int number=0;
	
	public static void main(String[] args) {    //Primzahlen 0-10000 berechnen und nur Primzahlen ausgeben
		
		int ausgabe=0;
		
		System.out.println("Primzahlen");
		
		for(int i=number; i<=10000; i++){        //number wird als Variable hochgezählt und geprüft
			if(isPrime(i)){
			System.out.print(i +",");			// "Komma" zwischen Primzahlen
			
			ausgabe++;
			if(ausgabe%30==0){				//sobald Ausgabe durch 30 teilbar ist; neue Linie.
				System.out.println("");
				ausgabe=0; 					 //--> Ausgabe setzt sich auf 0 zurück.
				}
			
		number=i;
		 }
		}	
	}

	public static boolean isPrime(int number) {
		
		if( number == 1 || number == 0) {
				return false;
			}
		
		for (int i=2 ; i < number; i++) {
			
			if (number % i == 0)
				return false; 
			}
		
				return true;
		}
}
		
		
	

