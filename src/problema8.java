import java.util.Random;
import java.util.Scanner;


public class problema8 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Random ra = new Random();
			String[] unidades ={ "cero","un","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez" };
			String[] decesp ={ "once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve" };
			String[] decenas = {"veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
			int inferior,superior,resultado,unidad,decena;
			System.out.println("Ingrese Limite inferior");
			inferior = x.nextInt();
			System.out.println("Ingres Limite superior");
			superior = x.nextInt();
			resultado = (int)(ra.nextDouble() * (superior-inferior+1)+inferior );
			if(resultado < 11){
				System.out.println(unidades[resultado]);
				System.out.println(" ");
			}else if(resultado < 21){
				System.out.println(decesp[resultado-11]);
				System.out.println(" ");
			}else if(resultado < 100){
				unidad=resultado%10;
				decena=resultado/10;
				if(unidad  == 0){
					System.out.println(decenas[decena-2]);
					System.out.println(" ");
				}else{
					System.out.println(decenas[decena-2]+" y "+unidades[unidad]);
					System.out.println(" ");
				}
			}else
				System.out.println("El numero debe ser menor a 100");
				System.out.println(" ");
					
		}
	}
