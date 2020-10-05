
	 /* This program is just testing your understanding of parameter passing.
	 */
	import acm.program.*;
	public class Hogwarts extends ConsoleProgram {
	 public void run() {
	 bludger(2001);
	 }
	 
	 
	 private void bludger(int y) { //int y = 2001
	 int x = y / 1000; // int x = 2
	 int z = (x + y); // int z = 2003
	 x = quaffle(z, y);//x=1001
	 println("bludger: x = " + x + ", y = " + y + ", z = " + z); //x=1001, y=2001, z=2003
	 }
	 private int quaffle(int x, int y) { //int x = 2003 , int y = 2001
	 int z = snitch(x + y, y); //int z = 10
	 y /= z; //int y = 1
	 println("quaffle: x = " + x + ", y = " + y + ", z = " + z); // x=2003 y=1 z=1001
	 return z; //int z = 1001
	 }
	 private int snitch(int x, int y) { // int x = 4004 int y = 2001
	 y = x / (x % 10); // int y=1001
	 println("snitch: x = " + x + ", y = " + y); //x = 4004, y = 1001
	 return y; // y = 1001
	 }
	}

