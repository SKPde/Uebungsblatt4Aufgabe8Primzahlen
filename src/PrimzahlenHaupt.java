import java.util.Scanner;
import java.util.TreeSet;

public class PrimzahlenHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = 0;
		while (n < 3) {
			System.out.print("Bitte Zahl eingeben: ");
			n = Integer.parseInt(in.next());
		}

		TreeSet<Integer> t = new TreeSet<Integer>();

		for (int x = 2; x <= n; x++) {
			t.add(x);
		}

		TreeSet<Integer> s = new TreeSet<Integer>();

		int p = 2;
		
		while(p < n) {
			
			int y = 2;
			
			while(y*p <= n) {
				
				s.add(p*y);
				y++;
			}
			
			if(p == 2) {
				p = 3;
			} else {
				p += 2;
			}
		}
		
		System.out.println(s);

		for(int x = 2; x <= n; x++) {
			if(s.contains(x)) {
				t.remove(x);
			}
		}
		
		System.out.println(t);
	}

}
