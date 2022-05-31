package Nivell_1_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal82 {

	public static void main(String[] args) {
		
		List <String> llistaStrings=new ArrayList<String>();
		List <String> llistaStringsAmbFiltre=new ArrayList<String>();
		String filename="Strings.txt";

		try {
			llistaStrings=loadFileInArray(filename, llistaStrings);
		} catch (IOException e) {

			e.printStackTrace();
		}

		llistaStringsAmbFiltre=(ArrayList<String>) filtrarStrings(llistaStrings);
		
		System.out.println(llistaStringsAmbFiltre);
		
		try {
			writeArrayInFile("llistaParaulesFiltrades.txt", llistaStringsAmbFiltre);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static List<String> filtrarStrings(List<String> llistaStrings) {
		
		Stream<String> stream = llistaStrings.stream();

		List<String> llistaStringsAmbFiltre = stream
		    .filter(p -> (p.contains("o")||p.contains("ó")||p.contains("O"))&&p.length()>5)
		    .collect(Collectors.toList());

		return llistaStringsAmbFiltre;
	}
	
	public static List <String> loadFileInArray  (String fileName, List<String> llistaStrings) throws IOException{
		
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
