
public class table {

	public static void main(String[] args) {
	     System.out.println(tos(15));
}

	     public static String tos (int i){
	             if (i == 1)
	                     return i + "  " + i * i + "\n";
	             else 
	                     return i + "  " + i * i + "\n" + tos(i-1);
	     }
}
