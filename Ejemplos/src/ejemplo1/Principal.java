package ejemplo1;

import utilidades.Leer;

public class Principal {
	
	public static void main(String[] args) {
		int num=10,de=0;
		double res;

		do {
			try {
				System.out.println("Numerador");
				num=Leer.datoInt();
				System.out.println("denominador");
				de=Leer.datoInt();
				res=num/de;
				System.out.println("Resultado:"+res);
				
			}catch(ArithmeticException e){
				
				System.out.println("Esta dividiendo por 0");
				
			}catch(NumberFormatException  e) {
				
				System.out.println("Te he pedido un numero");
				
			}catch(Exception e) {
				
				System.out.println("Error inesperado");
			}
		}while(num<0||de<=0);
	}
	
}	
	