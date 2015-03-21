import java.util.Scanner;


public class problema6 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		Scanner q = new Scanner(System.in);
		String variable;
		double num,num2;
		System.out.println("Ingrese digitos");
		num = q.nextInt();
		num2 = q.nextInt();
		System.out.println("Seleccione variable");
		System.out.println("s= Suma");
		System.out.println("r= Diferencia");
		System.out.println("m= Producto");
		System.out.println("d= Cociente");
		variable = x.nextLine();
		switch(variable){
		case "s":
			System.out.println("La suma es"+" "+(num+num2));
			break;
		case "r":
			System.out.println("La diferencia es"+" "+(num-num2));
			break;
		case "m":
			System.out.println("El producto es"+" "+(num*num2));
			break;
		case "d":
			System.out.println("El cociente es"+" "+(num/num2));
		}
	}
	
		}

