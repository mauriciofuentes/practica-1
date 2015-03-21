
public class problema1 {

	public static void main(String[] args) {
		for(int i=1; i<6; i++){
			for(int j=(6-i);j>0;j--){
				System.out.print(" ");
			}
			for(int a=1; a<(2*i);a++){
				System.out.print("*");
			}
			System.out.println(" ");
			}
		for(int i=4; i>0; i--){
			for(int j=(6-i);j>0;j--)
				System.out.print(" ");
			for(int a=1; a<(2*i);a++)
				System.out.print("*");
			System.out.println(" ");
		}
	}
}