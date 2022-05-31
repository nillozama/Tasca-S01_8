package Nivell_2_3;

import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface

interface FloatOperacio{
	
	float operacio(float x, float y);
}

public class Principal83N2 {

	public static void main(String[] args) {
		
		float a=llegirFloat("Introdueix el primer número float");
		float b=llegirFloat("Introdueix el segon número float");
		
		FloatOperacio suma=(x,y)->x+y;
		FloatOperacio resta=(x,y)->x-y;
		FloatOperacio multiplicacio=(x,y)->x*y;
		FloatOperacio divisio=(x,y)->x/y;

		System.out.println(suma.operacio(a, b));
		System.out.println(resta.operacio(a, b));
		System.out.println(multiplicacio.operacio(a,b));
		System.out.println(divisio.operacio(a, b));

	}
	
	public static float llegirFloat(String missatge) throws InputMismatchException{
		
		Scanner sc=new Scanner(System.in);
		float num=0;
		boolean okNum=false;
		
		System.out.println(missatge);
		
		String input=sc.nextLine();
		
		while (!okNum) {
			

			
			if(input.matches("^[+-]?([0-9]+([,][0-9]*)?|[,][0-9]+)$")) {
				
				String newInput=input.replace(",", ".");
				num=Float.parseFloat(newInput);
				
				if((num>=-3.402823e38&&num<=3.402823e38)) {
					
					okNum=true;
				}
				else {
					
					System.out.println("Fuera de rango. Tienes que escribir un número decimal entre -3.402823e38 y 3.402823e38.");
					System.out.println(missatge);
					input = sc.nextLine();
				}
			}
			else {
				
				System.out.println("Error de formato. Tienes que escribir un número decimal entre -3.402823e38 y 3.402823e38.");
				System.out.println(missatge);
				input = sc.nextLine();
			}
		}

		return num;
	}

}
