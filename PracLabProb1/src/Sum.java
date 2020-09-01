import java.util.ArrayList;

public class Sum {
	
ArrayList<Integer> listahan = new ArrayList();
	
	int sum(ArrayList<Integer> listahan) {
		int sum = 0;
		for(int i :listahan) {
		sum = sum + i;     // or sum += i;
		}
		return sum;
	}
}
