import java.util.Arrays;

/*
* Author : williampho
* Date : 15-Dec-2020
*/// Ce programme permet de premierment imprimer 100 nombre completment par hazard puis d'additioner les sommes de nombres primaires present dans cette tableau.
public class MethodeSommative
	{

		public static void main(String[] args)
			{
				
				int [] array = new int [100];
				for (int i = 0; i<100; i++) {
					array[i] = (int)(Math.random()*100);	
				}
				
				System.out.println(Arrays.toString(array));
				System.out.println(nombrePaire(array));		

			}
		
			
			public static int nombrePaire(int [] a) {
				int nombredePaire = 0;
				for (int i : a) {
					if (i%2 == 0) {
						nombredePaire ++;
						
					}
					
				}
				System.out.println("Nombre de Nombres Paires = ");
				return nombredePaire;
				
				
			
				

			
				
				
				
				
				
				
				
				
				
				
				
			}

	}
