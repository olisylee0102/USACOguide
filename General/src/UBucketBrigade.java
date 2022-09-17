import java.io.*;
import java.util.Scanner;

public class UBucketBrigade {
	
	static String file = "buckets";
	static Scanner in;
	static PrintWriter out;
	static int bx, by, lx, ly;
	static String[] arr;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		arr = in.next().split("");
		
	}
	
	static void solve() {
		
		for(int i=0; i<10; i++) {
			
			for(int j = 0; j<10; j++) {
				
				if(arr[i][j] == 'B') {
					bx = i;
					by = j;
				}else if(arr[i][j] == 'L') {
					lx = i;
					ly = j;
				}
				
				
			}
		}
		
		out.print(lx-bx + ly-by);
		
	}

}
