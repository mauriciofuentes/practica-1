import java.util.Scanner;


public class problema5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int año = 0;
		int diaf = 0;
		int mesf= 0;
		int añof ;
		int diferenciadias ;
		int diferenciames ;
		int diferenciaaño ;
		int diastotal;
		System.out.println("Ingrese fecha de Inicio");
		System.out.println("dia");
		dia = s.nextInt();
		System.out.println("mes");
		mes = s.nextInt();
		System.out.println("año");
		año = s.nextInt();
		System.out.println("Ingrese fecha Final");
		System.out.println("dia");
		diaf = s.nextInt();
		System.out.println("mes");
		mesf = s.nextInt();
		System.out.println("año");
		añof = s.nextInt();
		diferenciadias= diaf-dia;
		diferenciames= mesf-mes;
		diferenciaaño= añof-año;
		diferenciadias= diferenciadias*1;
		diferenciames= diferenciames*30;
		diferenciaaño= diferenciaaño*360;
		diastotal=diferenciadias+diferenciames+ diferenciaaño ;
		System.out.println("La diferencia de Dias es"+" "+ diastotal);
		System.out.println(" ");
				}		
	}		 

