package s1t6n2exercici1;

public class GenericMethods<T> {	
	
	//El m�tode gen�ric accepta dos arguments de tipus gen�ric i l'�ltim de tipus string
	public static <T> void imprimir(T obj1, T obj2, String obj3) {
		System.out.println("Els arguments rebuts son: " + obj1 + ", " + obj2 + " i " + obj3);
	}
}