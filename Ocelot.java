import java.util.ArrayList;


public class Ocelot extends Animal{
	private ArrayList<String> abilList = new ArrayList();
	private int bleedCounter = 0;
	private int addStrikes = 0;
	
	
	public Ocelot(String name) {
		super(name, "Ocelot", 15, 20, 7, 75);
		abilList.add("Cat Scratch");
		abilList.add("Deep Cut");
		abilList.add("Tense");
		abilList.add("Lick Wounds");
	}
	
	public String offAbilOne(Animal enemy){
		String temp = "";
		if(bleedCounter != 0){
			enemy.health -= 10;
			bleedCounter--;
			temp += enemy.getName() +" bleeds out for 10 damage!\n";
		}
		int strikes = 2 + addStrikes;
		addStrikes = 0;
		int preDmg;
		for(int i = 1; i <= strikes; i++){
			preDmg = str*(rdzr()/2) + 7;
			if (cth(enemy)){
				enemy.health -= preDmg;
				temp += name + "'s strike number " + i + " strikes for " + preDmg + " damage!\n"; 
			}else{
				temp += "Strike number " + i + " misses!\n";
			}
		}
		return temp;
	}
	
	public String offAbilTwo(Animal enemy){
		String temp = "";
		if(bleedCounter != 0){
			enemy.health -= 10;
			bleedCounter--;
			temp += enemy.getName() +" bleeds out for 10 damage!\n";
		}
		int preDmg;
		preDmg = str*(rdzr()/2) + 2;
		if (cth(enemy)){
			enemy.health -= preDmg;
			temp += name + "'s attack hits for " + preDmg + " damage!\n";
			if(cth(enemy, 40)){
				bleedCounter = 2;
				temp += name + "'s attack will bleed the enemy for " + bleedCounter + " turns!\n";
			}
		}else{
			temp += "The attack misses!";
		}
		return temp;
	}
	
	public String defAbilOne(Animal enemy){
		String temp = "";
		if(bleedCounter != 0){
			enemy.health -= 10;
			bleedCounter--;
			temp += enemy.getName() +" bleeds out for 10 damage!\n";
		}
		addStrikes++;
		this.agil += 5;
		temp += this.name + " tenses up!\nNext Cat Scratch will perform an addional strike!\nAgility is now " + this.getAgil() + "!";
		return temp;
	}
	
	public String defAbilTwo(Animal enemy){
		String temp = "";
		if(bleedCounter != 0){
			enemy.health -= 10;
			bleedCounter--;
			temp += enemy.getName() +" bleeds out for 10 damage!\n";
		}
		health += getRHealth() * 0.1;
		temp += name + " recovered 10% Health, it is now  " + health;
		return temp;
	}
	public String listAbil(int i){
		return abilList.get(i);
	}
	public String listAbil(){
		String temp = getName() + "'s abilities in order:\n";
		int i = 10;
		for (String x: abilList){
			temp += i + ": " + x + "\n";
			i += 10;
		}
		return temp;
	}
	
}
