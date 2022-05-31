package NIvell_2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal82N2 {

	public static void main(String [] args) {
		
		List <String> llistaStringsAmbFiltre;
		List <Integer> llistaEnters=Arrays.asList(1,2,3,4,23,46,89,32,7,21);

		llistaStringsAmbFiltre=(ArrayList<String>) filtrarNombres(llistaEnters);
		System.out.println(llistaStringsAmbFiltre);
	}
	
	public static List<String> filtrarNombres(List<Integer> llistaEnters) {

		return llistaEnters.stream()
			    .map(p-> p%2==0?"e"+p:"o"+p)
			    .collect(Collectors.toList());
	}
}

