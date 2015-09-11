package hoanganh.le;

import java.util.ArrayList;

abstract class Unit {
	abstract int bombardStrength();
}

class Archer extends Unit {

	@Override
	int bombardStrength() {
		// TODO Auto-generated method stub
		return 4;
	}

}

class LaserCanonUnit extends Unit {

	@Override
	int bombardStrength() {
		// TODO Auto-generated method stub
		return 31;
	}

}

class Army extends Unit {
	private ArrayList<Unit> units = new ArrayList<Unit>();

	@Override
	int bombardStrength() {
		// TODO Auto-generated method stub
		int ret = 0;
		for (Unit unit : units) {
			ret += unit.bombardStrength();
		}
		return ret;
	}

	public void addUnit(Unit unit) {
		units.add(unit);
	}

}