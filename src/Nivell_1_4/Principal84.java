package Nivell_1_4;

import java.util.Arrays;
import java.util.List;

public class Principal84 {

	public static void main(String[] args) {
		
		List <String> listaMeses=Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre");
		
		listaMeses.stream().forEach(System.out::println);
	}
}
