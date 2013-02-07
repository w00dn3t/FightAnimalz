import java.util.Scanner;


public class ConsoleFight {

	/**
	 * @param args
	 */
	public static void fight(Animal ani1, Animal ani2) {
		System.out.println(ani1.listAbil());
		System.out.println(ani2.listAbil());
		Scanner sc = new Scanner(System.in);
		int inp = 0;
		while (ani1.getHP() > 0 && ani2.getHP() > 0){
			System.out.println(ani1.getName() + " has " + ani1.getHP() + " health; choose an ability!");
			if (ani1.getHP() < 0 && ani1.getHP() > -50){
				System.out.println("Beastial wrath is engaged Strength buffed for 15!");
				ani1.beastialWrath();
			}
			inp = sc.nextInt();
			if (inp == 10)
				System.out.println(ani1.offAbilOne(ani2));
			else if (inp == 20)
				System.out.println(ani1.offAbilTwo(ani2));
			else if (inp == 30)
				System.out.println(ani1.defAbilOne(ani2));
			else if (inp == 40)
				System.out.println(ani1.defAbilTwo(ani2));
			
			System.out.println(ani2.getName() + " has " + ani2.getHP() + " health; choose an ability!");
			if (ani2.getHP() < 0 && ani2.getHP() > -50){
				System.out.println("Beastial wrath is engaged Strength buffed for 15!");
				ani2.beastialWrath();
			}
			inp = sc.nextInt();
			if (inp == 10)
				System.out.println(ani2.offAbilOne(ani1));
			else if (inp == 20)
				System.out.println(ani2.offAbilTwo(ani1));
			else if (inp == 30)
				System.out.println(ani2.defAbilOne(ani1));
			else if (inp == 40)
				System.out.println(ani2.defAbilTwo(ani1));

		}
		System.out.println(ani1.getName() + " has " + ani1.getHP() + " health! " + ani2.getName() + " has " + ani2.getHP() + " health!");
		if (ani1.getHP() > ani2.getHP() && ani1.getHP() > 0)
			System.out.println(ani1.getName() + " has won the match!");
		if (ani2.getHP() > ani1.getHP() && ani2.getHP() > 0)
			System.out.println(ani2.getName() + " has won the match!");
		else
			System.out.println(ani1.getName() + " and " + ani2.getName() + " lay dead and cold on the hard African sands!");


}

}
