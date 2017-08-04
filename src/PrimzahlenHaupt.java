import java.util.Scanner;
import java.util.TreeSet;

public class PrimzahlenHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = 0;
		while(n < 3) {
			System.out.print("Bitte Zahl eingeben: ");
			n = Integer.parseInt(in.next());
		}
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		for(int x = 2; x <= n; x++) {
			t.add(x);
		}
			System.out.println(t);
		
		
	}

}
