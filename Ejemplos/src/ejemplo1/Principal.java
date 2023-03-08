package ejemplo1;

import utilidades.Leer;

public class Principal {
	
	public static void main(String[] args) {
		int num=10,de;
		double res;
		
		do {
			de=Leer.datoInt();
		}while(de==0);
		res=num/de;
		System.out.println(res);		
		
	}
	
}	
	