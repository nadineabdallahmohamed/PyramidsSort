package SortedPyramids;

import java.util.Comparator;

public class Pyramidsort  implements Comparator<Pyramid>{

	@Override
	public int compare(Pyramid o1, Pyramid o2) {
		// TODO Auto-generated method stub
		return  Double.valueOf(o1.getHeight()).compareTo(o2.getHeight());
	}
	
	
	

}
