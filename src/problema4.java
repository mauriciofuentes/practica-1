import java.util.Scanner;


public class problema4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String variable;
		double r,arC,pC,X,arU,pU,xT,arT,pT,ht;
		
			System.out.println("Que figura desea calcular?");	
			System.out.println("C= Circulo");
			System.out.println("U= Cuadrado");
			System.out.println("T= Triangulo");
			variable = s.nextLine();
			switch(variable){
			case "C":
				System.out.println("Ingrese X");
				r= s.nextDouble();
				pC=2*Math.PI*r;
				arC= Math.PI*Math.pow(r, 2);
				System.out.println("El radio es "+r+"0"+"u");
				System.out.println("El perimetro es "+ pC+"0"+"u");
				System.out.println("El area es "+arC+"0"+"u^2");
				break;
			case "U":
				System.out.println("Ingrese X");
				X = s.nextDouble();
				arU = Math.pow(X,2);
				pU =4*X ;
				System.out.println("El area es "+arU+"0"+"u^2");
				System.out.println("El Perimetro  es "+pU+"0"+"u");
				break;
			case "T":
				System.out.println("Ingrese X");
				xT = s.nextDouble();
				ht = (Math.sqrt(3)/2)*xT;
				arT = (Math.sqrt(3)/4)*Math.pow(xT, 2);
				pT = 3*xT;
				System.out.println("La altura es "+ht+"0"+"u");
				System.out.println("El area es "+arT+"0"+"u^2");
				System.out.println("El Perimetro es "+pT+"0"+"u");
			}
		}
	}
