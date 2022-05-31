package NIvell_1_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal81 {

	public static void main(String[] args) {
		
		List <String> llistaStrings=new ArrayList<String>();
		List <String> llistaStringsAmbO=new ArrayList<String>();
		String filename="Strings.txt";
		
		//Carga lista de arrays desde un archivo de texto
		try {
			llistaStrings=loadFileInArray(filename, llistaStrings);
		} catch (IOException e) {

			e.printStackTrace();
		}

		llistaStringsAmbO=(ArrayList<String>) localizarPalabrasConO(llistaStrings);
		
		System.out.println(llistaStringsAmbO);
		
		//A parte de imprimir por pantalla aunque no lo pida el ejercicio creo un archivo txt con las palabras con O.
		try {
			writeArrayInFile("llistaParaulesAmbO.txt", llistaStringsAmbO);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static List<String> localizarPalabrasConO(List<String> llistaStrings) {

		List<String> llistaStringsAmbO = llistaStrings.stream()
		    .filter(p -> p.contains("o")||p.contains("ó")||p.contains("O"))
		    .collect(Collectors.toList());

		return llistaStringsAmbO;
	}
	
	public static List <String> loadFileInArray (String fileName, List<String> llistaStrings) throws IOException{
		
		FileReader fr = new FileReader(new File(fileName));
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        
        while (linea != null) {
            
        	llistaStrings.add(linea);

            linea = br.readLine();
        }
        
        br.close();
        fr.close();
        
        return llistaStrings;
	}
	
	 public static void writeArrayInFile(String fileName, List<String> llistaStrings) throws IOException {
		 
	        FileWriter fw = new FileWriter(new File(fileName));
	        BufferedWriter bw = new BufferedWriter(fw);

	        for(int i=0;i<llistaStrings.size();i++) {
	        	
	        	bw.write(llistaStrings.get(i));
		        bw.newLine();
	        }
	        
	        bw.newLine();
	        bw.close();
	        fw.close();
	 }
	 
		public static String requireString(String message) {
			
			Scanner sc=new Scanner(System.in);
			String string;
			
			System.out.println(message);
			string=sc.nextLine();
			
			return string;
		}
}
