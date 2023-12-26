package day2;

public class Fruit {
	private String name, color;//Creates a new copy for every object therefore they are called as Instance Variables
	static int fruitCount;//Creates a single copy for the whole class. therefore it is called as Class Variable
	private static int totalFruitCount;
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
		fruitCount++;
		totalFruitCount++;
	}
	public Fruit() {
		name = "Mango";
		color = "Yellow";
		fruitCount++;
		totalFruitCount++;
	}
	public String getName() {
		//System.out.println(totalFruitCount);
	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static int getTotalFruitCount() {
		//System.out.println(color); Error because 'color' is non-static
		//System.out.println(this);Error: Cannot make use of 'this'
		return totalFruitCount;
	}

}
