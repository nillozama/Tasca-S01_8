package Nivell_2_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal84N2 {

	public static void main(String[] args) {
		
		int siete=7;
		int tres=3;
	
		List <Object> listaNumerosYStrings=Arrays.asList(siete, "febrero", "cabeza", tres, "casa", "te", "ratón", "cienpies","40");
		
		ordenarStrings(listaNumerosYStrings); 
	}

	public static void ordenarStrings(List<Object> listaNumerosYStrings) {
		
		List<String> llistaStringOrdenada1=listaNumerosYStrings.stream()
				.map(Object::toString)
				.sorted(Comparator.comparing(n->n.toString().charAt(0))).collect(Collectors.toList());
		
		List<String> llistaStringOrdenada2=listaNumerosYStrings.stream()
				.map(Object::toString)
				.sorted(Comparator.comparing(n->!(n.toString().contains("e")))).collect(Collectors.toList());
		
		List<String> llistaStringOrdenada3=listaNumerosYStrings.stream()
				.map(Object::toString)
			    .map(p-> p.replace("a", "4"))
			    .collect(Collectors.toList());
				
		List<String> llistaStringOrdenada4=listaNumerosYStrings.stream()
				//.filter(item -> item instanceof Integer)
				.map(Object::toString)
				.filter(n->n.chars().allMatch(Character::isDigit))
				.collect(Collectors.toList());

		llistaStringOrdenada1.stream().forEach(System.out::println);
		System.out.println("");
		llistaStringOrdenada2.stream().forEach(System.out::println);
		System.out.println("");
		llistaStringOrdenada3.stream().forEach(System.out::println);
		System.out.println("");
		llistaStringOrdenada4.stream().forEach(System.out::println);
	}
}
