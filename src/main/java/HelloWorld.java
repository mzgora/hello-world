public class HelloWorld {
	public static void main(String[] args) 
	 {
		System.out.println("Hello World!\n");
		
		/*int butelka_1 = 100;
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
		*/
		
		 for(int i=99;i>1;i--)
		 { 
		      //System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" + 
		    //  "Take one down and pass it around - " + (i-1) + " bottles of beer on the wall.\n");
		     
		      if (i<3) {
		    	  System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" + 
		    		      "Take one down and pass it around - " + (i-1) + " bottle of beer on the wall.\n");
		      }
		      
		      else {
		    	  System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" + 
		    		      "Take one down and pass it around - " + (i-1) + " bottles of beer on the wall.\n");
		      }
		    }		 
		 System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" + 
	  				"Take one down and pass it around - no more bottles of beer on the wall");
	}
}