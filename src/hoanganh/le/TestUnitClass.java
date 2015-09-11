package hoanganh.le;

public class TestUnitClass {
	public static void main(String[] args) {
		Army mainArmy = new Army();
		Army subArmy = new Army();
		mainArmy.addUnit(new Archer());
		mainArmy.addUnit(new Archer());
		mainArmy.addUnit(new LaserCanonUnit());
		mainArmy.addUnit(new LaserCanonUnit());
		mainArmy.addUnit(new LaserCanonUnit());
		mainArmy.addUnit(new LaserCanonUnit());
		subArmy.addUnit(new Archer());
		subArmy.addUnit(new Archer());
		subArmy.addUnit(new Archer());
		mainArmy.addUnit(subArmy);
		System.out.println(mainArmy.bombardStrength());
	}
}
