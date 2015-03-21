import java.util.Scanner;


public class problema7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Ingrese el numero");
		num = s.nextInt();
		System.out.println("Tabla del " + num);
		for (int i=0; i<11; i++){
					System.out.print(num+" "+"*"+" "+i+" "+"="+" "+num*i);
					System.out.println("");
			}
		}
		
	}
