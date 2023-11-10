package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
//		Top Cibo
	String[] food= {
			"Pizza"
			,"Panino"
			,"Lasagna"
			,"Pasta",
			"Carne",
			"Patatine",
			"Sushi",
			};
	
//	Lunghezza array
	System.out.println("Top "+food.length);
	
	System.out.println("Quello che mi piace di più: "+food[0]);
	
	System.out.println("Quello che è al centro della classifica: "+food[(food.length-1)/2]);
	
	System.out.println("Quello che mi piace di meno: "+food[food.length-1]);
	
	}
}
