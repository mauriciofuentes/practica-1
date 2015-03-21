import java.util.Scanner;
public class problema2 {

	public static void main(String[] args) {
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		int n5=0;
		int n6=0;
		int n7=0;
		int n8=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese primer nota");
		n1 = s.nextInt();
		System.out.println("Ingrese seguda nota");
		n2 = s.nextInt();
		System.out.println("Ingrese tercera nota");
		n3 = s.nextInt();
		System.out.println("Ingrese cuarta nota");
		n4 = s.nextInt();
		System.out.println("Ingrese quinta nota");
		n5 = s.nextInt();
		System.out.println("Ingrese sexta nota");
		n6 = s.nextInt();
		n7 = (n1 + n2 + n3 + n4 +n5 + n6);
		n8 = (n7/6);
		if(n8>=0)
			if(n8<60)
			System.out.println("El promedio del estudiante es:"+n8+" " +"Puntuacion E");
		if(n8>=60)
			if(n8<70)
			System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion D");
		if(n8>=70)
			if(n8<80)
			System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion C");
		if(n8>=80)
			if(n8<90)
			System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion B");
		if(n8>=90)
			if(n8 <=100)
			System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion A");
	}
}
