/*
* Author : williampho
* Date : 15-Dec-2020
*///Program Corriger, Permet de Saluer John
/// Erreur 1: Le premier erreur c'est le nom du public class, puisque le nom public class est "Examples" et le nom du class est Erreurs il y a un erreurs avec le syntext du nom. Sa devrait etre le meme alors il devrait etre nommé erreur et pas examples. 
/// Erreur 2:Il faut crée une variable pour John si non le code ne sais pas quoi "John" signifie. On fait cela avec string John qui égale "John" se qui vas etre initialiser.
/// Erreur 3:La comander "saluer ami" doit etre mis en string come commande, ceci peut donc savoir d'imprimer la salut a John
/// Erreur 4:Le dernier erreur c'est qu'il manquer de commande pour acctuelment imprimer notre text qui salut john, ceci est fait en retournant le message quand la.


///Erreur 1 dessou
public class Erreur
	{

		public static void main(String[] args)
			{
				///erreur 2 dessou
				String john = " John";
				///erreur 3 dessou
				System.out.println(saluerAmi(john));
			
			}
		public static String saluerAmi(String john)
		{
				String message="Bonjour mon ami" + john;
				///erreur 4 dessou
				return message;
		}
		}

