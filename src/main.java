import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class main {
	
	Random rand = new Random();
	static int firstPlateNumber, indiceLetter, secondPlateNumber, indiceSections, year, month, day, indiceType;
	static char firstLetter, secondLetter, thirdLetter;
	static String theType;
	static String theSection;
	static String [] carTypes = {"car","car","car","truck","motorcycle"};
	static String [] lesSections = {"A10","A11","A12","A13","A14","A15"};
	static char [] arrayLetter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	private static HashMap<String,Car> vehicles = new HashMap<String,Car>();

	public static void main(String[] args) {
		int i = 0;
		
		Car vehicle1 = new Car("757 ASP 57","car");
		vehicles.put("757 ASP 57",vehicle1);
		Car vehicle2 = new Car("757 ASP 57","car");
		vehicles.put("757 ASP 57",vehicle2);
		Car vehicle3 = new Car("757 ASP 57","car");
		vehicles.put("111 AAA 00",vehicle3);
		Car vehicle4 = new Car("757 ASP 57","car");
		vehicles.put("111 AAA 00",vehicle4);
		
		System.out.println("Toutes les voitures:");
		
		System.out.println(vehicles.toString());
		
	}

}