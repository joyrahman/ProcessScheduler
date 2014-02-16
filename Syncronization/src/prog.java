


public class prog {

	public static void main(String[] args) {
		
		Debugger dbg 		= new Debugger();
		Helper helper 		= new Helper(args);
		
		/*	System Wide Parameters & User Inputs	*/
		int quantum			=helper.getQuantum();
		String algorithm	=helper.getValue("alg");
		String input		=helper.getValue("input");
		
		/*	------------------------------------	*/
		/*	BEGIN DEBUG DATA						*/
		dbg.print(algorithm);										/*debug data*/
		dbg.print(quantum);											/*debug data*/
		/*	------------------------------------	*/
		/*	END DEBUG DATA							*/

		
		/*Creation of Job Thread*/
		
		Process p1 = new Process("1 10 20 10 50 20 40 10");
		dbg.print(p1);
		
		/*Creation of CPU Thread*/
		
		/*Creation of IP Thread*/
		
		/*Generate Output once completion of the program*/
		

		


		
		
		

	}

}
