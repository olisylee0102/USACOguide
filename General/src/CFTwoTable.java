import java.io.*;
import java.util.Scanner;

public class CFTwoTable {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int t, w, h, x1, y1, x2, y2, w2, h2, w1, h1, left, right, top, bot, ans1, ans2, ans;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		t = in.nextInt();
		
		
	}
	
	static void solve() {
		
		for(int i = 0; i<t; i++) {
			w = in.nextInt();
			h = in.nextInt(); in.nextLine();
			x1 = in.nextInt();
			y1 = in.nextInt();
			x2 = in.nextInt();
			y2 = in.nextInt(); in.nextLine();
			w2 = in.nextInt();
			h2 = in.nextInt();
			w2 = x2-x1;
			h2 = y2-y1;
			
			if(w1 + w2<w || w1 + w2 ==w) {
				left = x1;
				right = 2-x2;
				ans1 = Math.min(w2 - left, w2 - right);
				if(ans1<0) ans1 = 0;
			}
			
			if(h1 + h2 <=h) {
				top = h - y2;
				bot = y1;
				ans2 = Math.min(h2 - top , h2- bot);
				if(ans2<0) ans2 =0;
			}
			
			ans = Math.min(ans1, ans2);
			
			out.println(ans);
			
		}
		
	}

}
