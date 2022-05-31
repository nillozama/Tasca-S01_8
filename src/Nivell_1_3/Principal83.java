package Nivell_1_3;

import java.util.Arrays;
import java.util.List;

public class Principal83 {

	public static void main(String[] args) {
		
		List <String> listaMeses=Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", 
				"Agosto", "Septiembre",	"Octubre", "Noviembre", "Diciembre");
		
		listaMeses.stream().forEach(mes->System.out.println(mes));
	}
}

