import java.io.*;
import java.util.Scanner;

public class UBlockGame {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static boolean[] contain;
	static int[] count;
	static String alph, words;
	static int n;
	
	

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
		
		contain = new boolean[26];
		
		count = new int[26];
		for(int i = 0; i<26; i++) {
			count[i] = 0;
		}
		
		alph = "abcdefghijklmnopqrstuvwxyz";
		
	}
		
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			
			words = in.nextLine();
			
			for(int j = 0; j<26; j++) {
				
				if(words.indexOf(alph.charAt(j))!=-1) contain[j] = true;
			}
			
			for(int j = 0; j<26; j++) {
				if(contain[j] = true) count[j]++;
			}
		}
		
		for(int i = 0; i<26; i++) {
			out.println(count[i]);
		}
		
		
	}

}
