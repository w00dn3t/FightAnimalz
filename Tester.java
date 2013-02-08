import java.util.Scanner;

public class Tester {

	public static void main(String[] args){
		//AnimalUI gui = new AnimalUI();
		Aardvark aard = new Aardvark("Aardvark");
		ScimitarOryx oryx = new ScimitarOryx("Scimitar Oryx");
		Ocelot oce = new Ocelot("Ocelot");
		ThreeToedSloth sloth = new ThreeToedSloth("Three Toed Sloth");
		ConsoleFight.fight(oce, oryx);
	}

}
