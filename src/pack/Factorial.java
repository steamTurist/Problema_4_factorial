package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {
	public static int factorial (int n){
		int i, factor=1;
		if(n<0){
			System.out.println("Eroare. Numar negativ");
			return 0;
		}
		else if(n==0){
			System.out.println("Factorialul numarului " + n +" este 1");
			return 1;
		}
		else
		{
			for(i = 1; i<=n; i++)
			{
				factor=factor*i;
			}
			System.out.println("Factorialul numarului " + n +" este " 
			+factor);
			return factor;
		}
	}
		

	public static int sumaCifre(int n){
		int numar, suma=0;
		while(n>0){
			numar = n%10;
			suma += numar;
			n= n/10;
		}
		//System.out.println ("Suma cifrelor factorialului este "+suma);
		return suma;
	}
	
	public static void main(String[] args) {
		int n, i, rezultat, sumaCifre;
		ArrayList lista = new ArrayList();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Dati numarul intreg si pozitiv ");
		n= scanner.nextInt();
		for (i=1; i<=n; i++){
			rezultat=factorial(i);
			sumaCifre = sumaCifre(rezultat);
			lista.add(sumaCifre);
		}
		 System.out.println("Lista sumelor este " + lista);
		/* int a, b;
		 for(a=0; a< lista.size(); a++){
			 b=a+1;
			 if(a<b){
				 System.out.println("a= " +a);
				 break;
			 }
		 }*/
		 
	}
}
