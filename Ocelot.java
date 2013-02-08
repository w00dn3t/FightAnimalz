import java.util.ArrayList;


public class Ocelot extends Animal{
	private ArrayList<String> abilList = new ArrayList();
	private int bleedCounter = 0;
	private int addStrikes = 0;
	
	public Ocelot(String name) {
		super(name, "Ocelot", 15, 20, 75);
		abilList.add("Cat Scratch");
		abilList.add("Ferocious Strike");
		abilList.add("Tense");
		abilList.add("Recuperate");
	}
	
	public String offAbilOne(Animal enemy){
		String temp = "";
		int strikes = 2 + addStrikes;
		addStrikes = 0;
		int preDmg;
		for(int i = 1; i <= strikes; i++){
			preDmg = str*(rdzr()/2);
			if (cth(enemy)){
				enemy.health -= preDmg;
				temp += name + "'s strike number " + i + " strikes for " + preDmg + " damage!\n"; 
			}else{
				temp += "Strike number " + i + " misses!\n";
			}
		}
		return temp;
	}
	
	public String defAbilOne(Animal enemy){
		addStrikes++;
		this.agil += 5;
		return this.name + " tenses up!\nNext Cat Scratch will perform an addional strike!\nAgility is now " + this.getAgil() + "!";
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
