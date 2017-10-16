//Importa el paquete q contiene la clase Scanner
import java.util.*;

//Definicion de la clase
	public class TestAnimal{
		//Definicion del metodo principal
		public static void main(String[] args){
			//Declaracion del objeto Animal
				Animal Animal1= new Animal();
			//Declaracion del objeto teclado de la clase Scanner
				Scanner teclado= new Scanner(System.in);
			//Pedir el nombre del animal
				System.out.print("Teclee el Nombre del Animal: ");
			//Leer y asignar nombre al objeto animal1
				Animal1.setNombre(teclado.nextLine());
			//Pedir la edad del animal
				System.out.print("Teclee la edad del animal: ");
				int edad = teclado.nextInt();
			//Asignar edad al objeto animal1
				Animal1.setEdad(edad);
			//Informar de los datos de animal1
				Animal1.nace();
				System.out.println("Mi nombre es: " + Animal1.getNombre()+" y mi edad es "+Animal1.getEdad()+" anios");

			}



	}
