package hoanganh.le;

public class TestUnitClass {
	public static void main(String[] args) {
		Army mainArmy = new Army();
		Unit subArmy = new Army();
//		mainArmy.addUnit(new Archer());
//		mainArmy.addUnit(new Archer());
		mainArmy.addUnit(new LaserCanonUnit());
//		mainArmy.addUnit(new LaserCanonUnit());
//		mainArmy.addUnit(new LaserCanonUnit());
//		mainArmy.addUnit(new LaserCanonUnit());
//		subArmy.addUnit(new Archer());
//		subArmy.addUnit(new Archer());
//		subArmy.addUnit(new Archer());
//		mainArmy.addUnit(subArmy);
//		System.out.println(mainArmy.bombardStrength());
		String a = "HoangAnh";
		
		Integer a2 = new Integer(10);
		
		String b = "HoangAnh";
		Unit a1 = new Archer();
		Unit b1 = new Archer();
		
		if( a == b ) {
			System.out.println("Bang nhau");
		}
	}
}
