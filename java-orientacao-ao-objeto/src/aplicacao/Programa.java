package aplicacao;


	import java.util.Locale;
	import java.util.Scanner;

	import entidades.Triangulo;

	public class Programa {
		
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Entre com os valores do triangulo X: ");
			
			Triangulo x = new Triangulo();
			x.a = scan.nextDouble();
			x.b = scan.nextDouble();
			x.c = scan.nextDouble();
			
			System.out.println("Entre com os valores do triangulo  Y: ");
			
			Triangulo y = new Triangulo();
			y.a = scan.nextDouble();
			y.b = scan.nextDouble();
			y.c = scan.nextDouble();
			
			
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf("Triangulo X area: %.4f\n", areaX);
			System.out.printf("Triangulo Y area: %.4f\n", areaY);
			
			
			if(areaX > areaY) {
				System.out.println("Área do triangulo X é maior do que a área do triangulo Y");
			}
			else {
				System.out.println("Área do triangulo Y é maior do que a área do triangulo X");
			}
			
			scan.close();
			
		}
		
		
}



