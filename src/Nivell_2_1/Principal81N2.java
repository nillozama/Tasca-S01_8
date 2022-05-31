package Nivell_2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal81N2 {
	
	public static void main(String [] args) {
		
		List <String> llistaStringsAmbFiltre=new ArrayList<String>();
		List <String> llistaStrings=Arrays.asList("Arturo", "Oscar", "Manuel", "Jose", "Eva", "Ana", "Lucia", "Lucas", "Ada", "Antonio",
				"Sol", "Ala", "Antonia", "Aitor", "Ona", "Aria");

		llistaStringsAmbFiltre=(ArrayList<String>) filtrarStrings(llistaStrings);
		llistaStringsAmbFiltre.stream().forEach(n->System.out.println(n));
	}
	
	public static List<String> filtrarStrings(List<String> llistaStrings) {

		List<String> llistaStringsAmbFiltre = llistaStrings.stream()
		    .filter(p -> p.startsWith("A")&&p.length()==3)
		    .collect(Collectors.toList());

		return llistaStringsAmbFiltre;
	}
	
}
