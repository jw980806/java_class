package myobj.comp;

import java.util.Comparator;

import myobj.fruit.Mango;

public class MangoComparator implements Comparator<Mango> {

	@Override
	public int compare(Mango o1, Mango o2) {
		if(o1.kcal > o2.kcal) {
			return 1;
		} else if (o1.kcal < o2.kcal) {
			return -1;
		} else {
			if(o1.dangdo > o1.dangdo) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
