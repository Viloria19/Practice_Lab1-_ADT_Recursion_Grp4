
public class Test {

	public static void main(String[] args) {
		Date d1 = new Date(14, 19, 1996);
		Date d2 = new Date(5,3,2005);
		
		if(d1.compare(d2) == -1) {
			System.out.println(d1 + " is the latest date");
		}else if(d1.compare(d2) == 1) {
			System.out.println(d2 + " is the latest date");
		}else {
			System.out.println("unknown");
		}
		

	}

	}

