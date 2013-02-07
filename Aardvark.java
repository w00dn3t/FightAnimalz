import java.util.ArrayList;




public class Aardvark extends Animal{
	private ArrayList<String> abilList = new ArrayList();

	public Aardvark(String name) {
		super(name, "Aardvark", 6, 15, 90);
		abilList.add("Normal Strike");
		abilList.add("Ferocious Strike");
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

}
