import java.util.Scanner;
public class Calculadora extends Operacion{

	private float num_uno, num_dos, resultado;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public float getNum_uno() {
		return num_uno;
	}

	public float getNum_dos() {
		return num_dos;
	}

	public float getResultado() {
		return resultado;
	}

	public void ingresarNumero(float n1, float n2){
		this.num_uno = n1;
		this.num_dos = n2;
	}
	
	public void calcular(char op){
		if(op == '+') suma(this.num_uno, this.num_dos);
		else{
			if(op == '-') resta(this.num_uno, this.num_dos);
			else{
				if(op == '*') producto(this.num_uno, this.num_dos);
				else {
					if(op == '/') division(this.num_uno, this.num_dos);
					else System.out.println( "\nOperación inválida" );
				}
			}
		}
	}
	
	public void inicio(){
		@SuppressWarnings("resource")
		Scanner lector = new Scanner(System.in);
    	Calculadora calc = this;
    	float n1, n2;
    	char op;
    	
    	System.out.print( "Ingrese el primer número: " );
    	n1 = lector.nextFloat();
    	System.out.print( "Ingrese el segundo número: " );
    	n2 = lector.nextFloat();
    	calc.ingresarNumero(n1, n2);
    	
    	System.out.print( "Ingrese la operación (+, -, *, /): " );
    	op = lector.next().charAt(0);
    	
    	calc.calcular(op); 
    	
    	System.out.print( "Adios" );
	}
	
	
    public static void main (String [ ] Args) {
    	new Calculadora().inicio();
	}

}
