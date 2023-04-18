package s1t6n2exercici2;

public class GenericMethods<T> {	
	
	//El mètode genèric é una llista d'arguments de variable indefinida
	public static <T> void imprimir(T...obj) {
		System.out.println("Els arguments rebuts son: " + obj[0] + ", " + obj[1] + " i " + obj[2]);
	}
}