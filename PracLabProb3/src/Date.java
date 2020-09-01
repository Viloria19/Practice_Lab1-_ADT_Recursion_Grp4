
public class Date {
	int month;
	int day;
	int year;
	
	Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}
	
	public int compare(Object arg) {
		Date inpar = (Date) arg;
		if(this.year < inpar.year) {
			return 1;
		}else if(this.year > inpar.year) {
			return -1;
		}else {
			
			if(this.month < inpar.month) {
				return 1;
			}else if(this.month > inpar.month) {
				return -1;
			}else {
				if(this.day < inpar.day) {
					return 1;
				}else if(this.day > inpar.day) {
					return -1;
				}else {
					return 0;
				}
			}
			
			
		}
	}
	
	
	
	public String toString() {
		return ""+this.month + "/" + this.day+ "/"+ this.year;
	}
}
