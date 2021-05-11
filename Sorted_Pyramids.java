package SortedPyramids;

import java.util.Comparator;

public class Sorted_Pyramids  implements Comparator<Sort>{

	@Override
	public int compare(Sort o1, Sort o2) {
		// TODO Auto-generated method stub
		return  Double.valueOf(o1.getHeight()).compareTo(o2.getHeight());
	}
	
	
	

}
