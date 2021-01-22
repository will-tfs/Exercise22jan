/*
* Author : williampho
* Date : 18-Jan-2021
*/
public class MagicSquares
	{

		public static void main(String[] args)
			{
				        boolean magic = true;
				        String[] ligne1 = in.nextLine().split(" ");
				        String[] ligne2 = in.nextLine().split(" ");
				        String[] ligne3 = in.nextLine().split(" ");
				        String[] ligne4 = in.nextLine().split(" ");
				        int total = Integer.parseInt(ligne1[0]) + Integer.parseInt(ligne2[0]) +
				                Integer.parseInt(ligne3[0]) + Integer.parseInt(ligne3[0]);
				        String[][] lines = {ligne1, ligne2, ligne3, ligne4};

				        for (int i = 0; i < 4; i++){
				            if ((Integer.parseInt(ligne1[i]) + Integer.parseInt(ligne2[i]) +
				                    Integer.parseInt(ligne3[i]) + Integer.parseInt(ligne4[i])) != total){
				                magic = false;
				                break;
				            }
				            int temp = 0;
				            for (String num: lignes[i]){
				                temp += Integer.parseInt(num);
				            }
				            if (temp != total){
				                magic = false;
				                break;
				            }

				        }


				        System.out.println(
				                (magic)? "c'est magic":"c'est pas magic";
				     

				    }
				
			}

	
