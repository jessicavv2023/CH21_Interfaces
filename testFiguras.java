public class testFiguras { 
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		
		Caudrado t3 = new  Caudrado("Caudrado t3", 9.0);
		Caudrado t4 = new  Caudrado("Caudrado", 10.0);
		
		imprimirCalculo(t1); imprimirCalculo(t2);
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		imprimirCalculoo(t3); imprimirCalculoo(t4);
	}//main
	

	public static void imprimirCalculo(Triangulo t1) {
		System.out.println(t1);
		System.out.println("+===========================================================+");
		System.out.println("|El área de ["+t1.getName()+"] es: " + t1.calcularArea() + 
				"\n" + "|El perímetro de ["+t1.getName()+"] es: " + t1.calcularPerimetro());
		System.out.println("+===========================================================+");
	}//imprimirCalculo
	
	public static void imprimirCalculoo(Caudrado t3) {
		System.out.println(t3);
		System.out.println("+================================================================+");
		System.out.println("|El área de ["+t3.getName()+"] es: " + t3.calcularArea() + 
				"\n" + "|El perímetro de ["+t3.getName()+"] es: " + t3.calcularPerimetro());
		System.out.println("+================================================================+");
	}//imprimirCalculo
}//class testFiguras 