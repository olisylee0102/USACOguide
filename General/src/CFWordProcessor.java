import java.io.*;
import java.util.Scanner;
public class CFWordProcessor {

	static String file = "word";
	static Scanner in;
	static PrintWriter out;
	static int n, k;
	static String str;
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
		
		n = in.nextInt();
		k = in.nextInt();
		String str = in.nextLine();
		
	}
	
	static void solve() {
		
		arr = str.split(" ");
		out.print(arr[0]);
		
		for(int i = 1; i<n; i++) {
			
			int temp = arr[0].length();
			int length = arr[i].length();
			int sum = temp + length;
			
			if(sum<=k) {
				
				out.print(" " + arr[i]);
				temp+=length;
				
			}else {
				
				out.println(" " + arr[i]);
				temp = length;
			}
		}
		
		
		
	}

}
