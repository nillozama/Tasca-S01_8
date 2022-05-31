package Nivell_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal81N3 {

	public static void main(String[] args) {
		
		List <Alumne> llistaAlumnes=new ArrayList <Alumne>();
		Alumne alumne;
		
		alumne=new Alumne ("Jose", 23, "Java", 5);
		llistaAlumnes.add(alumne);
		alumne=new Alumne ("Marta", 31, "PHP", 6);
		llistaAlumnes.add(alumne);
		alumne=new Alumne ("Eva", 21, "Java", 10);
		llistaAlumnes.add(alumne);
		alumne=new Alumne ("Ana", 16, "Java", 4);
		llistaAlumnes.add(alumne);
		alumne=new Alumne ("Arturo", 42, "PHP", 8);
		llistaAlumnes.add(alumne);
		alumne=new Alumne ("Anabel", 15, "Java", 10);
		llistaAlumnes.add(alumne);
		
		System.out.println(llistaAlumnes);
		System.out.println("");
		
		List<String> alumnes = llistaAlumnes.stream()
		.map(p->p.nom+" "+p.edat)
		.collect(Collectors.toList());
		alumnes.forEach(System.out::println);

		
		System.out.println("");
		
		List<String> alumnesNomA = llistaAlumnes.stream()
		.filter(p -> p.getNom().startsWith("A"))
		.map(p->p.nom)
		.collect(Collectors.toList());
		alumnesNomA.forEach(System.out::println);
		
		System.out.println("");
		
		List<String> alumnesActes=llistaAlumnes.stream()
	    .filter(p -> p.getNota()>=5)
		.map(p->p.nom+" "+p.nota)
	    .collect(Collectors.toList());
		
		alumnesActes.stream()
		.forEach(System.out::println);
		System.out.println("");

		List<String> alumnesActesNoPHP=llistaAlumnes.stream()
	    .filter(p -> p.getNota()>=5)
	    .filter(p -> !p.getCurs().equalsIgnoreCase("PHP"))
		.map(p->p.nom+" "+p.nota+ " "+ p.curs)
	    .collect(Collectors.toList());
		
		alumnesActesNoPHP.stream()
		.forEach(System.out::println);
	}

}
