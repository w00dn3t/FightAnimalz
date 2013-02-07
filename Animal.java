import java.util.ArrayList;
import java.util.Random;

public abstract class Animal {
	//Current Stats
	protected int str;
	protected int agil;
	protected int health;

	//Raws -- Raw Stats unmodified
	final private int rstr;
	final private int ragil;
	final private int rhealth;
	//End Raw
	
	//Identity
	protected String name;
	protected String type;
	protected ArrayList<String> abilList = new ArrayList();

	public Animal(String name, String type, int str, int agil, int health){
		this.str = str;
		this.agil = agil;
		this.name = name;
		this.type = type;
		this.health = health;
		rstr = str;
		ragil = agil;
		rhealth = health;
	}
	
	//General Abilities
	public String offAbilOne(Animal enemy){
		
		int preDmg = rdzr()*str; 
		if (cth(enemy)){
			enemy.health -= preDmg;
			return name + " strikes for " + preDmg + "damage!";
		}
		return "The ability misses!";
	}
	public String offAbilTwo(Animal enemy){
		str += 4;
		agil -= 4;
		int preDmg = rdzr()*str; 
		if (cth(enemy)){
			enemy.health -= preDmg;
			return name + " strikes for " + preDmg + "damage! Strength was raised to " + str + " Agility was lowered to " + agil; 
		}
		return "The ability misses! Strength was raised to " + str + " Agility was lowered to " + agil;
	}
	public String defAbilOne(Animal enemy){
		agil += 5;
		return name + "'s Agility was raised to " + agil;
	}
	public String defAbilTwo(Animal enemy){
		health += rhealth * 0.1;
		return name + " recovered 10% Health, it is now  " + health;
	}
	
	public void beastialWrath(){
		this.str += 15;
	}
	//End General Abilities
	
	
	
	
	//Randomizer && Ability Chancing
	protected int rdzr(){
		Random rand = new Random();
		return rand.nextInt(10);	
	}
	
	protected boolean cth(Animal targ){
		Random rand = new Random();
		if (rand.nextInt(10)*targ.agil > 100)
			return false;
		return true;	
	}
	
	
	//Accessors
	public int getStr(){
		return str;
	}
	public int getAgil(){
		return agil;
	}
	public int getHP(){
		return health;
	}
	public String getName(){
		return name;
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
