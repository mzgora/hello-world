public class HelloWorld {
	public static void main(String[] args) 
	 {
		System.out.println("Hello World!\n");
		
		int butelka_1 = 100;
		int butelka_2 = 98;

	String tekst1 = "bottles of beer on the wall,";
	String tekst2 = "bottles of beer.";
	String tekst3 = "Take one down and pass it around -"; 
	String tekst4 = "no more bottles of beer on the wall."; 
	    for(int i=0; i<98; i++)
	    {
	      System.out.println(--butelka_1 +" "+tekst1+" "+ butelka_1 +" "+tekst2);	  
	      System.out.println(tekst3+" "+ butelka_2-- +" "+tekst2);
	      System.out.println();
	    }
	    
	      System.out.println("1 " +tekst1 +" "+ "1" +" "+tekst2);
	      System.out.println(tekst3+" "+tekst4);
		
	}
}