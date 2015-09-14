package khoa.doan;
import hoanganh.le.*;

public class Khoa extends Unit {
	
	@Override
	public int bombardStrength() {
		// TODO Auto-generated method stub
		return age;
	}
	public static void main(String[] args) {
		Unit a = new Khoa();
		System.out.println(a.bombardStrength());
	}
}
