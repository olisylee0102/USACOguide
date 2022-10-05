import java.io.*;
import java.util.Scanner;
public class ULifeguards {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n,x,count,temp, a, b;
	static boolean[] time;
	

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
		count = 0;
		temp = 0;
		
		time = new boolean[1000];
		
	
	}
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			x = i;
			
			for(int j = 0; j<x; j++) {
				
				for(int k = 0; k<n; k++) {
					a = in.nextInt();
					b = in.nextInt();
					
					for(int p = a; p<b; p++) {
						time[p] = true;
					}
				}
			}
			
			for(int j = x+1; j<n; j++) {
				
				for(int k = 0; k<n; k++) {
					a = in.nextInt();
					b = in.nextInt();
					
					for(int p = a; p<b; p++) {
						time[p] = true;
					}
				}
			}
			
			for(int j = 0; j<1000; j++) {
				if(time[j] = true) temp++;
				count = Math.max(count, temp);
			}
		}
		
		out.println(count);
		
		
	}

}
