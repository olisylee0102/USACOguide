import java.io.*;
import java.util.Scanner;
public class UShellGame {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n, a, b, g, count, ans;
	static String[] nums;
	static boolean[] shells;
	

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		n = in.nextInt();
		String [] nums = new String[3];
		boolean[] shells = new boolean[3];
		ans = 0;
		count = 0;
	}
	
	static void solve() {
		
		for(int i = 0; i<3; i++) {
			
			for(int j = 0; j<n; j++) {
				nums = in.nextLine().split(" ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);
				g = Integer.parseInt(nums[2]);
			}
			
			shells[i] = true;
			if(i==a) {
				shells[a] = false;
				shells[b] = true;
			}
			if(i==b) {
				shells[b] = false;
				shells[a] = true;
			}
			
			if(shells[g]==true) count++;
			
			ans = Math.max(ans, count);
			count = 0;
		}
		
		out.println(ans);
		
	}
	


}
