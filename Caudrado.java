
public class Caudrado {
	private String name;
	private double base;
	private double altura;
	private double lado;
	public Caudrado(String name, double lado) {
		this.name = name;
		this.lado = lado;
	}//Constructor 
	
	public double calcularArea() {
		return (getLado() * getLado());	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() + getLado() + getLado()+ getLado() );
	}// calcularPerimetro
		
	public String getName() {
		return name;
	}//getName 
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Caudrado [name=" + name + ", lado=" + lado + "]";
	}//toString
	
	
}// classCaudrado
