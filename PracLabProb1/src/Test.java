import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Sum i = new Sum();
		
		ArrayList<Integer> listahan = new ArrayList();
		listahan.add(6);
		listahan.add(12);
		listahan.add(18);
		
		System.out.println(i.sum(listahan));
	}
}
