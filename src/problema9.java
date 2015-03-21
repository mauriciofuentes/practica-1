import java.util.Scanner;


public class problema9 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int nn,u,d,c,m;
		String variable;
		String Unidad[]={"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
		String Decena[]={"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
	    String Centena[]={"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String Milesima[]={"","M","MM", "MMM", "MV", "V", "VM", "VMM", "VMMM", "MX"};
		    System.out.println("Ingrese numero ");
		    variable = x.nextLine();
		    nn =Integer.parseInt(variable);
		    u = (nn%10);
		    d = ((nn/10)%10);
		    c = ((nn/100)%10);
		    m=(nn/1000);
		    if(variable.length()<5){
		    	if(nn > 999 ){
			    	System.out.println("El numero en romano es "+ Milesima[m] + Centena[c] + Decena[d] + Unidad[u]);
			    	System.out.println(" ");
			    }else if(nn > 99){
			    	System.out.println("El numero en romano es "+ Centena[c] + Decena[d] + Unidad[u]);
			    	System.out.println(" ");
			    }else if(nn > 9){
			    	System.out.println("El numero en romano es "+ Decena[d] + Unidad[u]);
			    	System.out.println(" ");
			    }else if(nn < 10){
			    	System.out.println("El numero en romano es "+""+Unidad[u]);
			    	System.out.println(" ");
			    }
		    }else{
		    	System.out.println("el numero es mayor a 9999");
		    	System.out.println(" ");
		    }
		   
		}
	}
