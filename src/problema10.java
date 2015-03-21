import java.util.Scanner;


public class problema10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		int x=1;
		System.out.println("Ingrese el numero");
		num = s.nextInt();
		for(int i=num; i>0; i--){
			for(int j=i;j<num;j++){
				System.out.print(" ");
			}
			for(int a=i;a>0;a--){
				System.out.print(x+" ");
		}
			System.out.println(" ");
			x=x+1;
		}
	}
}