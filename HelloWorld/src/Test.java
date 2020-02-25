public class Test{
	
	public static int facuFunc(int n) {
		int erg = 1;
		for (int i = 1; i <= n; i++) {
			erg = erg * i;
		}
		return erg;
		
	}
	public static void main (String[] args) {
		System.out.println(facuFunc(3));
	
	}
}