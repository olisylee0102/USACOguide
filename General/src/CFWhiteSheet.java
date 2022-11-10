import java.io.*;
import java.util.Scanner;

public class CFWhiteSheet {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int x1t, x2t, x3t, x1b, x2b, x3b, y1t, y2t, y3t, y1b, y2b, y3b;
	static int w, h, w1, w2, h1, h2, ls, rs, top, bottom, min1, min2, min;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		x1b = in.nextInt();
		x1t = in.nextInt();
		y1b = in.nextInt();
		y1t = in.nextInt();
		x2b = in.nextInt();
		x2t = in.nextInt();
		y2b = in.nextInt();
		y2t = in.nextInt();
		x3b = in.nextInt();
		x3t = in.nextInt();
		y3b = in.nextInt();
		y3t = in.nextInt();
		
		w = x1t - x1b;
		h = y1t - y1b;
		w1 = x2t - x2b;
		h1 = y2t - y2b;
		w2 = x3t - x3b;
		h2 = y3t - y3b;
		
		
		
	}
	
	static void solve() {
		
		if(w1 + w2 < w || w1 + w2 == w) out.println("NO");
		if(h1 + h2 < h || h1 + h2 < h) out.println("NO");
		
		else{
			ls = x1b;
			rs = w-x1t;
			
			min1 = Math.min(w2 - ls, w2 - rs);
			
			if(min1<0) min1 = 0;
			
			top = h - y1t;
			bottom = y1b;
			
			min2 = Math.min(top-h2, bottom-h2);
			
			if(min2<0) min2 = 0;
			
			min = Math.min(min1,  min2);
			
			if(min!=0) out.println("YES");
			else out.println("NO");
			
		}
		
	}

}
