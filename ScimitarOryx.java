import java.util.ArrayList;




public class ScimitarOryx extends Animal{
	private ArrayList<String> abilList = new ArrayList();

	public ScimitarOryx(String name) {
		super(name, "Scimitar Oryx", 12, 2, 150);
		abilList.add("Vicous Strike");
		abilList.add("Destroy Agility");
		abilList.add("Increase Safety");
		abilList.add("Recuperate");

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
	
	public String offAbilOne(Animal enemy){

		int preDmg = str*(rdzr()/2); 
		if (cth(enemy)){
			enemy.health -= preDmg;
			return name + " strikes for " + preDmg + "!"; 
		}
		return "The ability misses!";
	}
	
	public String offAbilTwo(Animal enemy){
		health -= rdzr();
		int preDmg = rdzr(); 
		if (cth(enemy)){
			enemy.agil -= preDmg;
			return name + " strikes agility for " + preDmg + "! Enemy's agility was lowered to " + enemy.agil; 
		}
		return "The ability misses!";
	}

}
