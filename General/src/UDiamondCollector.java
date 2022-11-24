import java.io.*;
import java.util.Scanner;

public class UDiamondCollector {
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n, k, count, max;
	static int[] a;
	
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
		k = in.nextInt();in.nextLine();
		
		a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = in.nextInt(); in.nextLine();
		}
		
	}
	
	static void solve() {
		
		count = 0;
		max = 0;
		
		for(int i = 0; i<n; i++) {
			
			for(int j = i; j<n; j++) {
				
				if(Math.abs(a[i] + a[j])<k || Math.abs(a[i] + a[j])==k) {
					count++;
				}
				
				max = Math.max(max, count);
			}
		}
		
		out.println(max);
	}

}
