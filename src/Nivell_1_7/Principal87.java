package Nivell_1_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Principal87 {
	
	public static void main(String[] args) {
	
		int siete=7;
		int tres=3;
	
		List <Object> listaNumerosYStrings=Arrays.asList(siete, "Febrero", "cabeza", tres, "casa", "te", "ratón", "cienpies");
		
		System.out.println(ordenarStrings(listaNumerosYStrings)); 
	}

	public static List<String> ordenarStrings(List<Object> listaNumerosYStrings) {
		
		List<String> llistaStringOrdenada=listaNumerosYStrings.stream()
				.filter(item -> item instanceof String)
				.map(Object::toString)
				.collect(Collectors.toList());
		
		Collections.sort(llistaStringOrdenada, (s1, s2)->s1.length()-s2.length());
		
		return llistaStringOrdenada;
	}
}

