import java.util.Scanner;

/*
* Author : williampho
* Date : 22-Jan-2021
*/
public class FiveCities
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int [] dist=new int[4];
				int [] villes=new int[5];
				
				for(int i=0; 1<4;i++)
				{
					dist[i]=sc.nextInt();
				}
						
				villes[0]=0;
				for(int i=1;i<5;i++)
				{
					villes[i]=villes[i-1]+dist[i-1];
					System.out.println("-");
					System.out.println(villes[i]);
	
					
				}
				for(int i=0;i<5;i++)
					for(int j=0;j<5;j++)
						
					    int i1;
						int j1;
						int distville = Math.abs(villes[i1]-villes[j1]);
				System.out.println(distville);
				System.out.println(" ");
				System.out.println();
			}
	
		
	}
	
			

	
