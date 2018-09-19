import javax.swing.JOptionPane;

public class methods {
	public static void main(String[] args) {
		  weRock();
		  rocker("I love");
		  truth("Chad Kroeger");
		  truth("Lil' Pump");
		  truth("Billy Joel");
		  echo("echo");
		  repeat("zoinks!", 10);
		  String theBest = getTheBestCoder();
		  System.out.println("\n" + theBest);
		  System.out.println(sum(100,320));
	} 
	static void weRock() {
		  System.out.println("The League Rocks!");
		}
		static void rocker(String a) {
		  System.out.println(a + " rocks!");
		}
		static void truth(String singer) {
		  if(singer.equalsIgnoreCase("Chad Kroeger") || singer.equalsIgnoreCase("Lil' Pump")) {
		     System.out.println(singer + " is awesome");
		  }else {
		     System.out.println(singer + " is not very talented and produces really bland music I don't really enjoy listening to " + singer + " that much");
		  }
		}
		static void echo(String oof) {
		  System.out.println(oof + " " + oof);
		}
		static void repeat(String oof, int a) {
		  for(int i = 0;i < a;i++) {
		  System.out.print(oof + " ");
		  }
		}
		static String getTheBestCoder() {
		  return JOptionPane.showInputDialog("Who is the best programmer?");
		}
		static int sum(int a, int b) {
		  return(a+b);
		}
}
