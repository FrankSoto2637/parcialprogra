package excersice6;
import java.util.Scanner;
public class excersice6 {
	public static Scanner teclado ;
	public static void main(String[] args) {
		System.out.println("Ingrese el dimension del vector: ");
		teclado = new Scanner(System.in);
		int n=teclado.nextInt();
		int vector[]= new int[n];
		int producto=0, max=0;
		
		System.out.println("Ingrese los elementos del vector");
		for (int i=0;i<vector.length;i++) {	
			vector[i]=teclado.nextInt();
		}
		
		for (int j=0;j<vector.length-3;j++) {
			producto=vector[j]*vector[j+1]*vector[j+2]*vector[j+3];
			if (producto>max) {
				max=producto;
			}
		}
		
		for (int j=0;j<vector.length-3;j++) {
			if (vector[j]*vector[j+1]*vector[j+2]*vector[j+3]==max) {
				System.out.println("El producto maximo es "+max+" y formado por:");
				System.out.println(vector[j]+" "+vector[j+1]+" "+vector[j+2]+" "+vector[j+3]);
			}
		}
	}


	}