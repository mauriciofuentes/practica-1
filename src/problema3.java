import java.util.Scanner;
public class problema3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		String hora ;
		int n1=0;
		int minuto=0;
		int tiempo=0;
				System.out.println("Ingrese hora");
			hora = s.nextLine();
			n1=Integer.parseInt(hora.substring(0, hora.indexOf(":"))); 
			minuto=Integer.parseInt( hora.substring(hora.indexOf(":")+1,hora.length() )); 
			if (n1 > 24 ){
				System.out.println("La hora no es valida");
				System.out.println(" ");
			}else{
			if(n1 > 12 && n1<25)			
				tiempo = n1 - 12;
				else
				tiempo = n1;
				hora = tiempo + ""+":"+"00";
			if(n1 < 12)
				hora= tiempo + ":"; 
				if(n1 > 12 && n1<25)
				hora+= "pm ";
				else
				hora +=  "am";	
			System.out.println("la hora es:"+" "+hora );
			
		}
	}
	}