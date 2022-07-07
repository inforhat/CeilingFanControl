package FanControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	/**
	 * This is for Ceiling fan control demo purpose only
	 * The user simply enters 1 for speed and 2 for direction changing.
	 * @author Tuan Hoang
	 * 
	 */
	public class Demo {

		/**1
		 * 
		 * @param args
		 * @return void
		 * @update 2022 July 7
		 */
		public static void main(String[] args) {
			 final String SPEED = "1"; // for speed changing
			 final String DIR = "2";  // for direction changing
			 
			 CeilingFanSpeed chain = new CeilingFanSpeed();
			 CeilingFanDirection dir = new CeilingFanDirection();
		        while (true) {
		            System.out.print("Press 1 (Speed) or 2 (Direction) then ENTER to control ceilingfan.");
		            String line = getLine();
		            if  (line.compareTo(SPEED)==0)
		            	chain.pull();
		            if  (line.compareTo(DIR)==0)
		            	dir.pull();
		        }
		}
		/*
		 * @param none
		 * @return valid choice "1" for SPEED and "2" for Direction
		 * */
		 static String getLine() {
		        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		        String line = null;
		        try {
		            line = in.readLine();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		        return line;
		    }
	}

